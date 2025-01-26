/*
 * Keanu Foltz Module 4 1/26/25
 * This returns the averages and listed values of 4 arrays
 */
package com.example.arrayproject;

public class ArrayProject {  
    public static short average (short [] array){
        short sum = 0;
        for (short num : array){
            sum += num;
        }
        return (short)(sum / array.length);
    }
    
    public static int average(int [] array) {
        int sum = 0;
        for (int num : array){
            sum += num;
        }
        return (int)(sum / array.length);
    }
    
    public static long average(long [] array){
        long sum = 0;
        for (long num : array){
            sum += num;
        }
        return sum / array.length;
    }
    
    public static double average(double [] array){
        double sum = 0;
        for (double num : array){
            sum += num;
        }
        return sum / array.length;
    }
    
    public static void main(String [] args){
        short[] shortArray = {11, 12, 13, 14};
        short averageShort = average(shortArray);
        System.out.printf("Short Average: %d", averageShort);
        System.out.println();
        for (short numS : shortArray){
            System.out.printf("%d, ", numS);
        }
        System.out.println();
        System.out.println();
        
        
        int[] intArray = {33, 44, 55, 66};
        int averageInt = average(intArray);
        System.out.printf("Int Average: %d", averageInt);
        System.out.println();
        System.out.print("Array items: ");
        for (int numI : intArray){
            System.out.printf("%d, ", numI);
        }
        System.out.println();
        System.out.println();
        
        long[] longArray = {111, 222, 333, 444};
        long averageLong = average(longArray);
        System.out.printf("Long Average: %d", averageLong);
        System.out.println();
        System.out.print("Array items: ");
        for (long numL : longArray){
            System.out.printf("%d, ", numL);
        }
        System.out.println();
        System.out.println();
        
        double[] doubleArray = {1.1, 1.2, 1.3, 1.4};
        double averageDouble = average(doubleArray);
        System.out.printf("Double Average: %f", averageDouble);
        System.out.println();
        System.out.print("Array items: ");
        for (double numD : doubleArray){
            System.out.printf("%f, ", numD);
        }
        System.out.println();
        System.out.println();
        }
        
        
        
        
}
