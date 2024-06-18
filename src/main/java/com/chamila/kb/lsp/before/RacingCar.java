package com.chamila.kb.lsp.before;

public class RacingCar extends Car{

	/* 'Is-A' way of thinking */
	@Override
	public int getCabinWidth() {
		throw new UnsupportedOperationException();
	}
	
	public int getCockpitWidth() {
		return 5;
	}

}
