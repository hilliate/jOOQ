/**
 * Copyright (c) 2010, Lukas Eder, lukas.eder@gmail.com
 * All rights reserved.
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
 * . Neither the name of the "jOOQ" nor the names of its contributors may be
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
package org.jooq.impl;

import org.jooq.Configuration;
import org.jooq.Record;
import org.jooq.Table;
import org.jooq.TableRecord;

/**
 * A record implementation for a record originating from a single table
 *
 * @author Lukas Eder
 */
public class TableRecordImpl<R extends Record> extends RecordImpl implements TableRecord<R> {

    /**
     * Generated UID
     */
    private static final long       serialVersionUID = -4613985511514503387L;
    private transient Configuration configuration;

    public TableRecordImpl(Configuration configuration, Table<R> table) {
        super(table);

        this.configuration = configuration;
    }

    @SuppressWarnings("unchecked")
    @Override
    public Table<R> getTable() {
        // We can be sure about that cast, as this is the only possibility
        return (Table<R>) getMetaData();
    }

    @Override
    public final Configuration getConfiguration() {
        return configuration;
    }

    protected final Factory create() {
        if (configuration.getConnection() != null) {
            return new Factory(configuration.getConnection(), configuration.getDialect());
        }
        else if (configuration.getDataSource() != null) {
            return new Factory(configuration.getDataSource(), configuration.getDialect());
        }
        else {
            return new Factory(configuration.getDialect());
        }
    }
}