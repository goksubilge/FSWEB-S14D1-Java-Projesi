package com.bilge.inheritance.cylinder;

public class Cylinder extends Circle{
private double height;
    public Cylinder(double radius, double height) {
        super(radius);
        if(radius <= 0) {
            this.height =0;
        } else {
            this.height = height;
        }
    }
    public double getHeight() {
        return height;
    }
    public double getVolume() {
        return super.getArea() * height; // super. optional
    }
}
