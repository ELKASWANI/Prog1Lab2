//Select 3 of your programs from Lab #1 and adapt them to receive the input from the user (System.in), instead of hardcoded variable values.
import java.util.Scanner;

public class Question1{

    public static void main (String[] args){


        int age;
        int yearOfBirth;
        final int CURRENT = 2020;
        double amountCAD;
        double amountUSD;
        final double FACTOR = 0.75;

        Scanner sc = new Scanner(System.in);
        System.out.println("\nType the year you were born");

        yearOfBirth = sc.nextInt();

        age = CURRENT - yearOfBirth;

        System.out.println("\nYour age is " + age);


        System.out.println("\n Type the amount of CAD");

        amountCAD = sc.nextDouble();

        amountUSD = amountCAD * FACTOR;

        System.out.println("\n" + amountCAD + " CAD if equivalent to " + amountUSD + "USD");

        double triangle;
        double length;
        double width;
        
        System.out.println("Type how much the length");
        length = sc.nextDouble();

        System.out.println("Type how much the Width");
        width = sc.nextDouble();


        final double area = (length * width);
        final double perimeter = 2 * (length + width );

      

        System.out.println("\nThe Area of triangle is " + area +
                " The perimeter of triangle is " + perimeter );

    }
}