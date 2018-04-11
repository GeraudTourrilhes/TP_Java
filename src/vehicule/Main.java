package vehicule;

public class Main {

	public static void main(String[] args) 
	{
		Position p = new Position(5, 500);
		Bike b = new Bike(p);
		
		System.out.println(b.getPosition());
		
		b.setSpeed((float) 300.5);
		
		b.setDirection(50, 0, 0, 50);
		
		

	}

}
