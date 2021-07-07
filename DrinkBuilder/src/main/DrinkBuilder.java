package main;

import java.util.Scanner;

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
		Scanner menuInput = new Scanner(System.in);
		
		do
		{
			MenuHelper.displayMenu(MenuHelper.MAIN_MENU);
			System.out.print("Please enter selection: ");
			menuOption = InputHelper.getInt(menuInput);
			
			
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
				default:
					System.out.println("Invalid menu option, try again");
					break;
			}
		}while(menuOption != 0);
		
		menuInput.close();
	}

}
