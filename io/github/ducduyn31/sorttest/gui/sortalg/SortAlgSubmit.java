// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SortAlgSubmit.java

package io.github.ducduyn31.sorttest.gui.sortalg;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

// Referenced classes of package io.github.ducduyn31.sorttest.gui.sortalg:
//            SortOrder

public class SortAlgSubmit
    implements ActionListener
{

    protected SortAlgSubmit(boolean multiThread, SortOrder order)
    {
        this.multiThread = false;
        this.order = SortOrder.ASCENDING;
        printOutputFile = false;
        outputFile = null;
        this.multiThread = multiThread;
        this.order = order;
    }

    protected SortAlgSubmit(boolean multiThread, SortOrder order, File outputFile)
    {
        this.multiThread = false;
        this.order = SortOrder.ASCENDING;
        printOutputFile = false;
        this.outputFile = null;
        this.multiThread = multiThread;
        printOutputFile = true;
        this.outputFile = outputFile;
    }

    public void actionPerformed(ActionEvent actionevent)
    {
    }

    protected boolean useMultiThread()
    {
        return multiThread;
    }

    private boolean multiThread;
    private SortOrder order;
    private boolean printOutputFile;
    private File outputFile;
}
