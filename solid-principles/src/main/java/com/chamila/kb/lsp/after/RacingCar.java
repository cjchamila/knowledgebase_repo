package com.chamila.kb.lsp.after;

public class RacingCar extends Vehicle{

	@Override
	public int getInteriorWidth() {
		return getCockpitWidth();
	}
	
	private int getCockpitWidth() {
		return 2;
	}

}
