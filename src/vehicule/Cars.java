package vehicule;

public class Cars extends AbstractVehicule 
{
	private int volumeEssence;
	private int puissance;
	private int CO2;

	
	public Cars(Position p, Direction d, int volumeEssence, int puissance, int CO2) 
	{
		super(p, d);
		this.volumeEssence = volumeEssence;
		this.puissance = puissance;
		this.CO2 = CO2;
	}


	public int getVolumeEssence() {
		return volumeEssence;
	}


	public void setVolumeEssence(int volumeEssence) {
		this.volumeEssence = volumeEssence;
	}


	public int getPuissance() {
		return puissance;
	}


	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}


	public int getCO2() {
		return CO2;
	}


	public void setCO2(int cO2) {
		CO2 = cO2;
	}
	
	

}
