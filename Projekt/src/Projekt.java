

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
		System.out.println(kineticEnergy(2,2));
		System.out.println(potentialEnergy(2,5));
		System.out.println((fallSpeed(2.5)));
		System.out.println(delta(1,10));
		System.out.println(delta(5,1));
		System.out.println(volumeToMass(FluidTable.WATER, 1));
		System.out.println(volumeToMass(GasTable.AIR,1));
		System.out.println(volumeToMass(SolidTable.IRON,1));
		System.out.println(svtVelocity(10,5));
		System.out.println(svtDistance(10,5));
		System.out.println(svtTime(10,2));
		System.out.println(work(50,10));
		
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

	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy = 0.5 * mass * (Math.pow(velocity, 2));
		System.out.println("The kinetic energy when both mass and velocity are 2 each:");
		return kineticEnergy;
	}
	
	public static double potentialEnergy(double mass, double height) {
		double potentialEnergy = mass * G * height;
		System.out.println("the potential energy when mass are 2 and height are 5:");
		return potentialEnergy;
	}
	
	
	public static double fallSpeed(double height) {
		double fallSpeed = Math.sqrt ((2*height) / g_swe) * g_swe;
		System.out.println("The speed of an object from a certain height");
		return fallSpeed;
	}
	 
	public static double delta(double first, double last) {
		double delta = last - first;
		System.out.println("The difference between first and last number are:");
		return delta;
	}
	
	public static double volumeToMass(FluidTable fluid, double volume) {
		double volumeToMass = fluid.density * volume;
		System.out.println("Converts a certain volume of a liquid to a mass:");
		return volumeToMass;
	}
	
	public static double volumeToMass(GasTable gas, double volume) {
		double volumeToMass = gas.density * volume;
		System.out.println("Converts a certain volume of gas to mass:");
		return volumeToMass;
	}
	
	public static double volumeToMass(SolidTable solid, double volume) {
		double volumeToMass = solid.density * volume;
		System.out.println("Converts a certain volume of materia to mass:");
		return volumeToMass;
	}
	
	public static double svtVelocity(double distance, double time) {
		double svtVelocity = distance / time;
		System.out.println("The average speed:");
		return svtVelocity;
	}
	
	public static double svtDistance(double velocity, double time) {
		double svtDistance = velocity * time;
		System.out.println("The distance by multiplying velocity with time:");
		return svtDistance;
	}
	
	public static double svtTime(double distance, double velocity) {
		double svtTime = distance / velocity;
		System.out.println("The time by dividing distance with velocity:");
		return svtTime;
	}
	
	public static double work(double force, double distance) {
		double work = force * distance;
		System.out.println("The work by multiplying a certain force with distanc");
		return work;
	}
	
	
	
	
}


