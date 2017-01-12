// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Sorter.java

package io.github.ducduyn31.sorttest.algorithms.sort;

import io.github.ducduyn31.sorttest.algorithms.Algorithm;
import java.io.*;

// Referenced classes of package io.github.ducduyn31.sorttest.algorithms.sort:
//            BubbleSort, SelectionSort, InsertionSort, HeapSort, 
//            MergeSort, QuickSort

public class Sorter extends Algorithm
{

    public Sorter(File file, boolean smltolrgt)
    {
        StoL = true;
        input = null;
        time = new long[2];
        input = file.getName().substring(file.getName().length() - 3).equals("txt") ? file : null;
        StoL = smltolrgt;
    }

    public Sorter(File file)
    {
        this(file, true);
    }

    public Sorter(String path, boolean smltolrgt)
        throws FileNotFoundException
    {
        this(new File(path), smltolrgt);
    }

    public Sorter(String path)
        throws FileNotFoundException
    {
        this(new File(path), true);
    }

    public static Sorter[] getAllSorters(File input)
    {
        Sorter l[] = new Sorter[6];
        l[0] = new BubbleSort(input);
        l[1] = new SelectionSort(input);
        l[2] = new InsertionSort(input);
        l[3] = new HeapSort(input);
        l[4] = new MergeSort(input);
        l[5] = new QuickSort(input);
        return l;
    }

    public String getSequence()
    {
        String raw;
        FileInputStream is;
        raw = "";
        is = null;
        try
        {
            is = new FileInputStream(input);
            int content;
            while((content = is.read()) != -1) 
                raw = (new StringBuilder(String.valueOf(raw))).append((char)content).toString();
            break MISSING_BLOCK_LABEL_102;
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        if(is != null)
            try
            {
                is.close();
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        break MISSING_BLOCK_LABEL_120;
        Exception exception;
        exception;
        if(is != null)
            try
            {
                is.close();
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        throw exception;
        if(is != null)
            try
            {
                is.close();
            }
            catch(IOException ex)
            {
                ex.printStackTrace();
            }
        return raw.replaceAll("\\s+", "");
    }

    public String sort()
    {
        return getSequence();
    }

    public void printFile()
        throws FileNotFoundException
    {
        File f;
        BufferedWriter bw;
        FileWriter fw;
        f = new File((new StringBuilder(String.valueOf(input.getPath().substring(0, input.getPath().length() - 4)))).append("-sorted.txt").toString());
        bw = null;
        fw = null;
        try
        {
            fw = new FileWriter(f);
            bw = new BufferedWriter(fw);
            bw.write(sort());
            break MISSING_BLOCK_LABEL_149;
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        try
        {
            if(bw != null)
                bw.close();
            if(fw != null)
                fw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        break MISSING_BLOCK_LABEL_175;
        Exception exception;
        exception;
        try
        {
            if(bw != null)
                bw.close();
            if(fw != null)
                fw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        throw exception;
        try
        {
            if(bw != null)
                bw.close();
            if(fw != null)
                fw.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        f.mkdirs();
        return;
    }

    public void timeMark()
    {
        if(time[0] == 0L)
            time[0] = System.currentTimeMillis();
        else
            time[1] = System.currentTimeMillis();
    }

    public long calculateTimeMillis()
    {
        return time[1] - time[0];
    }

    public String getName()
    {
        return getClass().getSimpleName();
    }

    public io.github.ducduyn31.sorttest.algorithms.Algorithm.Type getType()
    {
        return io.github.ducduyn31.sorttest.algorithms.Algorithm.Type.SORT;
    }

    public boolean StoL;
    private File input;
    private long time[];
}
