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
	
	
	
	
	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}

	protected int getPoids() {
		return poids;
	}

	protected void setPoids(int poids) {
		this.poids = poids;
	}

	protected int getTaille() {
		return taille;
	}

	protected void setTaille(int taille) {
		this.taille = taille;
	}

	protected String getNom() {
		return nom;
	}

	protected void setNom(String nom) {
		this.nom = nom;
	}

	protected Regime getRegime() {
		return regime;
	}

	protected void setRegime(Regime regime) {
		this.regime = regime;
	}

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
