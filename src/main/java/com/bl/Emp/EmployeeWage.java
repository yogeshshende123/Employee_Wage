package com.bl.Emp;

public class EmployeeWage {
    public static void main(String[] args){

        System.out.println("Wellcome to Employee wage project");
        //  UC1_check employee is present or not.
        int ispresent=1;
        int emp=(int) (Math.random()*10)%2;
        if ( ispresent==emp)
            System.out.println("Employee is present");
        else
            System.out.println("Employee is not present");
        //UC_2g
    }

}
