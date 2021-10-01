package com.info.bicyle;

public class NoGear implements CycleState {
	Bicycle cycle;
	
	public NoGear(Bicycle cycle) {
		this.cycle = cycle;
	}

	@Override
	public void gearState() {
		// TODO Auto-generated method stub
        System.out.println("No Gear is used ");
	}

	@Override
	public void changeGear(int gearNumber) {
		// TODO Auto-generated method stub
        System.out.println("Not allowed to make the gear ");
	}

	@Override
	public void normalState() {
		// TODO Auto-generated method stub
       System.out.println("Its in normal mode, want to make speed with gear mode");
	}

}
