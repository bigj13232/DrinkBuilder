package enums;

public enum Measurement
{
	OUNCE("Ounce(s)"),
	ML("ML(s)"),
	EACH("each.");
	
	final public String value;
	/**
	 * Return string value of enum object
	 * @param s
	 */
	Measurement(String s)
	{
		value = s;
	}	
}