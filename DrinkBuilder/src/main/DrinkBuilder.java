package main;

import drink.DrinkHelper;
import helpers.InputHelper;
import helpers.MenuHelper;

public class DrinkBuilder
{
	public static void main(String[] args)
	{		
		/**
		 * Class variables
		 */
		int menuOption = 1;
		
		System.out.println("Welcome to the Drink Database Builder");
		do
		{
			MenuHelper.displayMenu(MenuHelper.MAIN_MENU);
			System.out.print("Please enter selection: ");
			menuOption = InputHelper.getInt();
			
			
			switch(menuOption) {
				case 1:
					DrinkHelper.addDrink();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 0:
					System.out.println("Thank you for using the Drink Database Builder");
					break;
				default:
					System.out.println("Invalid menu option, try again");
					break;
			}
		}while(menuOption != 0);
	}

}
