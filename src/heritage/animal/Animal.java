package heritage.animal;

public abstract class Animal 
{
	private int age;
	private int poids;
	private int taille;
	private String nom;
	
	
	
	public Animal(int age, int poids, int taille, String nom) 
	{
		this.age = age;
		this.poids = poids;
		this.taille = taille;
		this.nom = nom;
	}

	public abstract boolean manger(Aliment aliment);
	
	public abstract void deplacer();

}
