package poke.model;

public class Geodude extends Pokemon implements Rock
{
	
	public Geodude()
	{
		super("Geodude", 74);
	}
	
	public Geodude(String name)
	{
		super(name, 74);
	}

	public Geodude(String name, int number)
	{
		super(name, number);
	}
	
	public int rockTomb()
	{
		return 5;
	}
	
	public int rockThrow()
	{
		
		return 10;
	}

}
