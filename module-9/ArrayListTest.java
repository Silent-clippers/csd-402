/*
 * Keanu Foltz mod 9.2 2/16/25
 * Uses a try catch to display error message
 */
package com.example.modNine;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        
        words.add("0. Snowboard");
        words.add("1. Skis");
        words.add("2. Basket ball");
        words.add("3. Soccer ball");
        words.add("4. Volley ball");
        words.add("5. Tennis Racket");
        words.add("6. Boxing Gloves");
        words.add("7. Bow");
        words.add("8. Baseball Bat");
        words.add("9. Football Helmet");
        
        for (String word : words){
            System.out.println(word);
        }
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Input index number to find a word again: ");
        String userInput = scanner.nextLine();
        
        try {
            Integer index = Integer.parseInt(userInput);
            
            System.out.println(words.get(index));
        } 
        catch (IndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }
        scanner.close();
        
    }
}
