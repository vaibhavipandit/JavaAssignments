package distance;

import java.util.Scanner;

public class TwoCitiesDistance {

    public static void main (String[] args) {

        System.out.println("Enter the distance in km:");

        Scanner in = new Scanner(System.in);

        double distance = in.nextFloat();

        double meters = distance * 1000;

        double feet = distance * 3280.8;

        double inches = distance * 39370;

        double cm = distance * 100000;

        System.out.println("Values in different units:");
        System.out.println("Distance in meters " + meters );
        System.out.println("Distance in feet " + feet );
        System.out.println("Distance in inches " + inches );
        System.out.println("Distance in centimeters " + cm );
    }
}
