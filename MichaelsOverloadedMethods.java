// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 05/08/2022
// Assignment: Module 10 Assignment
// Purpose: Write 4 overloaded methods that return the average of an array.
// References: https://stackabuse.com/guide-to-overloading-methods-in-java/, https://www.baeldung.com/java-array-sum-average; https://stackoverflow.com/questions/409784/whats-the-simplest-way-to-print-a-java-array

import java.util.*;

public class MichaelsOverloadedMethods {
    public static short average(short[] array) {
        short sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return (short) (sum / array.length);
    }
    public static int average(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    public static long average(long[] array) {
        long sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    public static double average(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    public static void main(String[] args) {
        short[] shortArray = {1, 2, 3, 4, 5, 6, 7};
        int[] intArray = {8, 16, 24, 32, 40, 48};
        long[] longArray = {1001, 2002, 3003, 4004, 5005};
        double[] doubleArray = {11.1, 12.2, 13.3, 14.4};

        System.out.println("Short array average of "+Arrays.toString(shortArray)+" is "+average(shortArray)+".");
        System.out.println("Int array average of"+Arrays.toString(intArray)+" is "+average(intArray)+".");
        System.out.println("Long array average of "+Arrays.toString(longArray)+" is "+average(longArray)+".");
        System.out.println("Double array average of "+Arrays.toString(doubleArray)+" is "+average(doubleArray)+".");
    }
}