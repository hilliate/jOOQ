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
package org.jooq.debug.console;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import org.jooq.debug.BreakpointHit;
import org.jooq.debug.BreakpointHit.ExecutionType;
import org.jooq.debug.Debugger;
import org.jooq.debug.StatementExecutor;
import org.jooq.debug.StatementExecutorCreator;
import org.jooq.debug.console.DebuggerPane.BreakpointHitNode;

import org.fife.ui.rtextarea.RTextScrollPane;

/**
 * @author Christopher Deckers
 */
@SuppressWarnings("serial")
public class BreakpointHitEditor extends JPanel {

    private BreakpointHit breakpointHit;
    private JCheckBox replaceStatementCheckBox;
    private JScrollPane replacementSQLTextAreaScrollPane;
    private SqlTextArea replacementSQLTextArea;

    public BreakpointHitEditor(final Debugger debugger, final DebuggerPane debuggerPane, final BreakpointHitNode breakpointHitNode) {
        super(new BorderLayout());
        setOpaque(false);
        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.setOpaque(false);
        JPanel breakpointHitExecutionPane = new JPanel(new GridBagLayout());
        breakpointHitExecutionPane.setBorder(BorderFactory.createEmptyBorder(2, 5, 5, 5));
        breakpointHitExecutionPane.setOpaque(false);
        breakpointHit = breakpointHitNode.getUserObject();
        int y = 0;
        breakpointHitExecutionPane.add(new JLabel("Statement:"), new GridBagConstraints(0, y++, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(0, 0, 0, 0), 0, 0));
        SqlTextArea sqlTextArea = new SqlTextArea();
        String sql = breakpointHit.getSql();
        String parameterDescription = breakpointHit.getParameterDescription();
        if(parameterDescription != null) {
            sql += "\n -> " + parameterDescription;
        }
        sqlTextArea.setText(sql + "\n");
        sqlTextArea.setCaretPosition(0);
        breakpointHitExecutionPane.add(new RTextScrollPane(sqlTextArea), new GridBagConstraints(0, y++, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(0, 0, 0, 0), 0, 0));
        if(breakpointHit.isBeforeExecution()) {
            replaceStatementCheckBox = new JCheckBox("Replace with statement");
            replaceStatementCheckBox.setOpaque(false);
            replaceStatementCheckBox.addItemListener(new ItemListener() {
                @Override
                public void itemStateChanged(ItemEvent e) {
                    adjustStates();
                }
            });
            breakpointHitExecutionPane.add(replaceStatementCheckBox, new GridBagConstraints(0, y++, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 0, 0), 0, 0));
            replacementSQLTextArea = new SqlTextArea();
            replacementSQLTextAreaScrollPane = new RTextScrollPane(replacementSQLTextArea);
            breakpointHitExecutionPane.add(replacementSQLTextAreaScrollPane, new GridBagConstraints(0, y++, 1, 1, 1, 1, GridBagConstraints.WEST, GridBagConstraints.BOTH, new Insets(2, 20, 0, 0), 0, 0));
        }
        JPanel executionTypePane = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        // For now, this choice is not exposed.
        executionTypePane.setVisible(breakpointHit.isBeforeExecution());
        executionTypePane.setOpaque(false);
        ButtonGroup executionTypeGroup = new ButtonGroup();
        final JRadioButton executeTypeNoneRadioButton = new JRadioButton("Execute");
        executeTypeNoneRadioButton.setOpaque(false);
        executeTypeNoneRadioButton.setSelected(true);
        executionTypeGroup.add(executeTypeNoneRadioButton);
        executionTypePane.add(executeTypeNoneRadioButton);
        final JRadioButton executeTypeBreakRadioButton = new JRadioButton("Execute and break");
        executeTypeBreakRadioButton.setOpaque(false);
        executionTypeGroup.add(executeTypeBreakRadioButton);
        executionTypePane.add(executeTypeBreakRadioButton);
        final JRadioButton executeTypeSkipRadioButton = new JRadioButton("Skip");
        executeTypeSkipRadioButton.setOpaque(false);
        executionTypeGroup.add(executeTypeSkipRadioButton);
        executionTypePane.add(executeTypeSkipRadioButton);
        final JRadioButton executeTypeFailRadioButton = new JRadioButton("Throw exception");
        executeTypeFailRadioButton.setOpaque(false);
        executionTypeGroup.add(executeTypeFailRadioButton);
        executionTypePane.add(executeTypeFailRadioButton);
        breakpointHitExecutionPane.add(executionTypePane, new GridBagConstraints(0, y++, 1, 1, 0, 0, GridBagConstraints.WEST, GridBagConstraints.NONE, new Insets(5, 0, 0, 0), 0, 0));
        JPanel buttonPane = new JPanel(new FlowLayout(FlowLayout.CENTER, 0, 0));
        buttonPane.setOpaque(false);
        buttonPane.setBorder(BorderFactory.createEmptyBorder(5, 5, 0, 5));
        JButton applyButton = new JButton("Proceed");
        applyButton.setOpaque(false);
        applyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(breakpointHit.isBeforeExecution()) {
                    String replacementSQL = null;
                    ExecutionType executionType = ExecutionType.RUN;
                    if(executeTypeNoneRadioButton.isSelected()) {
                        executionType = ExecutionType.RUN;
                        replacementSQL = replaceStatementCheckBox.isSelected()? replacementSQLTextArea.getText(): null;
                    } else if(executeTypeBreakRadioButton.isSelected()) {
                        executionType = ExecutionType.STEP_THROUGH;
                        replacementSQL = replaceStatementCheckBox.isSelected()? replacementSQLTextArea.getText(): null;
                    } else if(executeTypeSkipRadioButton.isSelected()) {
                        executionType = ExecutionType.RUN_OVER;
                    } else if(executeTypeFailRadioButton.isSelected()) {
                        executionType = ExecutionType.FAIL;
                    }
                    breakpointHit.setExecutionType(executionType, replacementSQL);
                } else {
                    breakpointHit.setExecutionType(ExecutionType.RUN, null);
                }
                debuggerPane.proceedBreakpointHit(breakpointHitNode);
            }
        });
        buttonPane.add(applyButton);
        breakpointHitExecutionPane.add(buttonPane, new GridBagConstraints(0, y, 1, 1, 1, 0, GridBagConstraints.WEST, GridBagConstraints.HORIZONTAL, new Insets(0, 0, 0, 0), 0, 0));
        adjustStates();
        tabbedPane.addTab("Execution", breakpointHitExecutionPane);
        tabbedPane.addTab("Editor", new EditorsPane(new StatementExecutorCreator() {
            @Override
            public StatementExecutor createStatementExecutor() {
                return debugger.createBreakpointHitStatementExecutor(breakpointHit.getThreadID());
            }
        }, false));
        add(tabbedPane);
    }

    private void adjustStates() {
        if(breakpointHit.isBeforeExecution()) {
            replacementSQLTextAreaScrollPane.setVisible(replaceStatementCheckBox.isSelected());
            revalidate();
            repaint();
        }
    }

}
