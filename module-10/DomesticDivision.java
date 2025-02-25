/*
 * Keanu Foltz mod 10.2 2/23/25
 * Domestic Division subclass file
 */
package com.example.modTen;

public class DomesticDivision extends Division {
    private String state;
    
    public DomesticDivision(String divisionName, int accountNumber, String state){
        super(divisionName, accountNumber);
        this.state = state;
    }
    
    @Override
    public void display(){
        System.out.println("Domestic Division: " + divisionName);
        System.out.println("Account: " + accountNumber);
        System.out.println("State: " + state);
        System.out.println();
    }
}
