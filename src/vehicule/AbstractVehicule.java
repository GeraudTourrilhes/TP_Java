package vehicule;

public abstract class AbstractVehicule implements Vehicule{
	private Position position;
	private Direction direction;
	private float speed;
	private int poids;
	private String couleur;
	private String marque;
	private String modele;
	
	public AbstractVehicule(Position p, Direction d)
	{
		this.position = p;
		this.direction = d;
		this.speed = 0;
	}
	
	public void setPosition(Position p)
	{
		this.position = p;
	}
	
	public Position getPosition() 
	{
		return this.position;
	}
	
	public Direction getDirection()
	{
		return this.direction;
	}

	public void setDirection(float nord, float sud, float est, float ouest) 
	{
		direction.setNord(nord);
		direction.setSud(sud);
		direction.setEst(est);
		direction.setOuest(ouest);
		
	}

	public void setSpeed(float speed) 
	{
		this.speed = speed;
	}
	
	public float getSpeed()
	{
		return this.speed;
	}

	public int getPoids() {
		return poids;
	}

	public void setPoids(int poids) {
		this.poids = poids;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	
	
}
