//This program prompts the user for an amount of seconds and displays the time in the format minutes:seconds.

import java.util.*;

public class Question3{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("Type the number of seconds");

		int totalSeconds = input.nextInt();
		int minutes = totalSeconds/60;
		int seconds = totalSeconds % 60;

		System.out.printf("The request output is %d:%d", minutes, seconds);
		System.out.println("The request output is " + minutes + ":" + seconds);
	}
}