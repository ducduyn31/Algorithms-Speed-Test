// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   BubbleSort.java

package io.github.ducduyn31.sorttest.algorithms.sort;

import java.io.File;
import java.io.FileNotFoundException;

// Referenced classes of package io.github.ducduyn31.sorttest.algorithms.sort:
//            Sorter

public class BubbleSort extends Sorter
{

    public BubbleSort(File file)
    {
        super(file);
    }

    public BubbleSort(File file, boolean compare)
    {
        super(file, compare);
    }

    public BubbleSort(String path)
        throws FileNotFoundException
    {
        super(path);
    }

    public BubbleSort(String path, boolean compare)
        throws FileNotFoundException
    {
        super(path, compare);
    }

    public String sort()
    {
        char cs[] = getSequence().toCharArray();
        timeMark();
        for(int j = 0; j < cs.length - 1; j++)
        {
            for(int i = cs.length - 1; i > j; i--)
                if((cs[i] < cs[i - 1]) == StoL)
                {
                    char c = cs[i];
                    cs[i] = cs[i - 1];
                    cs[i - 1] = c;
                }

        }

        timeMark();
        return String.valueOf(cs);
    }

    public String getName()
    {
        return "Bubble Sort";
    }
}
