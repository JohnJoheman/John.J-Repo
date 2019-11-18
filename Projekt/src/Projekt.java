

public class Projekt {
	
	
	static double G = 9.82;
	static double R = 8.31446261815324;
	static double p_0 = 1000;
	static double C = 299792458;
	static double g_swe = 9.82;
	
			
	

	public static void main(String[] args) {

		System.out.println(fahrenheitToCelsius(50));
		System.out.println(kelvinToCelsius(0));
		System.out.println(fluidPressure(FluidTable.H20,  10));
		System.out.println(pressureUnderWater(10));
		

	}


	
	
	
	
	
	public static double fahrenheitToCelsius(double fahrenheit) {
		double Celsius = (fahrenheit-32)*5/9;
		
	System.out.println("50 degrees Fahrenheit to Celsius is:");
	return Celsius;
	}
	
	
	public static double kelvinToCelsius(double kelvin) {
		double kelvinToCelsius = kelvin - 273.15;
		System.out.println("0 degrees celsius to kelvin is:");
		return kelvinToCelsius;
	}
	
	public static double fluidPressure(FluidTable fluid, double deep) {
		
		double fluidPressure = 10 * G * fluid.density;
		System.out.println("Pressure 10 meter under water:");
		return fluidPressure;
	}
	public static double pressureUnderWater(double deep) {
		double pressureUnderWater = 10 * G * 998;
		System.out.println("Pressure 10 meter under water:");
		return pressureUnderWater;
	}
	

	
	
	
}

