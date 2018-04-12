package heritage;

import heritage.aliment.Aliment;
import heritage.aliment.type.TypeAliment;
import heritage.animal.animals.Homme;
import heritage.animal.animals.Hyene;
import heritage.animal.animals.Lapin;
import heritage.animal.animals.Lion;

public class Main 
{
	public static void main(String[] args) 
	{
		Aliment salade = new Aliment("salade", TypeAliment.Herbivore);
		Aliment homm = new Aliment("homme", TypeAliment.Carnivore);
		Aliment viande = new Aliment("viande", TypeAliment.Carnivore);
		
		Homme homme = new Homme(45, 50, 172, "Ho");
		Hyene hyene = new Hyene(45, 50, 172, "Hy");
		Lion lion = new Lion(45, 50, 172, "Li");
		Lapin lapin = new Lapin(45, 50, 172, "La");
		
		System.out.println(lion.getRegime().manger(salade));
		System.out.println(lion.getRegime().manger(viande));
		System.out.println(hyene.getRegime().manger(homm));
		System.out.println(lapin.getRegime().manger(salade));
		System.out.println(lapin.getRegime().manger(viande));
		System.out.println(homme.getRegime().manger(salade));
		System.out.println(homme.getRegime().manger(viande));
		System.out.println(homme.getRegime().manger(homm));
		
	}

}
