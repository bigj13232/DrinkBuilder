package drink;

import java.util.ArrayList;
import java.util.List;

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
		
		//begin Drink variables
		String drinkName;
		String source;
		String origin;
		String directions;
		char isMocktail;
		Ingredient ingredient;
		List<Ingredient> ingredients = new ArrayList<Ingredient>();
		//end Drink variables
		
		//begin Ingredient variables
		float amount = 0f;
		String measurement;
		String ingredientName;
		String type;
		//end Ingredient variables
		
		
		//begin main loop
		do
		{
			//Get drink name
			System.out.print("Enter drink name: ");
			drinkName = InputHelper.getLine();
			
			
			//begin get source loop
			do
			{
				//get drink source: anime, movie, tv, etc.
				MenuHelper.displaySources();
				System.out.print("Enter selection: ");
				selection = InputHelper.getInt();
				source = getSource(selection);
			}while(selection > 8);
			//end get source loop
			
			
			//Get drink origin.  What IP is it from? Star Wars, Mario, etc.
			System.out.print("Enter drink origin: ");
			origin = InputHelper.getLine();
			
			//Get drink instructions
			System.out.print("Enter drink instructions: ");
			directions = InputHelper.getLine();	
			
			//get mocktail
			System.out.print("Is the drink a mocktail? yes/no");
			isMocktail = InputHelper.getLine().toUpperCase().charAt(0);
			
			//begin drink ingredient loop
			do
			{
				//Get ingredient amount
				System.out.print("Enter ingredient amount: ");
				amount = Float.parseFloat(InputHelper.getLine());
				
				//begin get measurement loop
				do
				{
					//get measurement type
					MenuHelper.displayMeasurements();
					System.out.print("Enter selection: ");
					selection = InputHelper.getInt();
					measurement = getMeasurement(selection);
				}while(selection > 3);
				//end get measurement loop
				
				//get ingredient name
				System.out.print("Enter ingredient name: ");
				ingredientName = InputHelper.getLine();
				
				//get ingredient type
				System.out.print("Enter ingredient type: ");
				type = InputHelper.getLine();				
				
				
				
				ingredient = new Ingredient(amount, measurement, ingredientName, type);
				
				System.out.println(ingredient.toString());
				System.out.println("Is the above correct?");
				correct = InputHelper.getLine().toUpperCase().charAt(0);
				
				if (correct == 'Y')
				{
					System.out.println("Adding " + ingredient.toString() + " to ingredient list.");
					ingredients.add(ingredient);
				}
				else if(correct == 'N')
				{
					System.out.println("Clearing imgredient");
					ingredient = null;
				}
				
				//More ingredients to add?
				System.out.println("Do you have more ingredients to add?(yes/no): ");
				ingredientLoop = InputHelper.getLine().toUpperCase().charAt(0);
				
			}while (ingredientLoop == 'Y');
			//end drink ingredient loop
			
			addedDrink = new Drink(drinkName, source, origin, directions, isMocktail);
			addedDrink.setIngredients(ingredients);		
			
			System.out.println("Drink Info: ");
			System.out.print("Is the above correct?(yes/no): ");
			mainLoopContinue = InputHelper.getLine().toUpperCase().charAt(0);
		}while (mainLoopContinue == 'N');
		//end main loop
		
		
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
				break;
		}		
		return source;		
	}
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
}