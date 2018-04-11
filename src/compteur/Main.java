package compteur;

import compteur.counter.Counter;
import compteur.counter.CounterImpair;
import compteur.counter.CounterPair;

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
		System.out.println();
		CounterPair counterPair = new CounterPair();
		CounterImpair counterImpair = new CounterImpair();
		
		System.out.println(counterPair.getValue());
		counterPair.inc();
		System.out.println(counterPair);
		
		System.out.println(counterImpair.getValue());
		counterImpair.inc();
		System.out.println(counterImpair);


	}

}
