/*
 * Keanu Foltz 2/2/25 Module 5
 * This finds the largest and smallest items in an array
 */
package com.example.multidim.arrays;

public class SearchArray {
    
    public static int[] locateLargest(int[][] arrayParam){
        int largestRow = 0; 
        int largestCol = 0;
        int largestValue = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++){
            for (int j = 0; j < arrayParam[i].length; j++){
                if (arrayParam[i][j] > largestValue) {
                    largestValue = arrayParam[i][j];
                    largestRow = i;
                    largestCol = j;
                }   
            }
        }
        return new int[]{largestRow, largestCol};
    }
    public static double[] locateLargest(double[][] arrayParam){
        int largestRow = 0; 
        int largestCol = 0;
        double largestValue = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++){
            for (int j = 0; j < arrayParam[i].length; j++){
                if (arrayParam[i][j] > largestValue) {
                    largestValue = arrayParam[i][j];
                    largestRow = i;
                    largestCol = j;
                }   
            }
        }
        return new double[]{largestRow, largestCol};
    }    
    public static int[] locateSmallest(int[][] arrayParam){
        int smallestRow = 0;
        int smallestCol = 0;
        int smallestValue = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++){
            for (int j = 0; j < arrayParam[i].length; j++){
                if (arrayParam[i][j] < smallestValue){
                    smallestValue = arrayParam[i][j];
                    smallestRow = i;
                    smallestCol = j;
                }
            }
        }
        return new int[]{smallestRow, smallestCol}; 
    }  
    
    public static double[] locateSmallest(double[][] arrayParam){
        int smallestRow = 0; 
        int smallestCol = 0;
        double smallestValue = arrayParam[0][0];
        
        for (int i = 0; i < arrayParam.length; i++){
            for (int j = 0; j < arrayParam[i].length; j++){
                if (arrayParam[i][j] < smallestValue) {
                    smallestValue = arrayParam[i][j];
                    smallestRow = i;
                    smallestCol = j;
                }   
            }
        }
        return new double[]{smallestRow, smallestCol};
    }
    
    public static void main(String[] args){
        int[][] intArray = {
            {13, 12, 23},
            {22, 56, 1},
            {4, 5, 7}
        };
        
        double[][] doubleArray = {
            {1.1, 6.2, 2.3},
            {2.2, 2.3, 3.4},
            {3.3, 0.5, 2.4}
        };
        
        int[] lIntIndex = locateLargest(intArray);
        double[] lDoubleIndex = locateLargest(doubleArray);
        int[] sIntIndex = locateSmallest(intArray);
        double[] sDoubleIndex = locateSmallest(doubleArray);
        
        System.out.println("Largest int: " + lIntIndex[0] + ":" + lIntIndex[1]);
        System.out.println("Largest double: " + lDoubleIndex[0] + ":" + lDoubleIndex[1]);
        System.out.println("Smallest int: " + sIntIndex[0] + ":" + sIntIndex[1]);
        System.out.println("Smallest double: " + sDoubleIndex[0] + ":" + sDoubleIndex[1]);
    }

    

}
