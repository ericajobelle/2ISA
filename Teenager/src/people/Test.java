package com.testing; //11
import com.people.*;
public class Test {

	public static void main(String[] args) {
		TeenAger teen1 = new TeenAger(); //12
		teen1.setName("Erica");
		teen1.setAge(18);
		System.out.println("Name: " + teen1.getName());
		System.out.println("Age: " + teen1.getAge());
		teen1.dance("KPOP");
		teen1.dance(10);
		
		TeenAger teen2 = new TeenAger("Hannah", 20); //14
		System.out.println();
		System.out.println("Name: " + teen2.getName());
		System.out.println("Age: " + teen2.getAge());
		teen2.dance("Hip Hop");
		teen2.dance(17);
		

	}

}