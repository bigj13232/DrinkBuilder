package enums;

public enum Source
{
	ANIME("Anime"),
	BOOKS("Books"),
	CARTOONS("Cartoons"),
	COMIC_BOOKS("Comic Books"),
	GAMES("Games"),
	MOCKTAILS("Mocktails"),
	MOVIES("Movies"),
	TV("TV"),
	VIDEO_GAMES("Video Games");
	
	final public String value;
	
	/**
	 * Returns text value of ENUM object
	 * @param s
	 */
	Source(String s)
	{
		value = s;
	}	
}
