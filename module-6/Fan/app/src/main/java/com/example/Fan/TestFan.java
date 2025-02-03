/*
 * Keanu Foltz Module 6 2/2/25
 * This is a fan program created using oop
 */
package com.example.Fan;


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

public class TestFan{
    public static void main(String[]args){
        Fan fan1 = new Fan();
        System.out.println("Fan 1: "+fan1);
        
        Fan fan2 = new Fan(Fan.SLOW,true,6.0,"red");
        System.out.println("Fan 2: "+fan2);
        
        fan1.setSpeed(Fan.FAST);
        fan1.setOn(true);
        fan1.setRadius(5.5);
        fan1.setColor("Yellow");
        
        System.out.println("Modified Fan1: "+fan1);
        
        
    }
    
}
