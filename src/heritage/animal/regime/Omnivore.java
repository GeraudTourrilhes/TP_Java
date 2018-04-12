package heritage.animal.regime;

import heritage.aliment.Aliment;
import heritage.animal.Animal;

public abstract class Omnivore extends Regime
{
	public Omnivore() 
	{
		super();
	}
	

	public boolean manger(Aliment aliment)
	{
		return true;
	}
}
