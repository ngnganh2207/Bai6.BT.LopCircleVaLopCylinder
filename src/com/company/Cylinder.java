package com.company;

public class Cylinder extends Circle {
    private double height;

    //tất cả các constructor của thằng con đều gọi tới constructor không tham số của thằng cha
    //public Cylinder(){
        //super() là phương thức luôn ngầm gọi tới dù ta viết ra hay không viết ra
       // super();
    //}
//    public Cylinder (double height){
//        super();
//        this.height= height;
//    }
//    public Cylinder(double height, double radius, String color ){
//        super(radius, color);
//        this.height= height;
//    }
    public double getHeight(){
        return height;
    }
    public void setHeight(double height){
        this.height=height;
    }
    public double getVolume(){
        return getArea()*height;
    }
}
