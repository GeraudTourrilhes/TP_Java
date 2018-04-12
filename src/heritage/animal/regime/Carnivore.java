package heritage.animal.regime;

import heritage.aliment.Aliment;
//import heritage.animal.Animal;

public class Carnivore extends Regime
{
	public Carnivore() 
	{
		super();
	}
	
	
	public boolean manger(Aliment aliment)
	{
		return aliment.getType().toString() == "Carnivore";
	}
	
	public String toString() 
	{
		return super.toString() + "Carnivore";
	}

}
