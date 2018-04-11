package vehicule;

public class Main {

	public static void main(String[] args) 
	{
		Position position = new Position(5, 500);
		Direction direction = new Direction(10, 0 , 5, 0);
		Bike bike = new Bike(position, direction, TypeBike.VTT);
		
		System.out.println(bike.getPosition());
		
		bike.setDirection(5, 0, 0, 5);
		
		bike.setSpeed((float) 300.5);
		
		System.out.println(bike.getSpeed());
		
		System.out.println(bike.getDirection());

	}

}
