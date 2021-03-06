/**
 * Copyright (c) 2009-2012, Lukas Eder, lukas.eder@gmail.com
 *                             Christopher Deckers, chrriis@gmail.com
 * All rights reserved.
 *
 * This software is licensed to you under the Apache License, Version 2.0
 * (the "License"); You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 * . Redistributions of source code must retain the above copyright notice, this
 *   list of conditions and the following disclaimer.
 *
 * . Redistributions in binary form must reproduce the above copyright notice,
 *   this list of conditions and the following disclaimer in the documentation
 *   and/or other materials provided with the distribution.
 *
 * . Neither the name "jOOQ" nor the names of its contributors may be
 *   used to endorse or promote products derived from this software without
 *   specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE
 * POSSIBILITY OF SUCH DAMAGE.
 */
package org.jooq.debug.console.remote;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.jooq.debug.Breakpoint;
import org.jooq.debug.BreakpointHit;
import org.jooq.debug.BreakpointHitHandler;
import org.jooq.debug.LocalDebugger;
import org.jooq.debug.LocalStatementExecutor;
import org.jooq.debug.LoggingListener;
import org.jooq.debug.QueryLoggingData;
import org.jooq.debug.ResultSetLoggingData;
import org.jooq.debug.StatementExecution;
import org.jooq.debug.StatementExecutor;
import org.jooq.debug.StatementMatcher;
import org.jooq.debug.console.DatabaseDescriptor;
import org.jooq.debug.console.remote.messaging.CommunicationInterface;

/**
 * @author Christopher Deckers
 */
class ServerDebugger extends LocalDebugger {

    public ServerDebugger(DatabaseDescriptor databaseDescriptor) {
        super(databaseDescriptor);
    }

    private CommunicationInterface communicationInterface;

    void setCommunicationInterface(CommunicationInterface communicationInterface) {
        this.communicationInterface = communicationInterface;
    }

    private void setLoggingActive(boolean isActive) {
        if(isActive) {
            setLoggingListener(new LoggingListener() {
                @Override
                public void logQueries(QueryLoggingData queryLoggingData) {
                    new ClientDebugger.CMC_logQueries().asyncExec(communicationInterface, queryLoggingData);
                }
                @Override
                public void logResultSet(int sqlQueryDebuggerDataID, ResultSetLoggingData resultSetLoggingData) {
                    new ClientDebugger.CMC_logResultSet().asyncExec(communicationInterface, sqlQueryDebuggerDataID, resultSetLoggingData);
                }
            });
        } else {
            setLoggingListener(null);
        }
    }

    @SuppressWarnings("serial")
    static class CMS_setLoggingActive extends ServerDebuggerCommandMessage {
        @Override
        public Object run(Object[] args) {
            getDebugger().setLoggingActive((Boolean)args[0]);
            return null;
        }
    }

    private void setBreakpointHitHandlerActive(boolean isActive) {
        if(isActive) {
            setBreakpointHitHandler(new BreakpointHitHandler() {
                @Override
                public void processBreakpointBeforeExecutionHit(BreakpointHit breakpointHit) {
                    BreakpointHit modifiedBreakpointHit = (BreakpointHit)new ClientDebugger.CMC_processBreakpointBeforeExecutionHit().syncExec(communicationInterface, breakpointHit);
                    if(modifiedBreakpointHit != null) {
                        breakpointHit.setExecutionType(modifiedBreakpointHit.getExecutionType(), modifiedBreakpointHit.getSql());
                    }
                }
                @Override
                public void processBreakpointAfterExecutionHit(BreakpointHit breakpointHit) {
                    new ClientDebugger.CMC_processBreakpointAfterExecutionHit().syncExec(communicationInterface, breakpointHit);
                }
            });
        } else {
            setBreakpointHitHandler(null);
        }
    }

    @SuppressWarnings("serial")
    static class CMS_setLoggingStatementMatchers extends ServerDebuggerCommandMessage {
        @Override
        public Object run(Object[] args) {
            getDebugger().setLoggingStatementMatchers((StatementMatcher[])args[0]);
            return null;
        }
    }

    @SuppressWarnings("serial")
    static class CMS_setBreakpoints extends ServerDebuggerCommandMessage {
        @Override
        public Object run(Object[] args) {
            Breakpoint[] breakpoints = (Breakpoint[])args[0];
            if(breakpoints != null) {
                for(Breakpoint breakpoint: breakpoints) {
                    // Serialization has a cache, assuming objects are immutable. We have to reset our internal states.
                    breakpoint.reset();
                }
            }
            getDebugger().setBreakpoints(breakpoints);
            return null;
        }
    }

    @SuppressWarnings("serial")
    static class CMS_addBreakpoint extends ServerDebuggerCommandMessage {
        @Override
        public Object run(Object[] args) {
            Breakpoint breakpoint = (Breakpoint)args[0];
            // Serialization has a cache, assuming objects are immutable. We have to reset our internal states.
            breakpoint.reset();
            getDebugger().addBreakpoint(breakpoint);
            return null;
        }
    }

