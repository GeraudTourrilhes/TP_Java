package heritage.animal.regime;

import heritage.aliment.Aliment;
import heritage.animal.Animal;

public abstract class Carnivore extends Regime
{
	public Carnivore() 
	{
		super();
	}
	
	
	public boolean manger(Aliment aliment)
	{
		return aliment.getType().toString() == "Carnivore";
	}

}
