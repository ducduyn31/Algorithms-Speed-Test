// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SortAlgOptionsPane.java

package io.github.ducduyn31.sorttest.gui.sortalg;

import javax.swing.*;

// Referenced classes of package io.github.ducduyn31.sorttest.gui.sortalg:
//            SortOrder

public class SortAlgOptionsPane extends JPanel
{

    protected SortAlgOptionsPane()
    {
        chckbxUseMultiThread = new JCheckBox("Use Multi Thread");
        JLabel lblOrder = new JLabel("Order");
        lblOrder.setHorizontalAlignment(0);
        orderSelector = new JComboBox();
        lblOrder.setLabelFor(orderSelector);
        orderSelector.setModel(new DefaultComboBoxModel(SortOrder.values()));
        chckbxPrintOutputFile = new JCheckBox("Print Output File");
        JLabel lblOutputLocation = new JLabel("Output Location");
        outputPathField = new JTextField();
        outputPathField.setColumns(10);
        JButton openOPathButton = new JButton("...");
        chckbxPrintValue = new JCheckBox("Print Value");
        GroupLayout groupLayout = new GroupLayout(this);
        groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addComponent(chckbxPrintOutputFile).addGap(18).addComponent(chckbxPrintValue)).addComponent(chckbxUseMultiThread).addGroup(groupLayout.createSequentialGroup().addComponent(lblOrder, -2, 42, -2).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(orderSelector, -2, 99, -2)).addGroup(groupLayout.createSequentialGroup().addComponent(lblOutputLocation).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(outputPathField, -1, 280, 32767).addGap(18).addComponent(openOPathButton))).addContainerGap()));
        groupLayout.setVerticalGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(groupLayout.createSequentialGroup().addContainerGap().addComponent(chckbxUseMultiThread).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblOrder).addComponent(orderSelector)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(chckbxPrintOutputFile).addComponent(chckbxPrintValue)).addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addGroup(groupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE).addComponent(lblOutputLocation, -1, -1, 32767).addComponent(outputPathField, -2, -1, -2).addComponent(openOPathButton)).addGap(192)));
        setLayout(groupLayout);
    }

    protected JCheckBox getChckbxUseMultiThread()
    {
        return chckbxUseMultiThread;
    }

    protected JComboBox getOrderSelector()
    {
        return orderSelector;
    }

    protected JCheckBox getChckbxPrintOutputFile()
    {
        return chckbxPrintOutputFile;
    }

    protected JCheckBox getChckbxPrintValue()
    {
        return chckbxPrintValue;
    }

    protected JTextField getOutputPathField()
    {
        return outputPathField;
    }

    private JTextField outputPathField;
    private JCheckBox chckbxUseMultiThread;
    private JComboBox orderSelector;
    private JCheckBox chckbxPrintOutputFile;
    private JCheckBox chckbxPrintValue;
}
