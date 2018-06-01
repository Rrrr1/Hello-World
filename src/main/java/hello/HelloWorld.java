package hello;

import org.joda.time.LocalTime;
import org.apache.commons.math3.analysis.function.Log;
//import org.apache.commons.math3.analysis.function.Abs;

public class HelloWorld {
    
	public static void main(String[] args) {
		LocalTime currentTime = new LocalTime();
		System.out.println("The current local time is: " + currentTime);
		Greeter greeter = new Greeter();
		System.out.println(greeter.sayHello());
                Log logarithme = new Log();
                System.out.println(logarithme.value(54));
                //Abs absolue = new Abs();
                //System.out.println(absolue.value(-5.978));
	}
}
