// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   HeapSort.java

package io.github.ducduyn31.sorttest.algorithms.sort;

import java.io.File;
import java.io.FileNotFoundException;

// Referenced classes of package io.github.ducduyn31.sorttest.algorithms.sort:
//            Sorter

public class HeapSort extends Sorter
{

    public HeapSort(File file)
    {
        super(file);
    }

    public HeapSort(File file, boolean compare)
    {
        super(file, compare);
    }

    public HeapSort(String path)
        throws FileNotFoundException
    {
        super(path);
    }

    public HeapSort(String path, boolean compare)
        throws FileNotFoundException
    {
        super(path, compare);
    }

    public String sort()
    {
        char cs[] = getSequence().toCharArray();
        timeMark();
        for(int i = (cs.length - 1) / 2; i >= 0; i--)
            sortMaxHeap(i, cs, cs.length - 1);

        for(int i = cs.length - 1; i > 0; i--)
        {
            char c = cs[i];
            cs[i] = cs[0];
            cs[0] = c;
            sortMaxHeap(0, cs, i - 1);
        }

        timeMark();
        return String.valueOf(cs);
    }

    private void sortMaxHeap(int parent, char cs[], int counter)
    {
        int left = 2 * parent + 1;
        int right = 2 * parent + 2;
        int index = parent;
        if(left <= counter && (cs[left] < cs[index]) != StoL)
            index = left;
        if(right <= counter && (cs[right] < cs[index]) != StoL)
            index = right;
        if(index != parent)
        {
            char c = cs[parent];
            cs[parent] = cs[index];
            cs[index] = c;
            sortMaxHeap(index, cs, counter);
        }
    }

    public String getName()
    {
        return "Heap Sort";
    }
}
