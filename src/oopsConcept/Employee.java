package oopsConcept;

public class Employee 
{
	
	 
	//personal information 
	
	private String name = "John";
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	private int employeeId = 23;
	
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
	
	private double salary = 11000;
	
	public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	public static void main(String[] args) 
	
	{
		Employee em = new Employee();
		System.out.println(em.name);
		System.out.println(em.employeeId);
		System.out.println(em.salary);
		
		
		

	}

}
