package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner; // Import Scanner

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {

 public static void main(String[] args) {
	 Scanner scanner = new Scanner(System.in);

	 // ToDo 5: Fix the error

	 // ToDo 6: Fix the constructor of the Student class
	 //done

	 // Todo 7: Create two classes for Freshman and Senior
	 //done

	 // ToDo 8: The senior class should have a minimum of 85 credits
	 //done

	 // ToDo 9: Add a toString method for the Student class
	 //on student class

	 // ToDo 10: Add a toString method for the Freshman class

	 Student std1 = new Student("James", (short) 20, (short) 0);

	 // ToDo 11: Add a toString method for the Senior class

	 Freshman fresh = new Freshman("James", (short) 20, (short) 12); //changed std1 to fresh as it's used.

	 Senior senior1 = new Senior("John", (short) 30, (short) 90);

	 // ToDo 12: Set the gpa of the student using the scanner and user
	 //done
	 // 	input and then print the output.
	 System.out.println("Student GPA is 3.8:");
	 double gpa1 = scanner.nextDouble();
	 std1.setGpa(gpa1);

		System.out.println(std1);
	 	System.out.println(senior1);

		// ToDo 13: add comments and explain your code

	}

}

