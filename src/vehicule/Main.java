package vehicule;

public class Main {

	public static void main(String[] args) 
	{
		Position position = new Position(5, 500);
		Position position1 = new Position(5, 50);
		Direction direction = new Direction(10, 0 , 5, 0);
		Bike bike = new Bike(position, direction, TypeBike.VTT);
		Car car = new Car(position1, direction, 30, 200, 100);
		
		
		System.out.println(bike.getPosition());
		
		bike.setDirection(5, 0, 0, 5);
		
		bike.setSpeed((float) 300.5);
		
		System.out.println(bike.getSpeed());
		
		System.out.println(bike.getDirection());
		
		System.out.println(car);

	}

}