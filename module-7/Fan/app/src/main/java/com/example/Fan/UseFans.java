/*
 * Keanu Foltz Module 6 2/9/25
 * This is a fan program created using oop
 */
package com.example.Fan;

import java.util.ArrayList;
import java.util.List;

class Fan {
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;
    
    private int speed;
    private boolean on;
    private double radius;
    private String color;
    
    public Fan() {
        this.speed = STOPPED;
        this.on = false;
        this.radius = 6.0;
        this.color = "white";
    }
    
    public Fan(int speed, boolean on, double radius, String color){
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }
    
    public int getSpeed(){
        return speed;   
    }
    
    public void setSpeed(int speed){
        this.speed = speed;
    }
    
    public boolean getOn(){
        return on;
    }
    
    public void setOn(boolean on){
        this.on=on;
    }
    
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }
    
    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }
    
    
    public String toString(){
        if(on){
            return "Fan is on - Speed: "+speed+" - Color: "+color+" - Radius:" + radius;
        }else{
            return "Fan is off - Color: "+color+" -Radius:"+radius;   
        }
    }


}



class UseFans {
    public static void showFans(List<Fan> fans) {
        System.out.println("Display Fans: ");
        for (Fan fan : fans){
           showFan(fan);
        }
    }
    
    public static void showFan(Fan fan) {
        System.out.println("Fan info: ");
        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On: " + fan.getOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
    }
    
    public static void main(String[] args) {
        List<Fan> fans = new ArrayList<>();
        fans.add(new Fan());
        fans.add(new Fan(Fan.MEDIUM, true, 3.0,"blue"));
        fans.add(new Fan(Fan.SLOW, false, 2.0, "yellow"));
        
        showFans(fans);
    }
}
