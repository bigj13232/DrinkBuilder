package drink;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * @author John Vanek
 *
 */
public class Drink {
	/**
	* A String to track drink name
	*/
	private String name = "";
	
	/**
	 * A integer to track # of ingredients in drink
	 */
	private int ingredientCount = 0;
	
	/**
	* A String to track drink source
	*/
	private String source = "";
	
	/**
	* A String to track drink category(video game, TV, book, etc.)
	*/
	private String origin = "";
	
	/**
	* A String to track drink instructions
	*/
	private String directions = "";
	
	/**
	 * char variable to track whether drink is a mocktail
	 */
	private char isMocktail;
	
	/**
	* A List of Ingredients to track drink ingredients
	*/
	private List<Ingredient> ingredients = new ArrayList<Ingredient>();
	
	/**
	 * Basic drink constructor, sets drink variables to null
	 */
	public Drink()
	{
		setName(null);
		setSource(null);
		setCategory(null);
		setDirections(null);
		setMocktail('N');
	}
	
	/**
	 * Basic drink constructor, includes: name, source, category and directions
	 * @param name
	 * @param source
	 * @param category
	 * @param directions
	 */
	public Drink(String name, String source, String category, String directions, char isMocktail)
	{
		setName(name);
		setSource(source);
		setCategory(category);
		setDirections(directions);
		setMocktail(isMocktail);
	}
	
	/**
	 * Returns drink name
	 * @return name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * Sets drink name to name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Returns the source of the drink
	 * @return source
	 */
	public String getSource() {
		return source;
	}
	
	/**
	 * Sets drink origin to origin
	 * @param source
	 */
	public void setSource(String source) {
		this.source = source;
	}

	/**
	 * Returns the category of the drink
	 * @return category
	 */
	public String getcategory() {
		return origin;
	}

	/**
	 * Sets drink category to category
	 * @param category
	 */
	public void setCategory(String origin) {
		this.origin = origin;
	}

	/**
	 * Returns a list of drink ingredients
	 * @return ingredients
	 */
	public List<Ingredient> getIngredients() {
		return ingredients;
	}

	/**
	 * Copies a passed in list of ingredients to the drinks ingredients
	 * @param ingredients
	 */
	public void setIngredients(List<Ingredient> ingredients) {
		try
		{
			Collections.copy(this.ingredients, ingredients);
			this.ingredientCount = this.ingredients.size();
		}
		
		catch (IllegalArgumentException e) {
			System.out.println("Exception thrown : " + e);
	    }
	  
	    catch (IndexOutOfBoundsException e) {
	    	System.out.println("Exception thrown : " + e);
	    }
	}
	
	/**
	 * Adds an ingredient to the drinks list of ingredients
	 * @param amount
	 * @param measurement
	 * @param name
	 * @param type
	 */
	public void addIngredient(float amount, String measurement, String name, String type)
	{
		Ingredient tempIngredient = new Ingredient(amount, measurement, name, type);
		
		ingredients.add(tempIngredient);		
	}
	
	/**
	 * Returns the drink instructions
	 * @return directions
	 */
	public String getDirections() {
		return directions;
	}

	/**
	 * Sets drink instructions
	 * @param directions
	 */
	public void setDirections(String directions) {
		this.directions = directions;
	}
	
	/**
	 * Returns boolean value - true for mocktail, false for alcoholic
	 * @return isMocktail
	 */
	public char isMocktail() {
		return isMocktail;
	}

	/**
	 * Sets boolean value to determine if drink is a mocktail/alcoholic
	 * @param isMocktail
	 */
	public void setMocktail(char isMocktail) {
		this.isMocktail = isMocktail;
	}

	
	/**
	 * Returns number of ingredients in drink
	 * @return ingredientCount
	 */
	public int getIngredientCount() {
		return ingredientCount;
	}

	/**
	 * Sets ingredient count of object to ingredientCount
	 * @param ingredientCount
	 */
	public void setIngredientCount(int ingredientCount) {
		this.ingredientCount = ingredientCount;
	}
	
	/**
	 * Returns drink details in easy to read format
	 */
	public String toString()
	{
		String output = "";
		
		output = output + "Drink Name: " + this.name + "\n";
		output = output + "Drink Source: " + this.source + "\n";
		output = output + "Drink Origin: " + this.origin + "\n";
		output = output + "Drink Directions: " + this.directions + "\n";
		if(isMocktail == 'Y')
			output = output + "Drink is a Mocktail.\n";
		else if (isMocktail == 'N')
			output = output + "Drink is not a Mocktail.\n";
		else
			output = output + "Mocktail variable incorrect. \n";
		output = output + "This drink has " + this.ingredientCount + " ingredients.\n";
		
		for(Ingredient ingredient : this.ingredients )
		{
			output = output + ingredient.toString() + "\n";
		}		
		return output;
	}
}