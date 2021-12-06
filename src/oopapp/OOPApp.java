/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oopapp;

import java.util.Scanner;
import shapePkg.Circle;

/**
 *
 * @author AhmedTawfik
 */
public class OOPApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please enter the size of circles list: ");
        
        int circlesSize = sc.nextInt();
        
        Circle[] circles=new Circle[circlesSize];
        
        for (int i = 0; i < circles.length; i++) {
            System.out.println("Please enter the radius of circle "+(i+1)+": ");
            double r = sc.nextDouble();
            
            circles[i] = new Circle(r);
        }
        
        for(Circle c:circles){
            printCircleInfo(c);
            System.out.println("-------------------------------");
        }
       
        
    }

    public static void printCircleInfo(Circle c){
        System.out.println("The Circle of Radius "+c.getRadius()+": ");
        System.out.println("The area is: "+c.getArea()+"\nThe circumference is: "+c.getCircumference());
    }
    
}
