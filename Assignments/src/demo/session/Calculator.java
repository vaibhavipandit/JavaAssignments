package demo.session;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello, I am Calculator developed by Vaibhavi!");
        System.out.println("Please enter first number:");
        float x = in.nextFloat();
        System.out.println("Please enter second number:");
        float y = in.nextFloat();
        System.out.println("Press 1 for addition, 2 for subtraction, 3 for multiplication, 4 for division:");
        int a = in.nextInt();
        float div;
        if (a == 1) {
            div = x + y;
            System.out.println("Here is your result. Thank you!");
            System.out.println(div);
        } else if (a == 2) {
            div = x - y;
            System.out.println("Here is your result. Thank you!");
            System.out.println(div);
        } else if (a == 3) {
            div = x * y;
            System.out.println("Here is your result. Thank you!");
            System.out.println(div);
        } else if (a == 4) {
            div = x / y;
            System.out.println("Here is your result. Thank you!");
            System.out.println(div);
        } else {
            System.out.println("Invalid Input");
        }
    }
}