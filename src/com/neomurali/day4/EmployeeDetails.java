package com.neomurali.day4;

/*
* Employee details contains the methods of employee's name, Id and mail.
* This is a parent class for all child classes.*
*/

import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        // Create an instance of EmployeeDetails class
        EmployeeDetails employee1 = new EmployeeDetails();
        // Display employee's name, ID and email
        employee1.employeeName();
        employee1.employeeID();
        employee1.employeeEmail();
    }
    // Getting user's input
    Scanner input = new Scanner(System.in);

    // Displays Employee's name
     public void employeeName(){
         System.out.println("Enter employee's Name: " );
         String name = input.next();
         System.out.println("Employee's Name: " + name + "\n" );
    }

    // Displays Employee's ID
    public void employeeID(){
        System.out.println("Enter employee's ID: " );
        int identification = input.nextInt();
        System.out.println("Employee's ID: " + identification + "\n" );
    }

    // Displays Employee's Email ID
    public void employeeEmail(){
        System.out.println("Enter employee's email: " );
        String email = input.next();
        System.out.println("Employee's Email: " + email + "\n");
    }
}
