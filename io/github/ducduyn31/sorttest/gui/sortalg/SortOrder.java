// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   SortOrder.java

package io.github.ducduyn31.sorttest.gui.sortalg;


public final class SortOrder extends Enum
{

    private SortOrder(String s, int i)
    {
        super(s, i);
    }

    public static SortOrder[] values()
    {
        SortOrder asortorder[];
        int i;
        SortOrder asortorder1[];
        System.arraycopy(asortorder = ENUM$VALUES, 0, asortorder1 = new SortOrder[i = asortorder.length], 0, i);
        return asortorder1;
    }

    public static SortOrder valueOf(String s)
    {
        return (SortOrder)Enum.valueOf(io/github/ducduyn31/sorttest/gui/sortalg/SortOrder, s);
    }

    public static final SortOrder ASCENDING;
    public static final SortOrder DESCENDING;
    private static final SortOrder ENUM$VALUES[];

    static 
    {
        ASCENDING = new SortOrder("ASCENDING", 0);
        DESCENDING = new SortOrder("DESCENDING", 1);
        ENUM$VALUES = (new SortOrder[] {
            ASCENDING, DESCENDING
        });
    }
}
