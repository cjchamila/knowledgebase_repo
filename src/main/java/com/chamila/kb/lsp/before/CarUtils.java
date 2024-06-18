package com.chamila.kb.lsp.before;

import java.util.ArrayList;
import java.util.List;

public class CarUtils {
	public static void main(String[] args) {
		Car car1=new Volkswagon();
		Car car2=new MiniKooper();
		Car car3=new RacingCar();
		
		List<Car>cars=new ArrayList<>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		
		for(Car car : cars) {
			car.getCabinWidth();//Substitution test fails for car3!
		}
	}

}
