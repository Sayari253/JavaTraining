package com.tcs.training;

public class Bird implements Animal{

	public String move(String n) {
		return "Hi!I am "+n+",a Bird and I am flying";
	}
	public String speak(String n) {
		return "Hi! I am "+n+",a Bird";
	}

}
