package studentmarks;

import java.util.Scanner;

public class AggregateMarks {

    public static void main (String[] args){

        System.out.println("Lets calculate your Aggregate Marks and Percentage Marks.");

        System.out.println("Please enter your marks of Subject 1 here: ");

        Scanner in = new Scanner(System.in);

        float subject1 = in.nextFloat();

        System.out.println("Please enter your marks of Subject 2 here: ");

        float subject2 = in.nextFloat();

        System.out.println("Please enter your marks of Subject 3 here: ");

        float subject3 = in.nextFloat();

        System.out.println("Please enter your marks of Subject 4 here: ");

        float subject4 = in.nextFloat();

        System.out.println("Please enter your marks of Subject 5 here: ");

        float subject5 = in.nextFloat();

        float aggregatemarks = subject1 + subject2 + subject3 + subject4 + subject5;

        System.out.println("Here are your aggregate marks obtained: " + aggregatemarks);

        float percentagemarks = (aggregatemarks /500) * 100;

        System.out.println("Here is your percentage marks obtained: " + percentagemarks);














    }
}
