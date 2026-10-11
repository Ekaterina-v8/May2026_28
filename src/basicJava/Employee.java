package basicJava;

public class Employee {
	
	String name = "John's";
	int salary = 11000;
	
	public Employee(String name, int salary)
	
	{
		
		System.out.println(name + " " + "monthly salary is " + "$" + salary + ".");
		System.out.println("---------------------------------");
		System.out.println(name);
		System.out.println(salary);
		
	}

	public static void main(String[] args) {
		
		Employee em = new Employee("John's", 11000);
		
		
		
		
		
		

	}

}
