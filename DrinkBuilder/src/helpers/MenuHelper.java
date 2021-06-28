package helpers;
import enums.Measurement;
import enums.Source;
public class MenuHelper 
{
	public static String[] MAIN_MENU = {"Please select a menu option from below:",
										"1: Add a drink to the database","2: Edit a drink in the database","3: Remove a drink in the database","4: View a drink","0: Exit"};
	//private static String[]
	
	/**
	 * Displays menu options based on MAIN_MENU string array
	 * @param menuOptions
	 */
	public static void displayMenu(String[] menuOptions)
	{
		for(int i = 0; i < menuOptions.length;i++)
		{
			System.out.println(menuOptions[i]);
		}
	}
	/**
	 * Display selection options for drink sources based on Source enum
	 */
	public static void displaySources()
	{
		int option = 1;
		System.out.print("Select source:\n");
		for (Source source : Source.values())
		{
			System.out.println(option + ": " + source.value);
			option++;
		}
	}
	/**
	 * Display selection options for drink sources based on Measurement enum
	 */
	public static void displayMeasurements()
	{
		int option = 1;
		System.out.print("Select measurement:\n");
		for (Measurement measurement : Measurement.values())
		{
			System.out.println(option + ": " + measurement.value);
			option++;
		}
	}

}