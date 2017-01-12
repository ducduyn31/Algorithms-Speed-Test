// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   TabSelector.java

package io.github.ducduyn31.sorttest.gui;

import io.github.ducduyn31.sorttest.gui.sortalg.SortAlgorithmsPane;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabSelector extends JTabbedPane
{

    public TabSelector()
    {
        super(1);
        JPanel sortAlgPane = new SortAlgorithmsPane();
        addTab("Sort Algorithms", null, sortAlgPane, null);
        JPanel findAlgPane = new JPanel();
        addTab("Finding Alorithms", null, findAlgPane, null);
        findAlgPane.setLayout(null);
    }
}
