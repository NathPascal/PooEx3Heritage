package fr.fms.entities; //3.2

public class Person extends Capital {

	private String lastName;
	private String firstName;
	private int age;
	private String address;
	
	
	public Person(String lastName, String firstName, int age, String address,
			String name, String country, int population, String capital) {
		super(name, country, population, capital);
		this.lastName = lastName;
		this.firstName = firstName;
		this.age = age;
		this.address = address;
	}
	
	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return getLastName() + ", " + getFirstName() + ", " + getAge() + " ans, habitant " + getAddress()
				+ ", Ville de naissance: " + super.toString();
	}

	
}
