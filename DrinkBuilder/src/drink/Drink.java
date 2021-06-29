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
	private String category = "";
	
	/**
	* A String to track drink instructions
	*/
	private String directions = "";
	
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
	}
	
	/**
	 * Basic drink constructor, includes: name, source, category and directions
	 * @param name
	 * @param source
	 * @param category
	 * @param directions
	 */
	public Drink(String name, int ingredientCount, String source, String category, String directions)
	{
		setName(name);
		setIngredientCount(ingredientCount);
		setSource(source);
		setCategory(category);
		setDirections(directions);
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
		return category;
	}

	/**
	 * Sets drink category to category
	 * @param category
	 */
	public void setCategory(String category) {
		this.category = category;
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
	 * Returns numver of ingredients in drink
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
}