package arraylist;

public class User 
{
	private String name;
	private Integer age;
	private boolean isMale;
	
	public User(String name, Integer age, boolean isMale) {
		this.name = name;
		this.age = age;
		this.isMale = isMale;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public boolean isMale() {
		return this.isMale;
	}

	public void setMale(boolean isMale) {
		this.isMale = isMale;
	}

	public String toString() {
		String sexe = this.isMale ? "un homme"  : "une femme";
		return "L'utilisateur se nomme " + this.name + ", il a " + this.age + "ans, c'est " + sexe;
	}
	
	

}
