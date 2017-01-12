// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   MergeSort.java

package io.github.ducduyn31.sorttest.algorithms.sort;

import java.io.File;
import java.io.FileNotFoundException;

// Referenced classes of package io.github.ducduyn31.sorttest.algorithms.sort:
//            Sorter

public class MergeSort extends Sorter
{

    public MergeSort(File file)
    {
        super(file);
    }

    public MergeSort(File file, boolean compare)
    {
        super(file, compare);
    }

    public MergeSort(String path)
        throws FileNotFoundException
    {
        super(path);
    }

    public MergeSort(String path, boolean compare)
        throws FileNotFoundException
    {
        super(path, compare);
    }

    public String sort()
    {
        cs = getSequence().toCharArray();
        timeMark();
        helper = new char[cs.length];
        divide(0, cs.length - 1);
        timeMark();
        return String.valueOf(cs);
    }

    private void divide(int left, int right)
    {
        if(left < right)
        {
            int mid = (left + right) / 2;
            divide(left, mid);
            divide(mid + 1, right);
            sortMerged(left, right);
        }
    }

    private void sortMerged(int left, int right)
    {
        int mid = (left + right) / 2;
        for(int i = left; i <= right; i++)
            helper[i] = cs[i];

        int pA = left;
        int pB = mid + 1;
        int k;
        for(k = left; pA < mid + 1 && pB < right + 1; k++)
            if((helper[pA] < helper[pB]) == StoL)
            {
                cs[k] = helper[pA];
                pA++;
            } else
            {
                cs[k] = helper[pB];
                pB++;
            }

        for(; pA < mid + 1; pA++)
        {
            cs[k] = helper[pA];
            k++;
        }

    }

    public String getName()
    {
        return "Merge Sort";
    }

    private char helper[];
    private char cs[];
}
