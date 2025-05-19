package com.vehicles.app;
import com.vehicles.Car;
import com.vehicles.parts.Engine;
public class CarApp{
	public static void main(String[] args){
	Car car = new Car();
	car.setBrand("BMW");
	car.setModel("Tesla");
	car.setPrice(200000.00);
	
	Engine eng = new Engine();
	eng.setEngineType("Diesel");
	eng.setHorsepower(147);

	car.showCarDetails();
	System.out.println();
	eng.showEngineDetails();
	}
}
