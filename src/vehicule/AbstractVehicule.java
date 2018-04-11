package vehicule;

public abstract class AbstractVehicule implements Vehicule{
	private Position p;
	private float nord;
	private float sud;
	private float ouest;
	private float est;
	private float speed;

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
