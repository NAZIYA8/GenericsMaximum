package com.bridgelabz;

import java.lang.Integer;

public class Maximum implements Comparable {

    /**
     * @param x integer1
     * @param y integer2
     * @param z integer3
     * @return maximum of 3 integers
     */
    public static Integer maximumOfIntegers(Integer x, Integer y, Integer z) {
        Integer max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(maximumOfIntegers(20, 30, 40));
    }
}