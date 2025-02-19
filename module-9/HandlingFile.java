/*
 * Keanu Foltz mod 9.2 2/16/25
 * creates and writes num to file with try catch in case of exceptions 
 */
package com.example.modNine;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class HandlingFile {
    public static void main(String[] args){
        String fileName = "data.file";
        Random random = new Random();
        
        try (FileWriter fw = new FileWriter(fileName, true);
                BufferedWriter bw = new BufferedWriter(fw)){
            for (int i = 0; i < 10; i++){
                int randomNum = random.nextInt(1000);
                bw.write(randomNum + " ");
            }
        } catch (IOException e){
            System.out.println("Error writing to file");
        }
        
        try (Scanner fileScanner = new Scanner(new File(fileName))){
            System.out.println(fileName + ":");
            while (fileScanner.hasNextLine()){
                System.out.println(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
            
    }
}
