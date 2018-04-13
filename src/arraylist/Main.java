package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
		System.out.println();
		users.sort(new Comparator<User>() { public int compare(User user1, User user2) { return user1.getName().compareTo(user2.getName()); } }); 
		
		for (Iterator iterator = users.iterator(); iterator.hasNext();) {
			User user = (User) iterator.next();
			System.out.println(user);
		}
		
		/*for (int i = 0; i < users.size(); i++) 
		{
			
			System.out.println(users.get(i));
			
		}*/
		
		

	}

}
