package heritage.animal.regime;

import heritage.aliment.Aliment;

public abstract class Regime 
{
	
	public abstract boolean manger(Aliment aliment);
	
	public String toString()
	{
		return "Le régime est ";
	}

}
