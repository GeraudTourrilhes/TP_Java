package vehicule;

public class Position 
{
	private float latittude;
	private float longitude;
	
	
	public Position(float latittude, float longitude) {
		super();
		this.latittude = latittude;
		this.longitude = longitude;
	}
	
	public float getLatittude() {
		return latittude;
	}
	public void setLatittude(float latittude) {
		this.latittude = latittude;
	}
	public float getLongitude() {
		return longitude;
	}
	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}

	public String toString() {
		return "La position est : " + latittude + " en latitude et " + longitude + " en longitude";
	}
	
	
	

}
