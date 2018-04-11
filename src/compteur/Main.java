package compteur;

public class Main {

	public static void main(String[] args) 
	{
		Counter counter = new Counter();
		Counter counter1 = new Counter();
		
		System.out.println(counter.getValue());
		counter.inc();
		System.out.println(counter.getValue());
		System.out.println(counter.equals(counter1));
		counter1.inc();
		System.out.println(counter.equals(counter1));
		counter.inc();
		System.out.println(counter);
		


	}

}
