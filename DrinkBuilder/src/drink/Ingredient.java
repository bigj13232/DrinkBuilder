package drink;

/**
 * @author jvanek
 *
 */
public class Ingredient
{
	/**
	 * float variable that holds ingredient amount
	 */
	public float amount;
	/**
	 * string variable that holds measurement type(oz, ml, each)
	 */
	public String measurement;
	/**
	 * String variable that holds drink name
	 */
	public String name;	
	/**
	 * String variable that holds ingredient type(Vodka, whiskey, etc.)
	 */
	public String type;
	
	/**
	 * Basic ingredient constructor, sets variables to 0 or null
	 */
	public Ingredient()
	{
		setAmount(0f);
		setMeasurement(null);
		setName(null);
		setType(null);
	}
	
	/**
	 * Basic constructor that creates an ingredient object based on below passed in variables
	 * @param amount
	 * @param measurement
	 * @param name
	 * @param type
	 */
	public Ingredient(float amount, String measurement, String name, String type)
	{
		setAmount(amount);
		setMeasurement(measurement);
		setName(name);
		setType(type);
	}

	/**
	 * Returns ingredient amount
	 * @return amount
	 */
	public float getAmount() {
		return amount;
	}

	/**
	 * Sets ingredient amount
	 * @param amount
	 */
	public void setAmount(float amount) {
		this.amount = amount;
	}

	/**
	 * Returns ingredient measurement type
	 * @return measurement
	 */
	public String getMeasurement() {
		return measurement;
	}

	/**
	 * Sets ingredient measurement type
	 * @param measurement
	 */
	public void setMeasurement(String measurement) {
		this.measurement = measurement;
	}

	/**
	 * Returns ingredient name
	 * @return name
	 */
	public String getName() {
		return name;
	}

	/**
	 * Sets ingredient name
	 * @param name
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Returns ingredient type
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * Sets ingredient type
	 * @param type
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * Update ingredient variables
	 * @param amount
	 * @param measurement
	 * @param name
	 * @param type
	 */
	public void updateIngredient(float amount, String measurement, String name, String type)
	{
		this.amount = amount;
		this.measurement = measurement;
		this.name = name;
		this.type = type;
	}
	
	/**
	 * Returns ingredient details as string
	 * @return amount + " " + measurement + " " + name + " " + type
	 */
	public String toString()
	{
		return amount + " " + measurement + " " + name + " " + type;
	}
	
}