package com.neomurali.day4;

public class GeneralManager extends EmployeeDetails{

    public static void main(String[] args) {
        // Create an instance of GeneralManagerTech class
        GeneralManager generalManager = new GeneralManager();

        // Inherits the following methods from EmployeeDetails Class which is parent class
        generalManager.employeeName();
        generalManager.employeeID();
        generalManager.employeeEmail();

        // Executing the methods from this class
        generalManager.carAllowance();
        generalManager.share();

    }

    public void carAllowance(){
        System.out.println("Car allowance is available" + "\n");
    }

    /* This method can be used only in this class.
     * The employees below GM don't have the permission to hold the company's share.
     * So it is a private method
     */
    private void share(){
        System.out.println("GM is eligible to hold the shares of company" + "\n");
    }
}
