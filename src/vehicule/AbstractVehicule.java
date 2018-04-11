package vehicule;

public abstract class AbstractVehicule implements Vehicule{
	protected Position p;
	protected float nord;
	protected float sud;
	protected float ouest;
	protected float est;
	protected float speed;

	public Position getPosition() 
	{
		return this.p;
	}

	public void setDirection(float nord, float sud, float ouest, float est) 
	{
		this.nord = nord;
		this.sud = sud;
		this.ouest = ouest;
		this.est = est;
		
	}

	public void setSpeed(float speed) 
	{
		this.speed = speed;
	}

}
