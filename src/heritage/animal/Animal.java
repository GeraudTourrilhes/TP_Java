package heritage.animal;

import heritage.aliment.Aliment;
import heritage.animal.regime.Regime;

public abstract class Animal 
{
	private int age;
	private int poids;
	private int taille;
	private String nom;
	private Regime regime;
	
	
	
	public Animal(int age, int poids, int taille, String nom,  Regime regime) 
	{
		this.age = age;
		this.poids = poids;
		this.taille = taille;
		this.nom = nom;
		this.regime = regime;
	}
	
	public abstract void deplacer();

}
