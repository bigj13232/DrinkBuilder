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
		scanner = new Scanner(System.in);
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
	public static String getString(Scanner scanner)
	{
		String returnString = "";	
		returnString = scanner.nextLine();
		return returnString;
	}
	
	/**
	 * Returns full line as string
	 * @param scanner
	 * @return
	 */
	@SuppressWarnings("resource")
	public static String getLine()
	{
		String returnString = "";
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");		
		returnString = scanner.next();
		return returnString;
	}
}