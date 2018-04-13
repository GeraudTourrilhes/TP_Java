package arraylist;

public class User  implements Comparable<User>
{
	private String name;
	private Integer age;
	private boolean isMale;

	public User(String name, Integer age, boolean isMale) 
	{
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	public String getName() 
	{
		return this.name;
	}

	public void setName(String name) 
	{
		this.name = name;
	}

	public Integer getAge() 
	{
		return this.age;
	}

	public void setAge(Integer age) 
	{
		this.age = age;
	}

	public boolean isMale() 
	{
		return this.isMale;
	}

	public void setMale(boolean isMale) 
	{
		this.isMale = isMale;
	}
	
	/**
	 * Compare le nom de l'utilisateur avec un autre nom d'tilisateur
	 */
	public int compareTo(User user2)
    {
        return this.getName().compareTo(user2.getName());
    }

	/**
	 * Affichage d'un utilisateur en fonction de si c'est un homme ou une femme
	 */
	public String toString() 
	{
		
		return (this.isMale) ? "L'utilisateur se nomme " + this.name + ", il a " + this.age + " ans, c'est un homme" : "L'utilisatrice se nomme " + this.name + ", elle a " + this.age + " ans, c'est une femme";
		
	}

}
