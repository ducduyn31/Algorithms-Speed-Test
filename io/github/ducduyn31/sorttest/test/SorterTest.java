// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SorterTest.java

package io.github.ducduyn31.sorttest.test;

import io.github.ducduyn31.sorttest.algorithms.sort.QuickSort;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class SorterTest
{

    public SorterTest()
    {
    }

    public static void main(String args[])
    {
        try
        {
            QuickSort qs = new QuickSort("C:/Users/Asus/Desktop/a.txt", true);
            System.out.println(qs.getSequence());
            System.out.println(qs.sort());
            System.out.println(qs.calculateTimeMillis());
        }
        catch(FileNotFoundException e)
        {
            e.printStackTrace();
        }
    }
}
