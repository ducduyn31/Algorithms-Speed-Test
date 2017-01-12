// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   QuickSort.java

package io.github.ducduyn31.sorttest.algorithms.sort;

import java.io.File;
import java.io.FileNotFoundException;

// Referenced classes of package io.github.ducduyn31.sorttest.algorithms.sort:
//            Sorter

public class QuickSort extends Sorter
{

    public QuickSort(File file)
    {
        super(file);
    }

    public QuickSort(File file, boolean compare)
    {
        super(file, compare);
    }

    public QuickSort(String path)
        throws FileNotFoundException
    {
        super(path);
    }

    public QuickSort(String path, boolean compare)
        throws FileNotFoundException
    {
        super(path, compare);
    }

    public String sort()
    {
        char cs[] = getSequence().toCharArray();
        timeMark();
        qsort(cs, 0, cs.length - 1);
        timeMark();
        return String.valueOf(cs);
    }

    private void qsort(char cs[], int left, int right)
    {
        if(left < right)
        {
            int marker = pivotSort(cs, left, right);
            qsort(cs, left, marker - 1);
            qsort(cs, marker + 1, right);
        }
    }

    private int pivotSort(char cs[], int left, int right)
    {
        char pivot = cs[left];
        int leftMarker = left + 1;
        int rightMarker = right;
        do
        {
            while(leftMarker <= rightMarker && (cs[leftMarker] < pivot) == StoL) 
                leftMarker++;
            for(; leftMarker <= rightMarker && (cs[rightMarker] >= pivot) == StoL; rightMarker--);
            if(leftMarker < rightMarker)
            {
                char c = cs[leftMarker];
                cs[leftMarker] = cs[rightMarker];
                cs[rightMarker] = c;
                leftMarker++;
                rightMarker--;
            } else
            if(leftMarker >= rightMarker)
            {
                char c = cs[rightMarker];
                cs[rightMarker] = pivot;
                cs[left] = c;
            }
        } while(leftMarker <= rightMarker);
        return rightMarker;
    }

    public String getName()
    {
        return "Quick Sort";
    }
}
