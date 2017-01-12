// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Heap.java

package io.github.ducduyn31.sorttest;


public class Heap
{

    public Heap()
    {
        size = 0;
        heap = new Comparable[2];
    }

    public Heap(Comparable array[])
    {
        size = array.length;
        heap = new Comparable[array.length + 1];
        System.arraycopy(array, 0, heap, 1, array.length);
        buildHeap();
    }

    private void buildHeap()
    {
        for(int k = size / 2; k > 0; k--)
            percolatingDown(k);

    }

    private void percolatingDown(int k)
    {
        Comparable tmp = heap[k];
        int child;
        for(; 2 * k <= size; k = child)
        {
            child = 2 * k;
            if(child != size && heap[child].compareTo(heap[child + 1]) > 0)
                child++;
            if(tmp.compareTo(heap[child]) <= 0)
                break;
            heap[k] = heap[child];
        }

        heap[k] = tmp;
    }

    public void heapSort(Comparable array[])
    {
        size = array.length;
        heap = new Comparable[size + 1];
        System.arraycopy(array, 0, heap, 1, size);
        buildHeap();
        for(int i = size; i > 0; i--)
        {
            Comparable tmp = heap[i];
            heap[i] = heap[1];
            heap[1] = tmp;
            size--;
            percolatingDown(1);
        }

        for(int k = 0; k < heap.length - 1; k++)
            array[k] = heap[heap.length - 1 - k];

    }

    public Comparable deleteMin()
        throws RuntimeException
    {
        if(size == 0)
        {
            throw new RuntimeException();
        } else
        {
            Comparable min = heap[1];
            heap[1] = heap[size--];
            percolatingDown(1);
            return min;
        }
    }

    public void insert(Comparable x)
    {
        if(size == heap.length - 1)
            doubleSize();
        int pos;
        for(pos = ++size; pos > 1 && x.compareTo(heap[pos / 2]) < 0; pos /= 2)
            heap[pos] = heap[pos / 2];

        heap[pos] = x;
    }

    private void doubleSize()
    {
        Comparable old[] = heap;
        heap = new Comparable[heap.length * 2];
        System.arraycopy(old, 1, heap, 1, size);
    }

    public String toString()
    {
        String out = "";
        for(int k = 1; k <= size; k++)
            out = (new StringBuilder(String.valueOf(out))).append(heap[k]).append(" ").toString();

        return out;
    }

    private static final int CAPACITY = 2;
    private int size;
    private Comparable heap[];
}
