import java.util.*;
public class Question2{

    public static void main(String []args){

        double feet;
        double pound;
        double meters;
        double kiloGrams;
        double BMI;

        Scanner sc = new Scanner(System.in);
        System.out.println("\nType your weight in pound");
        pound = sc.nextDouble();
        kiloGrams = 2.20462 * pound;
        System.out.println("\nYour weight in kiloGrams is " + kiloGrams);

        Scanner s = new Scanner(System.in);
        System.out.println("\nType your height in feet");
        feet = s.nextDouble();
        meters =  0.3048 * feet;
        System.out.println("\nYour height in meters is" + meters);

        BMI = (kiloGrams/(meters*meters));
        System.out.println("\nyour Body Mass Index (BMI) in kilograms and feet is "
                            +BMI );


    }
}
