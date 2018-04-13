package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Main {

	public static void main(String[] args) 
	{
		User user1 = new User("Jean", 18, true);
		User user2 = new User("Camille", 20, false);
		User user3 = new User("Julie", 18, false);
		User user4 = new User("Alphonse", 20, true);
		User user5 = new User("Jack", 45, true);
		User user6 = new User("Alfred", 60, true);
		User user7 = new User("Miriame", 70, false);
		User user8 = new User("Alexandre", 43, true);
		User user9 = new User("Noémie", 85, false);
		User user10 = new User("Juliette", 19, false);
		
		ArrayList<User> users = new ArrayList<User>();
		
		users.add(user1);
		users.add(user2);
		users.add(user3);
		users.add(user4);
		users.add(user5);
		users.add(user6);
		users.add(user7);
		users.add(user8);
		users.add(user9);
		users.add(user10);
		
		for (User user : users) 
		{
			System.out.println(user);
			
		}
		
		System.out.println();
		System.out.println();
		users.remove(user7);
		
		System.out.println();
		Collections.sort(users);
		
		users.remove(5);
		
		for (Iterator iterator = users.iterator(); iterator.hasNext();) 
		{
			User user = (User) iterator.next();
			System.out.println(user);
		}
		
		User user11 = new User("F1", 18, false);
		User user12 = new User("F2", 20, false);
		User user13 = new User("F3", 18, false);
		User user14 = new User("F4", 20, false);
		User user15 = new User("F5", 45, false);
		User user16 = new User("H1", 60, true);
		User user17 = new User("H2", 70, true);
		User user18 = new User("H3", 43, true);
		User user19 = new User("H4", 85, true);
		
		ArrayList<User> users1 = new ArrayList<User>();
		ArrayList<User> users2 = new ArrayList<User>();
		
		users1.add(user11);
		users1.add(user12);
		users1.add(user13);
		users1.add(user14);
		users1.add(user15);
		users1.add(user16);
		users1.add(user17);
		users1.add(user18);
		users1.add(user19);
		
		users2.addAll(users);
		users2.addAll(users1);
		
		Collections.sort(users2);
		
		
		System.out.println();
		System.out.println();
		for (User user : users2) 
		{
			System.out.println(user);
			
		}
		
		

	}

}
