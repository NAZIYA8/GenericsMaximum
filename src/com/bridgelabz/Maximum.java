package com.bridgelabz;

public class Maximum<T extends Comparable<T>> {
    T[] inputArray;

    public Maximum(T[] inputArray) {
        this.inputArray = inputArray;
    }

    public T getMaximum() {
        return Maximum.getMaximum(inputArray);
    }

    public static <T extends Comparable<T>> T getMaximum(T[] inputArray) {
        T max = inputArray[0];
        for (int i = 0; i < inputArray.length; i++) {
            T element = inputArray[i];
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }


    /**
     * Returns the maximum of any number of parameters taken
     */
    public static void main(String[] args) {

        Integer[] intArray = {10, 30, 50, 40, 60, 20};
        Float[] floatArray = {10.5f, 23.4f, 35.7f, 47.2f};
        String[] stringArray = {"apple", "banana", "cherry", "pear", "orange"};
        System.out.println(new Maximum(intArray).getMaximum());
        System.out.println(new Maximum(floatArray).getMaximum());
        System.out.println(new Maximum(stringArray).getMaximum());
    }
}

