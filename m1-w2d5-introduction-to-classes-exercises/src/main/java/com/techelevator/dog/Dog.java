package com.techelevator.dog;



public class Dog {
	private boolean isSleeping = false;
	
	public boolean isSleeping() {
		return this.isSleeping;
	}
	
	public void sleep() {
		this.isSleeping = true;
	}
	
	public void wakeUp() {
		this.isSleeping = false;
	}
	
	public String makeSound() {
		if (this.isSleeping == true) 
			return "Zzzzz...";
		
		else 
			return "Woof!";
	}
	
//	private Class<Dog> klass = null;
//	private Constructor<Dog> constructor = null;
//	private Method isSleeping = null;
//	private Method makeSound = null;
//	private Method sleep = null;
//	private Method wakeUp = null;

	
}
