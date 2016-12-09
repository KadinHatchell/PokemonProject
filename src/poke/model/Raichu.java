package poke.model;

public class Raichu
{
	public Raichu()
	{
		super("Raichu",26);
	}
	
	public Raichu(String name)
	{
		super(name, 26)
	}
	
	public int staticZap()
	{
		return 50;
	}
	
	public int thunder()
	{
		return this.getAttackPoints() * 15;
	}

}
