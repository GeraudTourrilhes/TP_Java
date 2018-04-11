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
		
		
		System.out.println("Compteur globale = " + Counter.getGlobalCounter());
		
		System.out.println("Valeur de counter = " + counter.getValue());
		counter.inc();
		System.out.println("incrémentation de counter");
		System.out.println("Valeur de counter = " + counter.getValue());
		System.out.println("vérification si counter et counter 1 sont égaux :");
		System.out.println(counter.equals(counter1));
		counter1.inc();
		System.out.println("incrémentation de counter 1");
		System.out.println("vérification si les valeurs de counter et counter 1 sont égaux :");
		System.out.println(counter.equals(counter1));
		counter.inc();
		System.out.println("incrémentation de counter");
		System.out.println(counter);
		counter2.inc();
		System.out.println("incrémentation de counter2");
		System.out.println("vérification si les valeurs de counter et counter 2 sont égaux :");
		System.out.println(counter.equals(counter2));
		System.out.println(counter2);
		counter2.inc();
		System.out.println("incrémentation de counter2");
		System.out.println("Valeur de counter2 = " +counter2.getValue());
		System.out.println();
		System.out.println();
		CounterPair counterPair = new CounterPair();
		CounterImpair counterImpair = new CounterImpair();
		
		System.out.println("Compteur globale = " +Counter.getGlobalCounter());
		
		System.out.println("Valeur de counterPair = " + counterPair.getValue());
		counterPair.inc();
		System.out.println(counterPair);
		
		System.out.println("Valeur de counterImpair = " + counterImpair.getValue());
		counterImpair.inc();
		System.out.println(counterImpair);
		
		System.out.println("Compteur globale = " +Counter.getGlobalCounter());


	}

}
