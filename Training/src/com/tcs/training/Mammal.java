package com.tcs.training;


public abstract class Mammal implements Animal{
	    public abstract String eat();
		public String move(String n) {
			return "Hi!I am "+n+",a Mammal and I am moving";
		}
		public String speak(String n) {
			return "Hi! I am "+n+",a Mammal";
		}
}



