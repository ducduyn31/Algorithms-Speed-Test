// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HeapTest.java

package io.github.ducduyn31.sorttest.test;

import io.github.ducduyn31.sorttest.Heap;
import java.io.PrintStream;

public class HeapTest
{

    public HeapTest()
    {
    }

    public static void main(String args[])
    {
        Integer a[] = {
            Integer.valueOf(4), Integer.valueOf(7), Integer.valueOf(7), Integer.valueOf(7), Integer.valueOf(5), Integer.valueOf(0), Integer.valueOf(2), Integer.valueOf(3), Integer.valueOf(5), Integer.valueOf(1)
        };
        Heap h = new Heap(a);
        h.heapSort(a);
        System.out.println(h);
    }
}
