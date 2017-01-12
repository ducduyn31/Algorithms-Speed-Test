// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   InsertionSort.java

package io.github.ducduyn31.sorttest.algorithms.sort;

import java.io.File;
import java.io.FileNotFoundException;

// Referenced classes of package io.github.ducduyn31.sorttest.algorithms.sort:
//            Sorter

public class InsertionSort extends Sorter
{

    public InsertionSort(File file)
    {
        super(file);
    }

    public InsertionSort(File file, boolean compare)
    {
        super(file, compare);
    }

    public InsertionSort(String path)
        throws FileNotFoundException
    {
        super(path);
    }

    public InsertionSort(String path, boolean compare)
        throws FileNotFoundException
    {
        super(path, compare);
    }

    public String sort()
    {
        char cs[] = getSequence().toCharArray();
        timeMark();
        for(int i = 1; i < cs.length; i++)
            if((cs[i] < cs[i - 1]) == StoL)
            {
                for(int j = i; j > 0; j--)
                {
                    if((cs[j] < cs[j - 1]) != StoL)
                        break;
                    char c = cs[j];
                    cs[j] = cs[j - 1];
                    cs[j - 1] = c;
                }

            }

        timeMark();
        return String.valueOf(cs);
    }

    public String getName()
    {
        return "Insertion Sort";
    }
}
