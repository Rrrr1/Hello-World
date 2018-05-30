package hello;

import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class GreeterTest {

	private Greeter greeter = new Greeter();

	@Test
	public void greeterSaysHello() {
		//assertEquals(greeter.sayHello(), "Hello world!");
		assertTrue("Hello world!".equals(greeter.sayHello()));
		assertFalse("Bonjour".equals(greeter.sayHello()));
	}

}

