/*
 * Keanu Foltz mod 10.2 2/23/25
 * instances 
 */
package com.example.modTen;


public class UseDivision {
    public static void main(String[] args){
        InternationalDivision japDiv = new InternationalDivision("HiTech Japan", 1995, "Japan", "Japanese");
        InternationalDivision polDiv = new InternationalDivision("HiTech Europe", 1997, "Poland", "Polish");
        
        DomesticDivision washDiv = new DomesticDivision("HiTech Seattle", 1990, "Washington");
        DomesticDivision nyDiv = new DomesticDivision("HiTech New York City", 1991, "New York");
        
        japDiv.display();
        polDiv.display();
        washDiv.display();
        nyDiv.display();
    }
    
}
