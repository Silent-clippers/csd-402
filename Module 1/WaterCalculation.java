/*
 * Keanu Foltz 1/12/25
 * This program calculates energy needed to heat water
 */
package com.example.m1.water.heating.kfoltz;

import java.util.Scanner;

public class WaterCalculation {
    public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the amount of water in kg: ");
        double waterMass = input.nextDouble();
        
        System.out.print("Enter the initial water temperature in Celcius: ");
        double initialTemperature = input.nextDouble();
        
        System.out.print("Input the final water temperature in Celcius: ");
        double finalTemperature = input.nextDouble();
        
        double Q = waterMass * (finalTemperature - initialTemperature)* 4184;
        
        
        System.out.print("The amount of energy in Joules"
                + " needed to heat the water to " 
                + finalTemperature + " is " + Q + "Jules");
    }
    
}
