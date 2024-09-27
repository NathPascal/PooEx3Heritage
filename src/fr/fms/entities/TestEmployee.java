package fr.fms.entities;

public class TestEmployee {

	public static void main(String[] args) {
		// 3.2
		
		Employee gate = new Employee ("Gate", "Bill", 65, "aux USA", 
				"Washington", "USA", 7600000, "W-M" , "Fondation B&M" , 100000.0);
		Employee musk = new Employee ("Musk", "Elon", 49, "à palo alto", 
				"Pretoria", "Afrique du Sud", 800000, "Tesla" , 150000.0);
		
		System.out.println(gate);
		System.out.println(musk);

	}

}
