package com.chamila.kb.lsp.after;


import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.chamila.kb.lsp.after.Car;
import com.chamila.kb.lsp.after.RacingCar;
import com.chamila.kb.lsp.after.Vehicle;

public class VehicleTest {
	
	@Test
	void getInteriorWidthTest() {
		//given
		Vehicle vehicle1=new Car();
		Vehicle vehicle2=new RacingCar();//substitution test to test LSP
		
		//when
		int interiorWidth1=vehicle1.getInteriorWidth();
		int interiorWidth2=vehicle2.getInteriorWidth();
		
		Executable executable1=()->vehicle2.getInteriorWidth();
		Executable executable2=()->vehicle2.getInteriorWidth();
		//then 
		assertAll (
				/*
				 * Usage of assertAll - Ensure that all of them are executed, even if some of
				 * them fail. If you use multiple assert statements, if one fails, the execution
				 * stops at that point.
				 */
				new Executable() {					
					@Override
					public void execute() throws Throwable {
						assertNotEquals(0, interiorWidth1);						
					}
				},
			
			()->assertNotEquals(0, interiorWidth2),
			()->assertTrue(interiorWidth1>0),
			()->assertTrue(interiorWidth2>0),
			()->assertDoesNotThrow(executable1),
			()->assertDoesNotThrow(executable2)
			
		);System.out.println("This line will be executed even if any of the above tests fail...");
	}

}
