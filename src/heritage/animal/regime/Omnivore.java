package heritage.animal.regime;

import heritage.aliment.Aliment;
import heritage.animal.Animal;

public class Omnivore extends Regime
{
	public Omnivore() 
	{
	}
	

	public boolean manger(Aliment aliment)
	{
		return true;
	}
}
