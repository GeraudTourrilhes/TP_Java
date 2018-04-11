package compteur.counter;

public class Counter 
{
	private static int globalCounter = -1;
	private int position;
	private int step;
	
	public Counter() 
	{
		this(0,1);
	}
	
	public Counter(int position, int step) 
	{
		if(globalCounter == -1)
		{
			globalCounter = 0;
		}
		this.position = position;
		this.step = step;
	}

	public int getValue() 
	{
		return this.position;
	}
	

	
	public static int getGlobalCounter() 
	{
		return globalCounter;
	}

	public void inc()
	{
		this.position += this.step; 
		globalCounter += this.step;
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
