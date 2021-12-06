/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shapePkg;

import oopapp.Student;

/**
 *
 * @author AhmedTawfik
 */
public class Circle {

    private double radius;

    public Circle() {
        this.radius = 1;
    }

    public Circle(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        }
    }

    public double getRadius() {
        return radius;
    }

    public static double getArea(double r) {
        return r * r * Math.PI;
    }

    public double getArea() {

        return radius * radius * Math.PI;
    }

    public double getCircumference() {
        return 2 * radius * Math.PI;
    }
}
