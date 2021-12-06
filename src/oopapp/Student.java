/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oopapp;

/**
 *
 * @author AhmedTawfik
 */
public class Student {

    private static int instanceNumber = 0;
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private char grade;

    public Student() {
        id = 1;
        firstName = "Ahmed";
        lastName = "Mohamed";
        age = 20;
        grade = 'A';
        instanceNumber++;
    }

    public Student(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
        instanceNumber++;
    }

    public Student(int id, String firstName, String lastName, int age, char grade) {
        this(firstName,lastName);
        this.id = id;
        this.age = age;
        this.grade = grade;
    }

    public static int getInstanceNumber(){
        
        return instanceNumber;
        
    }
    
    public void setId(int id) {
        if (id > 0) {
            this.id = id;
        }
    }

    public int getId() {
        return this.id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        if (grade == 'A' || grade == 'B' || grade == 'C' || grade == 'D' || grade == 'E' || grade == 'F') {
            this.grade = grade;
        }
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public void printGrade() {
        System.out.println("The student grade is: " + grade);
    }

    public void printInfo() {
        System.out.println("Student Id: " + id + "\nStudent Name: " + getFullName() + "\nStudent age: " + age + "\nStudent Grade: " + grade);
    }

}
