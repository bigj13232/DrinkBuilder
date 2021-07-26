package drink;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import helpers.InputHelper;
import helpers.MenuHelper;

public class DrinkHelper
{
	
	@SuppressWarnings("unused")
	public static void addDrink()
	{
		Drink addedDrink = null;
		char mainLoopContinue = 0;
		char ingredientLoop = 0;
		int selection = 0;
		char correct = 0;
		Scanner scanner = new Scanner(System.in);
	
		Ingredient ingredient;
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		
		
		//begin Ingredient variables
		float amount = 0f;
		String measurement;
		String ingredientName;
		String type;
		//end Ingredient variables
		
		
		//begin main loop
		do
		{
			addedDrink = getDrinkDetails(scanner);
			//begin drink ingredient loop
			do
			{
				ingredient = getIngredientDetails(scanner);
				
				addedDrink.addIngredient(ingredient);
				
				//More ingredients to add?
				scanner = new Scanner(System.in);
				System.out.println("Do you have more ingredients to add?(yes/no): ");
				ingredientLoop = InputHelper.getString(scanner).toUpperCase().charAt(0);
				
			}while (ingredientLoop == 'Y');
			//end drink ingredient loop
			
			
			addedDrink.setIngredients(ingredients);		
			
			System.out.println("Drink Info: ");
			System.out.print("Is the above correct?(yes/no): ");
			scanner = new Scanner(System.in);
			mainLoopContinue = InputHelper.getLine().toUpperCase().charAt(0);
		}while (mainLoopContinue == 'N');
		//end main loop
		scanner.close();
		
		
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
	
	/**
	 * Returns the general source of the drink(from Anime, Movies, etc.) based on menu selection
	 * @param selection
	 * @return source
	 */
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
				break;
		}		
		return source;		
	}
	/**
	 * Returns oz, ML or each based on menu selection
	 * @param selection
	 * @return measurement
	 */
	private static String getMeasurement(int selection)
	{
		String measurement = "";
		
		switch(selection)
		{
			case 1:
				measurement = "Ounce(s)";
				break;
			case 2:
				measurement = "ML(s)";
				break;
			case 3:
				measurement = "each";
				break;
			default:
				System.out.println("Invalid Selection.");
				break;
		}
		return measurement;
	}

	/**
	 * Gathers drink details and returns drink object
	 * @param scanner
	 * @return drink
	 */
	private static Drink getDrinkDetails(Scanner scanner)
	{
		//begin Drink variables
		String drinkName;
		String source;
		String origin;
		String directions;
		char isMocktail;
		//end Drink variables
		
		Drink drink;
		
		int selection = 0;
		
		//Get drink name
		System.out.print("Enter drink name: ");
		drinkName = InputHelper.getString(scanner);
		
		
		//begin get source loop
		do
		{
			//get drink source: anime, movie, tv, etc.
			MenuHelper.displaySources();
			System.out.print("Enter selection: ");
			selection = InputHelper.getInt(scanner);
			source = getSource(selection);
		}while(selection > 8);
		//end get source loop	
		
		scanner = new Scanner(System.in);
		//Get drink origin.  What IP is it from? Star Wars, Mario, etc.
		System.out.print("Enter drink origin: ");
		origin = InputHelper.getString(scanner);
		scanner = new Scanner(System.in);
		//Get drink instructions
		System.out.print("Enter drink instructions: ");
		directions = InputHelper.getString(scanner);
		
		//get mocktail
		System.out.print("Is the drink a mocktail? yes/no");
		isMocktail = InputHelper.getString(scanner).toUpperCase().charAt(0);
		
		System.out.println("Drink Name: " + drinkName);
		System.out.println("Drink Source: " + source);
		System.out.println("Drink Origin: " + origin);
		System.out.println("Is the drink a mocktail?" + isMocktail);
		System.out.println("Drink Directions: \n" + directions + "\n");
		
		drink = new Drink(drinkName, source, origin, directions, isMocktail);
		
		return drink;
	}
	
	private static Ingredient getIngredientDetails(Scanner scanner)
	{
		
		float amount;
		String measurement = "";
		String ingredientName = "";
		String type = "";
		
		int selection = 0;
		
		Ingredient ingredient;
		
		char correct;
		
		//Get ingredient amount
		scanner = new Scanner(System.in);
		System.out.print("Enter ingredient amount: ");
		amount = Float.parseFloat(InputHelper.getString(scanner));
		
		//begin get measurement loop
		do
		{
			//get measurement type
			MenuHelper.displayMeasurements();
			System.out.print("Enter selection: ");
			scanner = new Scanner(System.in);
			selection = InputHelper.getInt(scanner);
			measurement = getMeasurement(selection);
		}while(selection > 3);
		//end get measurement loop
		
		//get ingredient name
		System.out.print("Enter ingredient name: ");
		scanner = new Scanner(System.in);
		ingredientName = InputHelper.getString(scanner);
		
		//get ingredient type
		System.out.print("Enter ingredient type: ");
		scanner = new Scanner(System.in);
		type = InputHelper.getString(scanner);		
		
		
		
		ingredient = new Ingredient(amount, measurement, ingredientName, type);
		
		System.out.println(ingredient.toString());
		System.out.println("Is the above correct?");
		scanner = new Scanner(System.in);
		correct = InputHelper.getString(scanner).toUpperCase().charAt(0);
		
		if (correct == 'Y')
		{
			System.out.println("Adding " + ingredient.toString() + " to ingredient list.");
		}
		else if(correct == 'N')
		{
			System.out.println("Clearing imgredient");
			ingredient = null;
		}
		
		return ingredient;
	}
}