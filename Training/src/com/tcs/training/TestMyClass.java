package com.tcs.training;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestMyClass {

	@Test
	void test() {
		
		Carni t = new Carni();
		String result = t.speak("Lion")+" and "+t.eat();
		System.out.println(result);
		assertEquals("Hi! I am Lion,a Mammal and Do not Disturb! I am eating a juicy flesh",result);
			
	}

}
