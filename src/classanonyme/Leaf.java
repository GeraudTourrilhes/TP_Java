package classanonyme;


public class Leaf
{
	private String a;

	
	public Leaf(String a)
	{
		this.a = a;
	}


	public void print(Printer printer) 
	{
		printer.print(this.a);
		
	}
}
