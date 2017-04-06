/*Project 8-1: Create an object-oriented validation class
Console
 

Int Test
Enter an integer between -100 and 100: x
Error! Invalid integer value. Try again.
Enter an integer between -100 and 100: -101
Error! Number must be greater than -101
Enter an integer between -100 and 100: 101
Error! Number must be less than 101
Enter an integer between -100 and 100: 100

Double Test
Enter any number between -100 and 100: x
Error! Invalid decimal value. Try again.
Enter any number between -100 and 100: -101
Error! Number must be greater than -101.0
Enter any number between -100 and 100: 101
Error! Number must be less than 101.0
Enter any number between -100 and 100: 100

Required String Test
Enter your email address:
Error! This entry is required. Try again.
Enter your email address: joelmurach@yahoo.com

String Choice Test
Select one (x/y):
Error! This entry is required. Try again.
Select one (x/y): q
Error! Entry must be 'x' or 'y'. Try again.
Select one (x/y): x

Operation
•	This application prompts the user to enter a valid integer within a specified range, a valid double within a specified range, a required string, and one of two strings. If an entry isn’t valid, the application displays an appropriate error message.
Specifications
•	Create a class named OOValidator that contains these constructors and methods:
public OOValidator(Scanner sc)
public int getInt(String prompt)
public int getIntWithinRange(String prompt, int min, int max)
public double getDouble(String prompt)
public double getDoubleWithinRange(String prompt, 
    double min, double max)
You can use the Validator class that’s provided as a starting point for coding the methods in this class.
•	Create a class named MyValidator that extends the OOValidator class. This class should add two new methods:
public String getRequiredString(String prompt)
public String getChoiceString(String prompt, 
	String s1, String s2)
•	Create a class named ValidatorTestApp and use it to test the methods in the Validator, OOValidator, and MyValidator classes.
*/

import java.util.Scanner;

public class OOValidator{

	Scanner sc;
	public OOValidator(Scanner sc){
		this.sc = sc;
		
	}
	public int getInt(String prompt)
	{
		int i = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			if (sc.hasNextInt())
			{
				i = sc.nextInt();
				isValid = true;
			}
			else
			{
				System.out.println("Error! Invalid integer value. Try again.");
			}
			sc.nextLine();  // discard any other data entered on the line
		}
		return i;
	}

	public int getIntWithinRange(String prompt,
	int min, int max)
	{
		int i = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			i = getInt(prompt);
			if (i <= min)
				System.out.println(
					"Error! Number must be greater than " + min);
			else if (i >= max)
				System.out.println(
					"Error! Number must be less than " + max);
			else
				isValid = true;
		}
		return i;
	}

	public double getDouble(String prompt)
	{
		double d = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			System.out.print(prompt);
			if (sc.hasNextDouble())
			{
				d = sc.nextDouble();
				isValid = true;
			}
			else
			{
				System.out.println("Error! Invalid decimal value. Try again.");
			}
			sc.nextLine();  // discard any other data entered on the line
		}
		return d;
	}

	public double getDoubleWithinRange(String prompt,
	double min, double max)
	{
		double d = 0;
		boolean isValid = false;
		while (isValid == false)
		{
			d = getDouble(prompt);
			if (d <= min)
				System.out.println(
					"Error! Number must be greater than " + min);
			else if (d >= max)
				System.out.println(
					"Error! Number must be less than " + max);
			else
				isValid = true;
		}
		return d;
	}
	public String getRequiredString(String prompt) {
		String s = "";
		boolean isValid = false;
		while (isValid == false) {
			System.out.println(prompt);
			s = sc.nextLine();
			if (s.equals("")) {
				System.out.println("Error! This entry required. Try again.");
				
			} else {
				isValid = true;
			}
			
		}
		return s;
	}
	public String getChoiceString(String prompt, String s1, String s2) {
		String s = "";
		boolean isValid = false;
		while (isValid == false) {
			System.out.println(prompt);
			s = sc.nextLine();
			if (s.equalsIgnoreCase(s1) || (s.equalsIgnoreCase(s2))) {
				isValid = true;				
			} 
			else if (s.length()<1) {
				System.out.println("Error! This entry required. Try again.");
				
			}
			else
				System.out.println("Error! This entry must be " + s1 + " or " + s2 + "." + "Try again.");
			
		}
		return s;
	}

}