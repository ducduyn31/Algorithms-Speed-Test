// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MainApplet.java

package io.github.ducduyn31.sorttest.gui;

import java.awt.Container;
import javax.swing.JApplet;

// Referenced classes of package io.github.ducduyn31.sorttest.gui:
//            TabSelector

public class MainApplet extends JApplet
{

    public MainApplet()
    {
        javax.swing.JTabbedPane tabbedPane = new TabSelector();
        getContentPane().add(tabbedPane, "Center");
    }
}
