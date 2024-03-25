package temperature;

import java.util.Scanner;

public class TempConversion {

    public static  void  main (String[] args){

        System.out.println("Temperature conversion from Fahrenheit to Centigrade");

        System.out.println("Enter the temperature in Fahrenheit: ");

        Scanner in = new Scanner(System.in);

        int Fahrenheit = in.nextInt();

        int Centigrade = (Fahrenheit - 32) * 5/9;

        System.out.println("Temperature in Centigrade is " + Centigrade);
    }
}
