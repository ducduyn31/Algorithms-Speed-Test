// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MainFrame.java

package io.github.ducduyn31.sorttest.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

// Referenced classes of package io.github.ducduyn31.sorttest.gui:
//            TabSelector

public class MainFrame extends JFrame
{

    public static void initial()
    {
        EventQueue.invokeLater(new Runnable() {

            public void run()
            {
                try
                {
                    MainFrame frame = new MainFrame();
                    frame.setVisible(true);
                }
                catch(Exception e)
                {
                    e.printStackTrace();
                }
            }

        }
);
    }

    public MainFrame()
    {
        setTitle("Algorithms Speedtest");
        setDefaultCloseOperation(3);
        setBounds(0, 0, 450, 355);
        setLocationRelativeTo(null);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        javax.swing.JTabbedPane tabbedPane = new TabSelector();
        contentPane.add(tabbedPane, "Center");
    }

    private JPanel contentPane;
    private JTextField filePathField;
}
