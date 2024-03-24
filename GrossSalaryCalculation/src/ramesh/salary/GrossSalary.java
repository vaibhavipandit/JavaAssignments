package ramesh.salary;

import java.util.Scanner;

public class GrossSalary {

    public static void main (String[] args){

        System.out.println("Ramesh's basic salary calculation");
        System.out.println("Enter your basic salary");

        Scanner in = new Scanner(System.in);

        float basicSalary = in.nextFloat();

        float da = basicSalary * ((float) 40 /100);

        float hra =  basicSalary * ((float) 20 /100);

        float grossSalary = basicSalary + da + hra;

        System.out.println("Your gross salary is: " + grossSalary);
    }
}
