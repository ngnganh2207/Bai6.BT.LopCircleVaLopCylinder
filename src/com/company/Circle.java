package com.company;
//Không để class là public class được không
    public class Circle {
    private double radius;
    private String color;
    private static final double PI = Math.PI;


    public Circle(){}
    public Circle(double radius, String color){
        this.radius= radius;
        this.color= color;
    }

    public double getRadius() {
        //dùng this.radius được ko?
        return this.radius;
    }
    public void setRadius(double radius){
         this.radius=radius;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color= color;
    }
    public double getArea(){
        return PI*this.radius*this.radius;
    }
}
