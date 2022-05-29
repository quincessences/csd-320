// CSD320 - Programming with Java
// Name: Maria Q. Michaels
// Date: 04/30/2022
// Assignment: Module 9 Assignment
// Purpose: Write a program that creates an array and calculates values within an array.
// References: https://gist.github.com/manish84ya/d3c7f1da8c1a996f5acc1a0d68cc1fd6, https://github.com/chetanDN/javaPrograms/blob/master/Collections/1.Arrays.java, https://www.tutorialspoint.com/How-to-find-Min-Max-numbers-in-a-java-array

import java.util.Scanner;

public class MichaelsArrays {
    public static void main(String[] args) {
        int n, max, min, sum=0;
        float average;
        Scanner Integers = new Scanner(System.in);
        System.out.print("Enter total number of array elements:");
        n = Integers.nextInt();
        int a[] = new int[n];
        System.out.println("Enter and submit individual array elements:");
        for(int i=0; i<n; i++) {
            a[i] = Integers.nextInt();
            sum = sum + a[i];
        }
        max = a[0];
        for(int i=0; i<n; i++) {
            if(max<a[i]) {
                max = a[i];
            }
        }
        System.out.println("Maximum: "+max);
        min = a[0];
        for(int i=0; i<n; i++) {
            if(a[i]<min) {
                min = a[i];
            }
        }
        System.out.println("Minimum: "+min);
        System.out.println("Sum: "+sum);
        average = (float)sum/n;
        System.out.println("Average: "+average);
    }
}