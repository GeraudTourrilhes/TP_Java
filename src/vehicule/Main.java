package vehicule;

public class Main {

	public static void main(String[] args) 
	{
		Position p = new Position(5, 500);
		Direction d = new Direction(50, 0 , 50, 0);
		Bike b = new Bike(p, d);
		
		System.out.println(b.getPosition());
		
		b.setDirection(50, 0, 0, 50);
		
		b.setSpeed((float) 300.5);
		
		System.out.println(b.getSpeed());
		
		System.out.println(b.getDirection());

	}

}
