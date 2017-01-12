// Decompiled by Jad v1.5.8g. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.kpdus.com/jad.html
// Decompiler options: packimports(3) 
// Source File Name:   Algorithm.java

package io.github.ducduyn31.sorttest.algorithms;


public class Algorithm
{
    public static final class Type extends Enum
    {

        public static Type[] values()
        {
            Type atype[];
            int i;
            Type atype1[];
            System.arraycopy(atype = ENUM$VALUES, 0, atype1 = new Type[i = atype.length], 0, i);
            return atype1;
        }

        public static Type valueOf(String s)
        {
            return (Type)Enum.valueOf(io/github/ducduyn31/sorttest/algorithms/Algorithm$Type, s);
        }

        public static final Type NULL;
        public static final Type SORT;
        public static final Type FIND;
        private static final Type ENUM$VALUES[];

        static 
        {
            NULL = new Type("NULL", 0);
            SORT = new Type("SORT", 1);
            FIND = new Type("FIND", 2);
            ENUM$VALUES = (new Type[] {
                NULL, SORT, FIND
            });
        }

        private Type(String s, int i)
        {
            super(s, i);
        }
    }


    public Algorithm()
    {
    }

    public Type getType()
    {
        return Type.NULL;
    }

    public String getDescription()
    {
        return "An algorithm (pronounced AL-go-rith-um) is a procedure or formula for solving a problem, based on conductiong a sequence of specified actions. A computer program can be viewed as an elaborate algorithm. In mathematics and computer science, an algorithm usually means a small procedure that solves a recurrent problem.";
    }
}
