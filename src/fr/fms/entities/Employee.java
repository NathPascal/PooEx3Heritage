package fr.fms.entities; //3.2

public class Employee extends Person{
	
	private String company;
	private double salary;
	
	public Employee(String lastName, String firstName, int age, String address, String name, String country,
			int population, String capital, String company, double salary) {
		super(lastName, firstName, age, address, name, country, population, capital );
		this.company = company;
		this.salary = salary;
	}
	public Employee(String lastName, String firstName, int age, String address, String name, String country, int population, String company, double salary) {
		super(lastName, firstName, age, address, name, country, population, null);
		this.company = company;
		this.salary = salary;
	}


	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return super.toString() + ", Entreprise: " + company + ", salaire: " + salary;
	}
	
	
	

}
