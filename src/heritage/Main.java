package heritage;

import heritage.animal.animals.Homme;
import heritage.animal.regime.Omnivore;
import heritage.animal.regime.Regime;

public class Main 
{
	public static void main(String[] args) 
	{
		Homme h = new Homme(45, 50, 172, "", new Omnivore());
	}

}
