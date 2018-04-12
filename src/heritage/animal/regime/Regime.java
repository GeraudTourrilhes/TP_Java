package heritage.animal.regime;

import heritage.aliment.Aliment;
import heritage.animal.Animal;

public abstract class Regime
{
	
	public abstract boolean manger(Aliment aliment);
	
	public String toString()
	{
		return "Le régime est ";
	}

	public abstract boolean manger(Animal animal);

}