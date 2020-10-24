package com.people; //Answer1

public class TeenAger {
	private String name; //Answer2
	private int age;
	
	public TeenAger(String name, int age) { //Answer4
		this.name = name;
		this.age = age;
	}
	
	public TeenAger() {
		System.out.println("teenager was created..."); //Answer3
	}

	public String getName() { //Answer7
		return name;
	}

	public void setName(String name) { //Answer5
		this.name = name;
	}

	public int getAge() { //Answer8
		return age;
	}

	public void setAge(int age) { //Answer6
		this.age = age;
	}
	
	public void dance(String dance) { //9
		System.out.println(this.name + " knows how to dance " + dance);
	}
	
	public void dance(int numberOfdance) { //10
		System.out.println(this.name + " knows " + numberOfdance + " dances ");
	}
	
}