package poke.model;

public class UltraPowerfulPokemon extends Pokemon implements Electric, Rock, Water, Grass
{
	public UltraPowerfulPokemon()
	{
		super("digimon", -99999);
	}
	
	public UltraPowerfulPokemon(String name)
	{
		super (name, -99999);
	}
	
	public int itch()
	{
		return 999999999;
	}
	public int vineAttack()
	{
		return 0;
	}
	public int frenzyPlant()
	{
		return 0;
	}
	public int shootWater()
	{
		return 0;
	}
	public int bubbleAttack()
	{
		return 0;
	}
	public int rockTomb()
	{
		return 0;
	}
	public int rockThrow()
	{
		return 0;
	}

	public int staticZap()
	{
		return 0;
	}

	public int thunder()
	{
		return 0;
	}

}
