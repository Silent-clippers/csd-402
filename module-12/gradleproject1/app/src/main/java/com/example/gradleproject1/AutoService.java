/*
 * Keanu Foltz mod 12 3/9/25
 * This App Calculates the cost of a yearly auto service visit
 */
package com.example.gradleproject1;


public class AutoService {
    public static final double STANDARD_SERVICE_CHARGE = 100.00;
    public static final double OIL_CHANGE_FEE = 50.00;
    public static final double TIRE_ROTATION_FEE = 25.00;
    
    public static double yearlyService(){
        return STANDARD_SERVICE_CHARGE;
    }
    
    public static double yearlyService(boolean oilChange){
        if (oilChange){
            return STANDARD_SERVICE_CHARGE + OIL_CHANGE_FEE;
        }
        return STANDARD_SERVICE_CHARGE;
    }
    
    public static double yearlyService(boolean oilChange, boolean tireRotation){
        double total = STANDARD_SERVICE_CHARGE;
        if (oilChange) {
            total += OIL_CHANGE_FEE;
        }
        if (tireRotation){
            total += TIRE_ROTATION_FEE;
        }
        return total;
    }
    
    public static double yearlyService(boolean oilChange, boolean tireRotation, double coupon){
        double total = STANDARD_SERVICE_CHARGE;
        if (oilChange){
            total += OIL_CHANGE_FEE;
        }
        if (tireRotation){
            total += TIRE_ROTATION_FEE;
        }
        total -= coupon;
        if (total <0){
            total = 0;
        }
        return total;
    }
    
    public static void main(String[] args){
        System.out.println("Standard Service Charge: $" + yearlyService());
        
        System.out.println("Standard Service + Oil Change: $" + yearlyService(true));
        System.out.println("Standard Service no Oil Change: $" + yearlyService(false));
        
        System.out.println("Standard Sevice + Oil Change + Tire Rotation: $" + yearlyService(true, true));
        System.out.println("Standard Service + Oil Change no Tire Rotation: $" + yearlyService(true, false));
        
        System.out.println("Full Service + $20 coupon: $" + yearlyService(true, true, 20.00));
        System.out.println("Full Service + $50 coupon: $" + yearlyService(true, true, 50.00));
    }
}
