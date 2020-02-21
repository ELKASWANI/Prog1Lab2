//This program that prompts the user for the temperature in Celsius in the past 3 days and output the average temperature.
import java.util.*;

public class Questio{

	public static void main(String[]args) {
		
		// c is Celsius.
		double c1;
		double c2;
		double c3;
		double celsiusAverage;
		
		Scanner day1 = new Scanner(System.in);
		System.out.println("\nEnter the Celsius for day1");
		c1 = day1.nextDouble();

		Scanner day2 = new Scanner(System.in);
		System.out.println("\nEnter the Celsius for day2");
		c2 = day2.nextDouble();

		Scanner day3 = new Scanner(System.in);
		System.out.println("\nEnter the Celsius for day3");
		c3 = day3.nextDouble();

		celsiusAverage=((c1 + c2 + c3)/3);
		System.out.println(celsiusAverage);

	}	
} 