package FeetAndInchesToCentimeters;

/*
 * - Create a method called calcFeetAndInchesToCentimeters:
 * 		- Needs to have two parameters (feet and inches)
 * 
 * - Validate the 1st parameter feet is >=0
 * - Validate the 2nd parameter inches is >=0 and <=12
 * 		- return -1 from the method if either of the above is not true
 * 
 * - If parameters are valid, then calculate how many centimeters comprise the feet and inches passed to this method nad return the value
 * 
 * - Create a 2nd method of same name but with only one parameter (inches)
 * - Validate that it is >= 0; return -1 if it is not true
 * - If its valid, calculate how many feet are in the inches 
 * 		- call other overloaded method passing the correct feet and inches calculated so that it can calculate correctly
 */

public class Main {

	public static void main(String[] args) {
		
		//Calling method to convert feet to centimeters
		double newFeet = calcFeetAndInchesToCentimeters(4, 3);
		System.out.println("The conversion of feet to centimeters is: " + newFeet);
		
		//Calling method to convert inches to centimeters
		double newInches = calcFeetAndInchesToCentimeters(6);
		System.out.println("The conversion of inches to centimeters is: " + newInches);
	
	}
	
	//Overloading Methods here:
	public static double calcFeetAndInchesToCentimeters(double feet, double inches)
	{
		if (feet >= 0)
		{
			//System.out.println("The calculated feet to centimeters is: " + feet);
		}
		else 
		{
			System.out.println(-1);
		}
		return (feet * 0.032808);
	}
	
	public static double calcFeetAndInchesToCentimeters(double inches)
	{
		if (inches >=0 && inches <=12)
		{
			//System.out.println("The calculated inches to centimeters is: " + inches);
			
		}
		else
		{
			System.out.println(-1);
		}
		return (inches * 0.39370);
	}
	
}
