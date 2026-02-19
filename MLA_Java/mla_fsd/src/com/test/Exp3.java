package com.test;

@FunctionalInterface
interface FunInf1{
	String greetUser(String name, String msg);
}

public class Exp3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FunInf1 obj1 = (String name, String msg) ->
		{
			System.out.println("Hi "+name+" "+msg);
			return "Hello "+name+" MLA "+msg;
		};
		
		obj1.greetUser("Pranav"," Welcome to FSD MetaGeek Coders...");

	}

}
/* System- public final class
* out -object of printstream class
* prntln- overloaded method of printstream class accessed by an object
*/
