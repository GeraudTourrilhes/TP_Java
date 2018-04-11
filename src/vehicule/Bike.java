package vehicule;

public class Bike extends AbstractVehicule
{
	private TypeBike type;

	
	public Bike(Position p, Direction d, TypeBike type) 
	{
		super(p, d);
		this.type = type;
	}
	
	public void move()
	{
		
	}
}
