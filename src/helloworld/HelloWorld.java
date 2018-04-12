package helloworld;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World");
		Date d = new Date();
		System.out.println(d);
		int a = 5;
		int b = 9;
		float c;
		d = null;
		
		a = a + 2;
		
		b = a * 2 + b;
		System.out.println(a);
		System.out.println(b);
		
		c = (float) (2 * a + 0.5);
		System.out.println(c);
		//a = a + 22;

		if(a < b)
		{
			System.out.println(a + " est inférieur a " + b);
			a++;
		}
		else
		{
			System.out.println(a + " est supérieur a " + b);
			b--;
		}
		
		for(int i = 0; i <= 10; i++)
		{
			if( i != 10)
			{
				System.out.print(i + ",");
			}
			else
			{
				System.out.print(i);
			}
			
		}
		System.out.println();
		for(int i = 0; i <= 10; i+=3)
		{
			if( i == 3)
			{
				continue;
			}
			if( i != 0)
			{
				System.out.print("," + i);
			}
			else
			{
				System.out.print(i);
			}
			
			if( i == 6)
			{
				break;
			}
			
			
		}
		System.out.println();
		int count = 1;
		while(count<6)
		{
			System.out.print(count + "|");
			count++;
		}
		boolean stop = false;
		System.out.println();
		do
		{
			System.out.print(count + "|");
			count--;
			stop = true;
		}
		while(count > 0 && !stop);
		
		System.out.println();
		
		String nom = new String();
		String test = new String();
		
		
		nom = null;

		/*if(nom.equals(test))
		{
			System.out.println("correct");
		}*/
		
		if(StringUtils.equals(nom, test))
		{
			System.out.println("correct");
		}
		
		
		nom = "test";
		//nom = "test1";
		test = "test";
		
		if(nom == test)
		{
			System.out.println("incorrect");
		}
		
		if(nom.equals(test))
		{
			System.out.println("correct");
		}
		
		if(StringUtils.equals(nom, test))
		{
			System.out.println("correct");
		}
		
		nom = "Hello ";
		test = "Word";
		
		String concat = nom.concat(test);
		System.out.println(concat);
		
		StringBuilder sb = new StringBuilder();
		sb.append(nom).append(test).append(".");
		System.out.println(sb);
		
		
		System.out.println(20 + "10");
		System.out.println(20 + Integer.parseInt("10"));
		
		int[] array = new int[10];
		array[0] = 7;
		array[9] = 2;
		array[5] = 1;
		array[1] = 4;
		array[3] = 47;
		
		System.out.println(array.length);
		
		for(int i = 0; i < 10; i++)
		{
			System.out.print(array[i] + "|");
		}
		System.out.println();
		/*int[] array1 = new int[1000];
		for (int i = 0; i < array1.length; i++) {
			array1[i] = i + 2;
			System.out.print(array1[i] + "|");
		}*/
		int[][] matrix = new int[10][5];
		
		 matrix[0][0] = 3;
		 
		 System.out.println(matrix[0][0]);
		 
		 String[][] couleurs = new String[6][2];
		 
		 couleurs[0][0] = "bleu";
		 couleurs[0][1] = "rouge";
		 couleurs[1][0] = "bleu";
		 couleurs[1][1] = "vert";
		 couleurs[2][0] = "jaune";
		 couleurs[3][0] = "violet";
		 couleurs[4][1] = "orange";
		  
		 for (int i = 0; i < couleurs.length; i++) 
		 {
			 System.out.println("|" + couleurs[i][0] + "," + couleurs[i][1] + "|");
			
		}
		 System.out.println();
		
		 Language langue = Language.FR;
			
		System.out.println(langue);
		System.out.println(Language.ES);
		System.out.println(Language.EN);
		System.out.println(Language.DE);
	}

}
