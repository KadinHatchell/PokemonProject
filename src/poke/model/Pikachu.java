package poke.model;

import poke.controller.PokemonController;

public class Pikachu extends Pokemon implements Electric
{
	public Pikachu()
	{
		super("Pikachu", 25);
	}
	
	public Pikachu(String name)
	{
		super(name, 25);
	}
	/**
	 Two parameter constructor for Raichu class. If using with Pikachu supply 25 for number.
	 @param name The name of this Pikachu.
	 @param number Should be 25 for Pikachu.
	 */
	public Pikachu(String name, int number)
	{
		super(name, number);
	}
	
	public int staticZap()
	{
		return 2;
	}
	
	public int thunder()
	{
		
		return 6;
	}

}
