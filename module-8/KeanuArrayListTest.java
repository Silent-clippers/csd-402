/*
 * Keanu Foltz mod 8.2 2/16/25
 * Program finds largest value in inputted ArrayList
 */
package com.example.ArrayListProj;
import java.util.ArrayList;
import java.util.Scanner;

public class KeanuArrayListTest {
    public static Integer max(ArrayList<Integer>list){
        if (list.isEmpty()){
            return 0;
        }
        int max = list.get(0);
        for (int num : list){
            if (num > max){
                max = num;
            }
        }
        return max;
    }
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        
        System.out.println("Input numbers or press 0 to stop");
        while (true){
            int input = scanner.nextInt();
            numbers.add(input);
            if(input == 0){
                break;
            }
        }
        Integer maxValue = max(numbers);
        System.out.println("Largest value: "+ maxValue);
        scanner.close();
    }
}
