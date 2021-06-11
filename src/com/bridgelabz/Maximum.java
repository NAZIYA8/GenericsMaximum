package com.bridgelabz;

public class Maximum<T extends Comparable<T>> {
    T x, y, z;

    public Maximum(T x, T y, T z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public T getMaximum() {
        return Maximum.getMaximum(x, y, z);
    }

    public static <T extends Comparable<T>> T getMaximum(T x, T y, T z) {
        T max = x;

        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;

    }

    /**
     * Returns the maximum of 3 comparable objects
     */
    public static void main(String[] args) {
        System.out.println(getMaximum(20, 30, 40));
        System.out.println(getMaximum(22.5f, 53.5f, 32.2f));
        System.out.println(getMaximum("apple", "banana", "peach"));
    }
}

