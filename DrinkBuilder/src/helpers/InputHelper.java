package helpers;

import java.util.Scanner;

public class InputHelper
{
	/**
	 * Returns inputed integer
	 * @param scanner
	 * @return returnInt
	 */
	public static int getInt()
	{
		Scanner scanner = new Scanner(System.in);
		int returnInt = 0;
		returnInt = scanner.nextInt();
		scanner.close();
		return returnInt;
	}
	
	/**
	 * Returns inputed float
	 * @param scanner
	 * @return returnFloat
	 */
	public static float getFloat()
	{
		float returnFloat = 0f;
		Scanner scanner = new Scanner(System.in);
		returnFloat = scanner.nextFloat();
		scanner.close();
		return returnFloat;
	}
	/**
	 * Returns inputed string
	 * @param scanner
	 * @return returnString
	 */
	public static String getString()
	{
		String returnString = "";
		Scanner scanner = new Scanner(System.in);
		returnString = scanner.next();
		scanner.close();
		return returnString;
	}
	
	/**
	 * Returns full line as string
	 * @param scanner
	 * @return
	 */
	public static String getLine()
	{
		String returnString = "";
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");
		returnString = scanner.nextLine();
		scanner.close();
		return returnString;
	}
}