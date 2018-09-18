package it.adriano.test1;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class TestHelloWorld {
	
	
	@Test
	public void testHelloWorld() {
		
		HelloWorld helloWorld = new HelloWorld();
		helloWorld.helloWorld();
		assertTrue(true);
	}

}
