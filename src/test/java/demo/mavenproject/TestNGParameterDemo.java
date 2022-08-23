package demo.mavenproject;

import org.testng.annotations.*;

public class TestNGParameterDemo {

	// add value
	@Test
	@Parameters({ "i", "j" })
	public void add(int a, int b) {
		System.out.println("additon: " + (a + b));
	}

	// substract value
	@Test

	// pass parameter
	@Parameters({ "i", "j" })
	public void substraction(int a, int b)

	{
		System.out.println("substraction: " + (a - b));
	}

	// multification value
	@Test
	@Parameters({ "i", "j" })
	public void multiply(int a, int b)

	{
		System.out.println("mutification: " + (a * b));
	}

	// print name parameter value
	@Test
	@Parameters({ "automobile", })
	public void Name(String name)

	{
		System.out.println("automobile: " + (name));
	}

}
