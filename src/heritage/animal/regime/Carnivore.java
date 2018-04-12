package heritage.animal.regime;

import heritage.aliment.Aliment;
import heritage.animal.Animal;

public abstract class Carnivore extends Animal
{
	public Carnivore(int age, int poids, int taille, String nom) {
		super(age, poids, taille, nom);
		// TODO Auto-generated constructor stub
	}

	public boolean manger(Aliment aliment)
	{
		return aliment.getType().toString() == "Carnivore";
	}


}
