package vehicule;

public interface Vehicule 
{
	public Position getPosition();
	
	public void setDirection(float nord, float sud, float ouest, float est);
	
	public void setSpeed(float speed);

}
