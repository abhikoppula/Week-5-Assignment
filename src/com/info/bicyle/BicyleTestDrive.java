package com.info.bicyle;

public class BicyleTestDrive {
	
	
	
	public static void main(String[] args) {
		//State pattern to ride bicyle 
		Bicycle bicycle = new Bicycle();
		bicycle.withoutGear();
		bicycle.gearMode();
		bicycle.changeGear(5);
		
	}

	

}
