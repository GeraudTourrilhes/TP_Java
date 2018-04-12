package heritage;


import heritage.aliment.Aliment;
import heritage.aliment.type.TypeAliment;
import heritage.animal.animals.*;


public class Main 
{
	public static void main(String[] args) 
	{
		Aliment salade = new Aliment("salade", TypeAliment.Herbivore);
		Aliment viande = new Aliment("viande", TypeAliment.Carnivore);
		
		Homme homme = new Homme(45, 50, 172, "Ho");
		Hyene hyene = new Hyene(45, 50, 172, "Hy");
		Lion lion = new Lion(45, 50, 172, "Li");
		Lapin lapin = new Lapin(45, 50, 172, "La");
		
		
		System.out.println("Lion:");
		System.out.println(lion.getRegime());
		System.out.println(lion.manger(salade));
		System.out.println(lion.manger(viande));
		System.out.println(lion.manger(lapin));
		
		
		System.out.println();
		System.out.println("Hyène:");
		System.out.println(hyene.getRegime());
		System.out.println(hyene.manger(lion));
		
		System.out.println();
		System.out.println("Lapin:");
		System.out.println(lapin.getRegime());
		System.out.println(lapin.manger(salade));
		System.out.println(lapin.manger(viande));
		System.out.println(lapin.manger(homme));
		
		System.out.println();
		System.out.println("Homme:");
		System.out.println(homme.getRegime());
		System.out.println(homme.manger(salade));
		System.out.println(homme.manger(viande));
		System.out.println(homme.manger(homme));
		
	}

}
