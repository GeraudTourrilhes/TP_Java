package compteur;

import compteur.counter.Counter;

public class Main {

	public static void main(String[] args) 
	{
		Counter counter = new Counter();
		Counter counter1 = new Counter();
		Counter counter2 = new Counter(0,2);
		
		System.out.println(counter.getValue());
		counter.inc();
		System.out.println(counter.getValue());
		System.out.println(counter.equals(counter1));
		counter1.inc();
		System.out.println(counter.equals(counter1));
		counter.inc();
		System.out.println(counter);
		counter2.inc();
		System.out.println(counter.equals(counter2));
		System.out.println(counter2);
		counter2.inc();
		System.out.println(counter2.getValue());
		
		CounterPair counterPair = new CounterPair();
		CounterImpair counterImpair = new CounterImpair();
		
		counterPair.inc();
		System.out.println(counterPair);
		
		counterImpair.inc();
		System.out.println(counterImpair);


	}

}
