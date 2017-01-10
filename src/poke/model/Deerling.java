package poke.model;

import poke.controller.PokemonController;

public class Deerling extends Pokemon implements Grass
{
	
	public Deerling()
	{
		super("Deerling", 585);
	}
	
	public Deerling(String name)
	{
		super(name, 585);
	}

	public Deerling(String name, int number)
	{
		super(name, number);
	}
	
	public int vineAttack()
	{
		return 5;
	}
	
	public int frenzyPlant()
	{
		
		return 10;
	}

}
