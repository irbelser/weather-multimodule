package org.upv.ufasu;

import junit.framework.TestCase;

import org.upv.ufasu.weather.TemperatureConversor;

public class TemperatureConversorTest  extends TestCase{

	public TemperatureConversorTest() {
		// TODO Auto-generated constructor stub
	}
	 public void testParser() throws Exception {

		 int celsius = new TemperatureConversor().convert(50.0);
		//System.out.println("Temperatura equivalente a 50.0F es: " + celsius + "ºC");
		 assertEquals( 10, celsius);
		 String celsiusString = new TemperatureConversor().convert("50.0");
		 assertEquals( "10", celsiusString);
	}

}
