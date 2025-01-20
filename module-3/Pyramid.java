/*
 * Keanu Foltz mod 3.2 1/19/25
 * This creates a number pyramid with for loops
 */
package com.example.pyramid;

public class Pyramid {
    public static void main(String[] args) {
        
        int rows = 7;
        
        for (int row = 0; row < rows; ++row){
            for (int space = 0; space < rows - row - 1; ++space){
                System.out.print("  ");
            }
            
            int value = 1;
            for (int num = 0; num <= row; ++num){
                System.out.print(value + " ");
                value *= 2;
            }
            
            value /= 2;
            for (int num = 0; num <row; ++num){
                value /= 2;
                System.out.print(value + " ");
            }
            
        
            for (int space = 0; space < rows - row; ++space)
                System.out.print("  ");
            
            
            System.out.print("@");
            
            System.out.println();
            
        }
    }
}
            
         

