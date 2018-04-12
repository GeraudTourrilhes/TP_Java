package classanonyme;

public class Main {

	public static void main(String[] args) 
	{
		Printer printer = new Printer()
		{
			public void print(String document)
			{
				System.out.println("(" + document + ")");
			}
		};
		
		
	}

}
