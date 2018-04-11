package calculatrice;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) 
	{
		//*
		//Version 2
		ArrayList<String> calcul = new ArrayList<>();
		ArrayList<Integer> prioritaire = new ArrayList<>();
		String calc = "";
		
		//je récupère tout les arguments que j'ajoute dans l'arraylist calcul et je repère ou sont les fois et les diviser
		for (int i = 0; i < args.length; i++) 
		{
			 calc += args[i] + " ";
			 calcul.add(args[i]);
			 if(args[i].equals("x") || args[i].equals("/"))
			 {
				 prioritaire.add(i);
			 }
		}
		//System.out.println(calcul);
		int j = 0;
		float priorite;
		int prioritaireSize = prioritaire.size();
		

		 //je fais les multiplication et les division puis j'ajoute le résultat a la table calcul

		for (int i = 0; i < prioritaireSize; i++) 
		{
			//System.out.println();
			if(calcul.get(prioritaire.get(0)- j).equals("x"))
			{
				
				priorite = Float.parseFloat(calcul.get(prioritaire.get(0)-1-j)) * Float.parseFloat(calcul.get(prioritaire.get(0)+1-j));
			}
			else
			{
				priorite = Float.parseFloat(calcul.get(prioritaire.get(0)-1-j)) / Float.parseFloat(calcul.get(prioritaire.get(0)+1-j));

			}
			calcul.set(prioritaire.get(0)-1-j, "" + priorite);
			calcul.remove(prioritaire.get(0)-j);
			calcul.remove(prioritaire.get(0)-j);
			prioritaire.remove(0);
			j += 2;
			
		}
		//System.out.println(calcul);

		 //je fais les additions et les soustractions restantes
		float resultat = Float.parseFloat(calcul.get(0));
		for (int i = 1; i < calcul.size(); i++) 
		{
			if(calcul.get(i).equals("="))
			{
				break;
			}
			//System.out.println();
			if(calcul.get(i).equals("+"))
			{
				
				resultat += Float.parseFloat(calcul.get(i+1));
				i++;
			}
			else
			{
				resultat -=  Float.parseFloat(calcul.get(i+1));
				i++;

			}
			
			
		}
		//j'affiche le calcul et le résultat
		System.out.println(calc + resultat);
		//*/
		/*
		//Version 1 
		
		float result = 0;
		boolean plus = true;
		boolean moins = false;
		boolean multiplier = false;
		boolean diviser = false;
		String calc = "";
		
		for (int i = 0; i < args.length; i++) 
		{	
			
			//System.out.println(args[i]);
			calc += args[i] + " ";
			if(!args[i].equals("="))
			{
				
				if(plus)
				{
					result += Integer.parseInt(args[i]);
					plus = false;
				}
				else if (moins)
				{
					result -= Integer.parseInt(args[i]);
					moins = false;
				}
				else if (multiplier)
				{
					result *= Integer.parseInt(args[i]);
					multiplier = false;
				}
				else if (diviser)
				{
					result /= Integer.parseInt(args[i]);
					diviser = false;
				}
				else if(args[i].equals("+"))
				{
					plus = true;
				}
				else if(args[i].equals("-"))
				{
					moins = true;
				}
				else if(args[i].equals("x"))
				{
					multiplier = true;
				}
				else if(args[i].equals("/"))
				{
					diviser = true;
				}
				
			}
			else
			{
				System.out.println(calc + result);
			}
			
			
			
		}
		//*/

	}

}
