package com.mycompany.csc325_oop_designreview_lab;

// Senior class
public class Senior extends Student { // Inheritance: Senior extends Student
    public Senior(String name, short age, short credits) {
        super(name, age, credits < 85 ? 85 : credits); // Superclass constructor call with additional logic

    }

    // Override toString method to provide a string representation of a Senior object
    @Override
    public String toString() {
        return "Senior [name=" + getName() + ", age=" + getAge() + ", GPA=" + getGpa() + ", credits=" + getCredits() + "]";
    }
}