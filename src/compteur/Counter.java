package compteur;

public class Counter 
{
	private int position;
	private int step;
	
	public Counter() 
	{
		this(0,1);
	}
	
	public Counter(int position, int step) 
	{
		this.position = position;
		this.step = step;
	}

	public int getValue() 
	{
		return this.position;
	}
	
	public void inc()
	{
		this.position += this.step; 
	}
	
	public boolean equals(Counter c)
	{
		/*boolean result = false;
		if (this.position == c.getValue())
		{
			result = true;
		}

		return result;*/
		
		return this.getValue() == c.getValue();
		
	}

	public String toString() 
	{
		return "valeur : " + this.position + " (incrémente " + this.step + ")";
	}

}
