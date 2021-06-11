package com.bridgelabz;

public class Maximum implements Comparable {

    public static <T extends Comparable<T>> T maximum(T x, T y, T z) {
        T max = x;

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
    /**
     * Returns the maximum of 3 comparable objects
     */
    public static void main(String[] args) {
        System.out.println(maximum(20, 30, 40));
        System.out.println(maximum(22.5f, 53.5f, 32.2f));
        System.out.println(maximum("apple", "banana", "peach"));
    }
}
