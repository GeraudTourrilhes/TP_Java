package vehicule;

public class Direction 
{
	private float nord;
	private float sud;
	private float ouest;
	private float est;
	
	
	
	public Direction(float nord, float sud, float ouest, float est) 
	{
		this.nord = nord;
		this.sud = sud;
		this.ouest = ouest;
		this.est = est;
	}
	public float getNord() 
	{
		return nord;
	}
	public void setNord(float nord) 
	{
		this.nord = nord;
	}
	public float getSud() 
	{
		return sud;
	}
	public void setSud(float sud) 
	{
		this.sud = sud;
	}
	public float getOuest() 
	{
		return ouest;
	}
	public void setOuest(float ouest) 
	{
		this.ouest = ouest;
	}
	public float getEst() 
	{
		return est;
	}
	public void setEst(float est) 
	{
		this.est = est;
	}
	@Override
	public String toString() {
		return "Votre direction est " + nord + " au nord, " + sud + " au sud, " + est + " a l'est, " + ouest + " a l'ouest, ";
	}
	
	
	

}
