package heritage.animal;

public abstract class Animal 
{
	private int age;
	private int poids;
	private int taille;
	private String nom;
	
	public abstract void manger(Aliment aliment);
	
	public abstract void deplacer();

}
