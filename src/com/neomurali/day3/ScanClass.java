package com.neomurali.day3;

import java.util.Scanner;

public class ScanClass {

    public static void main(String[] args) {
        ScanClass employee = new ScanClass();
        employee.employeeName();
        employee.employeeId();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.next();
        System.out.println(name);

        System.out.println("enter date of birth");
        int year = input.nextInt();
        System.out.println(year);

        System.out.println("enter your salary");
        double salary = input.nextDouble();
        System.out.println("your salary is "+ salary);

        System.out.println("enter big number");
        long number = input.nextLong();
        System.out.println(number);

        System.out.println("Enter true or false: ");
        boolean question = input.nextBoolean();
        System.out.println(question);

    }

    public void employeeName(){
        System.out.println("Murali");
    }

    public void employeeId(){
        System.out.println(12);
    }
}
