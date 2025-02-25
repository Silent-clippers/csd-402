/*
 * Keanu Foltz mod 10.2 2/23/25
 * international Division Subclass file
 */
package com.example.modTen;

public class InternationalDivision extends Division {
    private String country;
    private String language;
    
    public InternationalDivision(String divisionName, int accountNumber, 
            String country, String language){
        super(divisionName, accountNumber);
        this.country = country;
        this.language = language;
    }
    
    @Override
    public void display() {
        System.out.println("International Division: " + divisionName);
        System.out.println("Account: " + accountNumber);
        System.out.println("Country: " + country);
        System.out.println("Language: " + language);
        System.out.println();
    }
    
}