    @SuppressWarnings("serial")
    static class CMS_modifyBreakpoint extends ServerDebuggerCommandMessage {
        @Override
        public Object run(Object[] args) {
            Breakpoint breakpoint = (Breakpoint)args[0];
            // Serialization has a cache, assuming objects are immutable. We have to reset our internal states.
            breakpoint.reset();
            getDebugger().modifyBreakpoint(breakpoint);
            return null;
        }
    }

    @SuppressWarnings("serial")
    static class CMS_removeBreakpoint extends ServerDebuggerCommandMessage {
        @Override
        public Object run(Object[] args) {
            getDebugger().removeBreakpoint((Breakpoint)args[0]);
            return null;
        }
    }

    @SuppressWarnings("serial")
    static class CMS_setBreakpointHitHandlerActive extends ServerDebuggerCommandMessage {
        @Override
        public Object run(Object[] args) {
            getDebugger().setBreakpointHitHandlerActive((Boolean)args[0]);
            return null;
        }
    }

    @SuppressWarnings("serial")
    static class CMS_isExecutionSupported extends ServerDebuggerCommandMessage {
        @Override
        public Object run(Object[] args) {
            return getDebugger().isExecutionSupported();
        }
    }

    private Map<Integer, StatementExecutor> idToStatementExecutorMap = new HashMap<Integer, StatementExecutor>();

    private void createStatementExecutor(int id, Long breakpointHitThreadID) {
        LocalStatementExecutor statementExecutor;
        if(breakpointHitThreadID == null) {
            statementExecutor = createStatementExecutor();
        } else {
            statementExecutor = createBreakpointHitStatementExecutor(breakpointHitThreadID);
        }
        synchronized (idToStatementExecutorMap) {
            idToStatementExecutorMap.put(id, statementExecutor);
        }
    }

    private StatementExecutor getStatementExecutor(int id) {
        synchronized (idToStatementExecutorMap) {
            return idToStatementExecutorMap.get(id);
        }
    }

    private StatementExecutor removeStatementExecutor(int id) {
        synchronized (idToStatementExecutorMap) {
            return idToStatementExecutorMap.remove(id);
        }
    }

    @SuppressWarnings("serial")
    static class CMS_createServerStatementExecutor extends ServerDebuggerCommandMessage {
        @Override
        public Object run(Object[] args) {
            int id = (Integer)args[0];
            Long breakpointHitThreadID = (Long)args[1];
            getDebugger().createStatementExecutor(id, breakpointHitThreadID);
            return null;
        }
    }

    @SuppressWarnings("serial")
    static class CMS_doStatementExecutorExecution extends ServerDebuggerCommandMessage {
        @Override
        public Object run(Object[] args) {
            int id = (Integer)args[0];
            String sql = (String)args[1];
            int maxRSRowsParsing = (Integer)args[2];
            int retainParsedRSDataRowCountThreshold = (Integer)args[3];
            StatementExecution statementExecution = getDebugger().getStatementExecutor(id).execute(sql, maxRSRowsParsing, retainParsedRSDataRowCountThreshold);
            return new ClientStatementExecution(statementExecution);
        }
    }

    @SuppressWarnings("serial")
    static class CMS_stopStatementExecutorExecution extends ServerDebuggerCommandMessage {
        @Override
        public Object run(Object[] args) {
            int id = (Integer)args[0];
            getDebugger().removeStatementExecutor(id).stopExecution();
            return null;
        }
    }

    @SuppressWarnings("serial")
    static class CMS_getStatementExecutorTableNames extends ServerDebuggerCommandMessage {
        @Override
        public Object run(Object[] args) {
            int id = (Integer)args[0];
            return getDebugger().getStatementExecutor(id).getTableNames();
        }
    }

    @SuppressWarnings("serial")
    static class CMS_getStatementExecutorTableColumnNames extends ServerDebuggerCommandMessage {
        @Override
        public Object run(Object[] args) {
            int id = (Integer)args[0];
            return getDebugger().getStatementExecutor(id).getTableColumnNames();
        }
    }

    void cleanup() {
        synchronized (idToStatementExecutorMap) {
            for(StatementExecutor executor: idToStatementExecutorMap.values()) {
                executor.stopExecution();
            }
            idToStatementExecutorMap.clear();
        }
    }

    private Map<Long, List<StatementExecutor>> threadIDToStatementExecutorList = new HashMap<Long, List<StatementExecutor>>();

    @Override
    public LocalStatementExecutor createBreakpointHitStatementExecutor(long threadID) {
        LocalStatementExecutor statementExecutor = super.createBreakpointHitStatementExecutor(threadID);
        synchronized (threadIDToStatementExecutorList) {
            List<StatementExecutor> list = threadIDToStatementExecutorList.get(threadID);
            if(list == null) {
                list = new ArrayList<StatementExecutor>();
                threadIDToStatementExecutorList.put(threadID, list);
            }
            list.add(statementExecutor);
        }
        return statementExecutor;
    }

    @Override
    protected void performThreadDataCleanup(long threadID) {
        List<StatementExecutor> list;
        synchronized (threadIDToStatementExecutorList) {
            list = threadIDToStatementExecutorList.remove(threadID);
        }
        if(list != null) {
            for(StatementExecutor statementExecutor: list) {
                statementExecutor.stopExecution();
            }
        }
    }

}