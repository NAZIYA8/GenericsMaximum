package com.bridgelabz;

import java.lang.Float;
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

    /**
     * @param a float number1
     * @param b float number2
     * @param c float number3
     * @return maximum of 3 float numbers
     */
    public static Float maximumOfFloat(Float a, Float b, Float c) {
        Float max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        return max;
    }

    /**
     * @param a string1
     * @param b string2
     * @param c string3
     * @return maximum of 3 strings
     */
    public static String maximumOfString(String a, String b, String c) {
        String max = a;
        if (b.compareTo(max) > 0)
            max = b;
        if (c.compareTo(max) > 0)
            max = c;
        return max;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(maximumOfIntegers(20, 30, 40));
        System.out.println(maximumOfFloat(32.5f, 53.5f, 43.2f));
        System.out.println(maximumOfString("apple", "banana", "peach"));
    }

}