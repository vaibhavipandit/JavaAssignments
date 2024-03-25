package rectangle;

import java.util.Scanner;

public class AreaAndPerimeter {

    public static void main(String[] args) {

        System.out.println("Calculation of Area and Perimeter of a Rectangle and Area and Circumference of Circle");

        System.out.println("Length:");

        Scanner in = new Scanner(System.in);

        float l = in.nextFloat();

        System.out.println("Breadth:");

        float b = in.nextFloat();

        System.out.println("Radius of Circle:");

        float r = in.nextFloat();

        float areaOfRectangle = l * b;

        float perimeterOfRectangle = 2 * (l + b);

        float areaOfCircle = ((float) 22 /7) * r * r ;

        float circumferenceOfCircle = 2 * ((float) 22 /7) * r;

        System.out.println("Therefore the Area and the Perimeter of Rectangle are " + areaOfRectangle +" and "+ perimeterOfRectangle + " respectively.");

        System.out.println("The Area and the Circumference of Circle are " + areaOfCircle +" and "+ circumferenceOfCircle + " respectively.");



    }

}
