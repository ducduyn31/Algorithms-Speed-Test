// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SelectionSort.java

package io.github.ducduyn31.sorttest.algorithms.sort;

import java.io.File;
import java.io.FileNotFoundException;

// Referenced classes of package io.github.ducduyn31.sorttest.algorithms.sort:
//            Sorter

public class SelectionSort extends Sorter
{

    public SelectionSort(File file)
    {
        super(file);
    }

    public SelectionSort(File file, boolean compare)
    {
        super(file, compare);
    }

    public SelectionSort(String path)
        throws FileNotFoundException
    {
        super(path);
    }

    public SelectionSort(String path, boolean compare)
        throws FileNotFoundException
    {
        super(path, compare);
    }

    public String sort()
    {
        char cs[] = getSequence().toCharArray();
        timeMark();
        for(int i = 0; i < cs.length - 1; i++)
        {
            int index = i;
            for(int j = i + 1; j < cs.length; j++)
                if((cs[j] < cs[index]) == StoL)
                    index = j;

            char c = cs[i];
            cs[i] = cs[index];
            cs[index] = c;
        }

        timeMark();
        return String.valueOf(cs);
    }

    public String getName()
    {
        return "Selection Sort";
    }
}
