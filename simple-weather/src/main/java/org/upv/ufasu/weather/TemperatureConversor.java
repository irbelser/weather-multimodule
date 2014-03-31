package org.upv.ufasu.weather;

public class TemperatureConversor {

	
	public int convert(double farenheit)
	{
		double celsius = (farenheit -32) / 1.8;
		return (int) celsius; 

	}
	
	public String convert(String farenheit)  
	{
		double farenhetDouble = Double.valueOf(farenheit);
		double celsius = (farenhetDouble -32) / 1.8;
		int res = (int) celsius;
		return String.valueOf(res); 
		
	}


}
