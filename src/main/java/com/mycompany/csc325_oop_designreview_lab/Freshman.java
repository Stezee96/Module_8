package com.mycompany.csc325_oop_designreview_lab;

public class Freshman extends Student { // Inheritance: Freshman extends Student
    public Freshman(String name, short age, short credits) { //credit givine me errors made it short
        super(name, age, credits);
    }

    @Override
    public String toString() {
        return "Freshman [name=" + getName() + ", age=" + getAge() + ", GPA=" + getGpa() + ", credits=" + getCredits() + "]";
    }
}