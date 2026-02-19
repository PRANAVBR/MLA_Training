package com.test;

@FunctionalInterface
interface FunInf{
	void draw();
	
	default void dog() {
		
	}
	
	static void cat() {
		
	}
}

class Circle implements FunInf{
	@Override
	
	public void draw() {
		System.out.println("circle");
	}
}

class Square implements FunInf{
	@Override
	public void draw() {
		System.out.println("square");
	}
	
	//factory method
	public Square getObj() {
			System.out.println("Object returned");
		    return new Square();
		    
	}
}
public class Exp2 {
	
	public static void main(String[] args) {
		Circle obj1 = new Circle();
		obj1.draw();
		
		FunInf obj2 = new Square();//
		obj2.draw();
		
		//Square obj3 = obj2.getObj();//factory method
		
		FunInf obj3 = () -> System.out.println("circle");//lambda function
		
		obj3.draw();
	}
}
