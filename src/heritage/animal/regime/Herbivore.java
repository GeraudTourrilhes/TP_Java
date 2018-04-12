package heritage.animal.regime;

import heritage.aliment.Aliment;
//import heritage.animal.Animal;

public class Herbivore extends Regime
{
	public Herbivore() 
	{
		super();
	}
	
	public boolean manger(Aliment aliment)
	{
		return aliment.getType().toString() == "Herbivore";
	}


	public String toString() 
	{
		return super.toString() + "Herbivore";
	}
	
	
}
