// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SortAlgorithmsPane.java

package io.github.ducduyn31.sorttest.gui.sortalg;

import javax.swing.*;

// Referenced classes of package io.github.ducduyn31.sorttest.gui.sortalg:
//            SortAlgSelectorPane, SortAlgOptionsPane, SortAlgSubmit, SortOrder

public class SortAlgorithmsPane extends JPanel
{

    public SortAlgorithmsPane()
    {
        JLabel lblFilePath = new JLabel("File Path");
        filePathField = new JTextField();
        filePathField.setColumns(10);
        JButton pathOpenButton = new JButton("...");
        javax.swing.JScrollPane scrollPane = new SortAlgSelectorPane();
        JPanel optionsPane = new SortAlgOptionsPane();
        JButton btnStart = new JButton("Start");
        btnStart.addActionListener(new SortAlgSubmit(((SortAlgOptionsPane)optionsPane).getChckbxUseMultiThread().isSelected(), (SortOrder)((SortAlgOptionsPane)optionsPane).getOrderSelector().getSelectedItem()));
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(scrollPane, -2, 142, -2).addGap(18).addComponent(optionsPane, -1, 267, 32767)).addGroup(groupLayout.createSequentialGroup().addComponent(lblFilePath, -2, 49, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(filePathField, -1, 316, 32767).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(pathOpenButton)).addComponent(btnStart, javax.swing.GroupLayout.Alignment.TRAILING, -2, 88, -2)).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(filePathField, -2, -1, -2).addComponent(pathOpenButton).addComponent(lblFilePath, -1, -1, 32767)).addGap(18).addGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(optionsPane, 0, 0, 32767).addComponent(scrollPane, -1, 174, 32767)).addGap(18).addComponent(btnStart).addGap(12)));
        setLayout(groupLayout);
    }

    private JTextField filePathField;
}
