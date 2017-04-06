/*Project 2-1: Calculate a rectangle’s area and perimeter
Console
Welcome to the Area and Perimeter Calculator

Enter length: 100
Enter width:  200
Area:         20000.0
Perimeter:    600.0

Continue? (y/n): y

Enter length: 8
Enter width:  4
Area:         32.0
Perimeter:    24.0

Continue? (y/n): n
Operation
•	The application prompts the user to enter values for the length and width of a rectangle.
•	The application displays the area and perimeter of the rectangle.
•	The application prompts the user to continue.
Specifications
•	The formulas for calculating area are perimeter are:
area = width * length
perimeter = 2 * width + 2 * length
•	The application should accept decimal entries like 10.5 and 20.65.
•	Assume that the user will enter valid numeric data for the length and width.
•	The application should continue only if the user enters “y” or “Y” to continue.
*/

import java.util.Scanner;

public class AreaAndPerimeterApp {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Area and Perimeter Caluclator");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		double width = 0.0;
		double length = 0.0;
		String choice = "y";
		OOValidator ooval = new OOValidator(sc);
		
		//perform calculations until the choice is not y or Y
		
		while (!choice.equalsIgnoreCase("n"))
		{
			//Get input from user
			length = ooval.getDouble("Enter length: ");
			
			width = ooval.getDouble("Enter width: ");
			
			
			//do calculations
			double area = length * width;
			double perimeter = 2 * width + 2 * length;
			//display area and perimeter
			String message = "Area: " + area + "\n"
						   + "Perimeter: " + perimeter;
			System.out.println(message);
			
			//get user's choice
			choice = ooval.getChoiceString("Continue? (y/n)", "y", "n");
			
			System.out.println();
			
			
			
			
		}
		
	}

}
