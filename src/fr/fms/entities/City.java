package fr.fms.entities;

public class City {
	
	private String name;
	private String country;
	private int population;
	
	public City(String name, String country, int population) {
		this.name = name;
		this.country = country;
		this.population = population;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	@Override
	public String toString() {
		return getName() + ", "+ getCountry() +", "+ getPopulation() +" d'habitants";
	}

	
}
