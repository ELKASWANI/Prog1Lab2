// This program prompts the user for a name in the format lastname, firstname and output the name in the format Firstname Lastname. The input can contain any mix of upper case and lower case letters. In the output, the first letter of each name should be capitalized, the comma should be removed, and first name should come first.
import java.util.*;

public class Question5{
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);
		System.out.println("\nType the name in the format 'lastname, firstname'");

		String firstFormat = input.nextLine();

		int indexComma = firstFormat.indexOf(',');

		System.out.printf("%nYou have inserted '%s'" , firstFormat);
		System.out.printf("%nIndex of comma is %d" , indexComma);

		String last = firstFormat.substring(0,indexComma);
		
		last = last.substring(0,1).toUpperCase() + last.substring(1).toLowerCase();
		
		String first = firstFormat.substring(indexComma+2);
		first = first.substring(0,1).toUpperCase() + first.substring(1).toLowerCase();

		System.out.printf("%nFirst name is %s " , first);

		System.out.printf("%nlast name is %s ", last);

		System.out.printf("%nThe final format is %s %s", first, last);
	}
}