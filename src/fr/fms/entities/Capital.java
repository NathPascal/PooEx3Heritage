package fr.fms.entities;

public class Capital extends City {
	
	private String capital;

	public Capital(String name, String country, int population, String capital) {
		super(name, country, population);
		this.capital = capital;
	}
	
	public Capital(String name, String country, int population) { //3.2
		super(name, country, population);
		this.capital = null;
	}

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	@Override
	public String toString() {
		if(this.capital == null)  //3.2
			return super.toString(); 
		else
			return super.toString() + ", monument: " + getCapital();
	}


}
