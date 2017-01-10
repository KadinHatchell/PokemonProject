package poke.model;

import poke.controller.PokemonController;

public class Incineroar extends Pokemon implements Fire
{
	
	public Incineroar()
	{
		super("Incineroar", 727);
	}
	
	public Incineroar(String name)
	{
		super(name, 727);
	}

	public Incineroar(String name, int number)
	{
		super(name, number);
	}
	
	public int Ember()
	{
		return 5;
	}
	
	public int FlameWheel()
	{
		
		return 10;
	}


}
