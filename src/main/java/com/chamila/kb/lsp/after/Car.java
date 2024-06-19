package com.chamila.kb.lsp.after;

public class Car extends Vehicle {

	@Override
	public int getInteriorWidth() {
		return this.getCabinWidth();
	}

	private int getCabinWidth() {
		return 5;
	}
}
