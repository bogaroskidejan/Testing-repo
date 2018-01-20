import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Testing {
 
	public int addition(int x, int y) {
		return x + y;
	}
 
	public String helloWorld() {
		String helloWorld = "Hello +" + " World";
		return helloWorld;
	}
	
	@Test
	public void testingAddition() {
		assertEquals("Test for Addition Result: ", 10, addition(7, 3));
	}
 
	@Test
	public void testingHelloWorld() {
		assertEquals("Test for Hello World String: ", "Hello + World", helloWorld());
	}
	
}
