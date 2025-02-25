/*
 * Keanu Foltz mod 10.2 2/23/25
 * Abstract Division Superclass file
 */
package com.example.modTen;


public abstract class Division {
    protected String divisionName;
    protected int accountNumber;
    
    public Division(String divisionName, int accountNumber) {
        this.divisionName = divisionName;
        this.accountNumber = accountNumber;
    }
    
    public abstract void display();
}
