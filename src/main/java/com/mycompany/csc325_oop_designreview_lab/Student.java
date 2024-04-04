/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
// ToDo 1: Make this class a child of Human
public class Student extends Human {
    // Extend to make it a child of human
    private double gpa;
    private short credits;

    // Constructor
    public Student(String name, short age, short credits) { //credits for senior class
        super(name, age);
    }

    // ToDo 2: Fix the resulting errors

    @Override
    public String getAddress() {
        return null; // Inherited from Human class
    }

    @Override
    public void setAddress(String address) {

    }

    //ToDo 3: Add a field for GPA and create a setter and a getter

    //Getters and setters for GPA
    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    // ToDo 4: Add comments to your code
    // Done

    // ToDo 9: Add a toString method for the Student class
    @Override
    public String toString() {
        return "Freshman [name=" + getName() + ", age=" + getAge() + ", credits=" + getCredits() + ", GPA=" + getGpa() + "]";
    }
    public String studentToString() {
        return "Student [name=" + getName() + ", age=" + getAge() + ", GPA=" + getGpa() + "]"; //error making 2 two strings in same class
    }

    //
    public short getCredits() {
        return credits;
    }
}
