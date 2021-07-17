package drink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import helpers.InputHelper;
import helpers.MenuHelper;

import java.util.Collections;

public class DrinkHelper
{
	
	public static void addDrink()
	{
		Scanner scanner = new Scanner(System.in);
		Drink addedDrink = null;
		char loopContinue = 0;
		int selection = 0;
		
		//begin Drink variables
		String drinkName;
		String source;
		String origin;
		String directions;
		Ingredient ingredient;
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		//end Drink variables
		
		//begin Ingredient variables
		float amount = 0f;
		String measurement;
		String ingredientName;
		String type;
		//end Ingredient variables
		
		
		
		do
		{
			System.out.print("Enter drink name: ");
			drinkName = InputHelper.getSting(scanner);
			
			MenuHelper.displaySources();
			System.out.print("Enter selection: ");
			selection = InputHelper.getInt(scanner);
			source = getSource(selection);
			
			System.out.print("Enter drink origin: ");
			origin = InputHelper.getSting(scanner);
			
			
			System.out.print("Is the above correct?(yes/no): ");
			loopContinue = InputHelper.getSting(scanner).toUpperCase().charAt(0);
		}while (loopContinue == 'N');
		
		
	}
	
	public static void editDrink()
	{
		
	}
	
	public static void removeDrink()
	{
		
	}
	
	public static void viewDrink()
	{
		
	}
	
	private static String getSource(int selection)
	{
		String source = "";
		
		switch(selection)
		{
			case 1:
				source = "Anime";
				break;
			case 2:
				source = "Books";
				break;
			case 3:
				source = "Cartoons";
				break;
			case 4:
				source = "Comic Books";
				break;
			case 5:
				source = "Games";
				break;
			case 6:
				source = "Movies";
				break;
			case 7:
				source = "TV";
				break;
			case 8:
				source = "Video Games";
				break;
			default:
				System.out.println("Invalid Selection.");
		}
		
		return source;
		
	}

}