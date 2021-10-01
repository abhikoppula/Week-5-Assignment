package com.info.bicyle;

public class WithGear implements CycleState {

	Bicycle cycle;
	
	public WithGear(Bicycle cycle) {
		this.cycle = cycle;
	}

	@Override
	public void gearState() {
		// TODO Auto-generated method stub
        System.out.println("Already in Gear Mode ");
        cycle.setState(cycle.getState());
	}

	@Override
	public void changeGear(int gearNumber) {
		   System.out.println("Change the Gear position to "+gearNumber);
	        cycle.setState(cycle.getState());
	}

	@Override
	public void normalState() {
		// TODO Auto-generated method stub
        System.out.println("Slow if you find any obstacles");
	}

}
