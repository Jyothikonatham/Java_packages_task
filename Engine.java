package com.vehicles.parts;
public class Engine{
	private String engineType;
	private int horsepower;
	public void setEngineType(String engineType){
	this.engineType=engineType;
	}
	public String getEngineType(){
	return engineType;
	}
	public void setHorsepower(int horsepower){
	this.horsepower=horsepower;
	}
	public int getHorsepower(){
	return horsepower;
	}
	
	public void showEngineDetails(){
	System.out.println("Engine Type :" + engineType);
	System.out.println("Horsepower :" + horsepower);
}
}