package com.neomurali.day4;

import java.util.Scanner;

public class Manager extends GeneralManager {

    public static void main(String[] args) {
        Manager manager = new Manager();

        // Inherits the following methods from EmployeeDetails Class
        manager.employeeName();
        manager.employeeID();
        manager.employeeEmail();
        // Inherits the following methods from GeneralManager Class
        manager.carAllowance();
        // Executing the methods from this class
        manager.managementSkills();
        manager.techSkills();
    }

    // // Getting user's input
    Scanner input = new Scanner(System.in);

    // Displays technical skills
    public void techSkills(){
        System.out.println("Enter the technical skills: ");
        String tech = input.next();
        System.out.println("Tech skills: " + tech + "\n");
    }

    /* This method can be used only in this class.
     * It is a private method
     */
    private void managementSkills(){
        System.out.println("Enter the management skills: ");
        String manage = input.next();
        System.out.println("Management skills: " + manage + "\n");
    }
}
