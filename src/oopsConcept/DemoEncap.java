package oopsConcept;

public class DemoEncap 
{
	
	// my personal information 
	
	private String email = "modisantosh@gmail.com";
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	private String name = "John";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	private int age = 40;
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	

	public static void main(String[] args) 
	{
		DemoEncap de = new DemoEncap();
		System.out.println(de.name);
		System.out.println(de.age);
		
		System.out.println(de.email);

	}

	

}
