package classanonyme;



public class Main {

	public static void main(String[] args) 
	{
		Leaf a = new Leaf("a");
		
		Printer printer = new Printer()
		{
			public void print(String document)
			{
				System.out.println("(" + document + ")");
			}
		};
		
		a.printer(printer);
		
	}

}
