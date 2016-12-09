package poke.controller;

import java.util.ArrayList;

import poke.model.*;
import poke.view.PokeFrame;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class PokeController
{
	private ArrayList<Pokemon> pokedex;
	private PokeFrame appFrame;
	
	public PokeController()
	{
		pokedex = new ArrayList<Pokemon>();
		buildPokedex();
		
		appFrame = new PokeFrame(this);
	}
	
	
	public void start()
	{
	
		
	}
	
	private void buildPokedex()
	{
		pokedex.add(new Geodude("derpy"));
		pokedex.add(new Pikachu("Pika"));
	}
	
	public String[] buildPokedexText()
	{
		String [] pokemonNames = new String[pokedex.size()];
		
		for(int index = 0; index < pokedex.size(); index++)
		{
			pokemonNames[index] = pokedex.get(index).getName();
		}
		
	}
	
	public void updateSelected(int index, String name, int combat, int health, double speed)
	{
		Pokemon current = pokedex.get(index);
		current.setName(name);
		current.setAttackPoints(combat);
		current.setSpeed(speed);
		current.setHealthPoints(health);
	}
	
	public ArrayList<Pokemon> getPokedex() 
	{
		
		return pokedex;
	}


	public void setPokedex(ArrayList<Pokemon> pokedex) 
	{
		this.pokedex = pokedex;
	}



	public PokeFrame getBaseFrame() 
	{
		return appFrame;
	}


	public void setBaseFrame(PokeFrame baseFrame) 
	{
		this.appFrame = baseFrame;
	}
	
	
}
