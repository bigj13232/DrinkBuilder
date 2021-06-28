package helpers;

import java.util.Scanner;

public class InputHelper
{
	/**
	 * Returns inputed integer
	 * @param scanner
	 * @return returnInt
	 */
	public static int getInt(Scanner scanner)
	{
		int returnInt = 0;
		returnInt = scanner.nextInt();
		return returnInt;
	}
	
	/**
	 * Returns inputed float
	 * @param scanner
	 * @return returnFloat
	 */
	public static float getFloat(Scanner scanner)
	{
		float returnFloat = 0f;
		returnFloat = scanner.nextFloat();
		return returnFloat;
	}
	/**
	 * Returns inputed string
	 * @param scanner
	 * @return returnString
	 */
	public static String getSting(Scanner scanner)
	{
		String returnString = "";
		returnString = scanner.next();
		return returnString;
	}
}