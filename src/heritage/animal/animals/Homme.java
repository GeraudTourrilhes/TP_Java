package heritage.animal.animals;

import heritage.aliment.Aliment;
import heritage.animal.Animal;
//import heritage.animal.regime.Omnivore;

public class Homme extends Animal//Omnivore
{
	


	public Homme(int age, int poids, int taille, String nom) {
		super(age, poids, taille, nom);
		// TODO Auto-generated constructor stub
	}

	public void deplacer() 
	{
		
		
	}

	public boolean manger(Aliment aliment) 
	{
		return true;
	}

}
