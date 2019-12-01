

public class Projekt {
	
	
	static double G = 9.82;
	static double R = 8.31446261815324;
	static double p_0 = 1000;
	static double C = 299792458;
	static double g_swe = 9.82;
	
			
	

	public static void main(String[] args) {

		System.out.println(fahrenheitToCelsius(50));
		System.out.println(kelvinToCelsius(0));
		System.out.println(fluidPressure(FluidTable.H20, 10));
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
		System.out.println(power(1000,2));
		System.out.println(heat(SolidTable.IRON,1,2));
		System.out.println(heat(FluidTable.WATER,1,10));
		System.out.println(heat(GasTable.AIR,1,1));
		System.out.println(velocityToHeight(9.82));
	}


	
	
	
	
	/**
	 * Omvandlar fahrenheit till Celsius
	 * @param - fahrenheit - temperaturen i fahrenheit
	 * @return - Returnar temperaturen i Celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double Celsius = (fahrenheit-32)*5/9;
		System.out.println("Result of method nr 1:");
		return Celsius;
	}
	
	/**
	 * Omvandlar Kelvin till Celsius
	 * @param kelvin - temperaturen i kelvin
	 * @return - returnar kelvinToCelsius, allts� resultatet angivet i Celsius 
	 */
	public static double kelvinToCelsius(double kelvin) {
		double kelvinToCelsius = kelvin - 273.15;
		System.out.println("Result of method nr 2:");
		return kelvinToCelsius;
	}
	
	/**
	 * R�knar ut v�tsketrycket i en v�tska vid ett visst djup
	 * @param fluid - variabel f�r en given v�tska 
	 * @param deep - variabel f�r djupet i v�tskan
	 * @return - returnar fluidPressure, allts� v�tsketrycket 
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = 10 * G * fluid.density;
		System.out.println("Result of method nr 3:");
		return fluidPressure;
	}
	
	/**
	 * R�knar ut v�tsketrycket i vatten vid ett visst djup
	 * @param deep - en variabel f�r djupet
	 * @return - returnar pressureUnderWater, v�tsketrycket i vattnet vid det angivna djupet
	 */
	public static double pressureUnderWater(double deep) {
		double pressureUnderWater = 10 * G * 998;
		System.out.println("Result of method nr 4:");
		return pressureUnderWater;
	}

	/**
	 * R�knar ut kinetisk energi med hj�lp av massa och hastighet
	 * @param mass - en variabel f�r massan
	 * @param velocity - en variabel f�r hastigheten
	 * @return - returnar kineticEnergy, den resulterande kinetiska energin
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy = 0.5 * mass * (Math.pow(velocity, 2));
		System.out.println("Result of method nr 5:");
		return kineticEnergy;
	}
	
	/**
	 * R�knar ut potentiell energi med hj�lp av massa och h�jd
	 * @param mass - variabel f�r massan
	 * @param height - variabel f�r h�jden
	 * @return - returnar potentialEnergy, den potentiella energin
	 */
	public static double potentialEnergy(double mass, double height) {
		double potentialEnergy = mass * G * height;
		System.out.println("Result of method nr 6:");
		return potentialEnergy;
	}
	
	/**
	 * R�knar ut hur h�g hastighet man kommer upp i om man sl�pper ett f�rem�l fr�n en viss h�jd
	 * @param height - en variabel f�r h�jden
	 * @return - returnar fallSpeed, hastigheten som f�rem�let kommer upp i
	 */
	public static double fallSpeed(double height) {
		double fallSpeed = Math.sqrt ((2*height) / g_swe) * g_swe;
		System.out.println("Result of method nr 7:");
		return fallSpeed;
	}
	 
	/**
	 * R�knar ut skillnad mellan tv� givna v�rden
	 * @param first - en variabel f�r det f�rsta v�rdet
	 * @param last - en variabel f�r det andra v�rdet
	 * @return - returnar delta, skillnaden mellan de tv� v�rdena
	 */
	public static double delta(double first, double last) {
		double delta = last - first;
		System.out.println("Result of method nr 8:");
		return delta;
	}
	
	/**
	 * G�r om en viss volym av v�tska till en massa
	 * @param fluid - en variabel f�r en viss v�tska
	 * @param volume - en variabel f�r volymen
	 * @return - returnar volumeToMass, den slutgiltiga massan
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double volumeToMass = fluid.density * volume;
		System.out.println("Result of method nr 9:");
		return volumeToMass;
	}
	
	/**
	 * g�r om en viss volym av gas till en massa
	 * @param gas - en variabel f�r en viss gas
	 * @param volume - en variabel f�r volymen
	 * @return - returnar volumeToMass, den slutgiltiga massan
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		double volumeToMass = gas.density * volume;
		System.out.println("Result of method nr 10:");
		return volumeToMass;
	}
	
	/**
	 * g�r om en viss volym av materia till en massa
	 * @param solid - en variabel f�r en viss materia
	 * @param volume - en variabel f�r volymen
	 * @return - returnar volumeToMass, den slutgiltiga massan
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		double volumeToMass = solid.density * volume;
		System.out.println("Result of method nr 11:");
		return volumeToMass;
	}
	
	/**
	 * r�knar ut medelhastigheten med hj�lp av str�cka och tid
	 * @param distance - en variabel f�r distansen
	 * @param time - en variabel f�r tiden
	 * @return - returnar svtVelocity, medelhastigheten
	 */
	public static double svtVelocity(double distance, double time) {
		double svtVelocity = distance / time;
		System.out.println("Result of method nr 12:");
		return svtVelocity;
	}
	
	/**
	 * r�knar ut str�cka med hj�lp av hastighet och tid
	 * @param velocity - en variabel f�r hastigheten
	 * @param time - en variabel f�r tiden
	 * @return - returnar svtDistance, str�ckan
	 */
	public static double svtDistance(double velocity, double time) {
		double svtDistance = velocity * time;
		System.out.println("Result of method nr 13:");
		return svtDistance;
	}
	
	/**
	 * r�knar ut tid med hj�lp av str�cka och hastighet
	 * @param distance - en variabel f�r distansen
	 * @param velocity - en variabel f�r hastigheten
	 * @return - returnar svtTime, tiden
	 */
	public static double svtTime(double distance, double velocity) {
		double svtTime = distance / velocity;
		System.out.println("Result of method nr 14:");
		return svtTime;
	}
	
	/**
	 * r�knar ut arbete med hj�lp av kraft och str�cka
	 * @param force - en variabel f�r kraft
	 * @param distance - en variabel f�r distansen/str�ckan
	 * @return - returnar work, arbetet som utf�rs
	 */
	public static double work(double force, double distance) {
		double work = force * distance;
		System.out.println("Result of method nr 15:");
		return work;
	}
	
	/**
	 * r�knar ut effekt med hj�lp av arbete och tid
	 * @param work - en variabel f�r arbete
	 * @param time - en variabel f�r tid
	 * @return - returnar power, slutgiltiga effekten
	 */
	public static double power(double work, double time) {
		double power = work / time;
		System.out.println("Result of method nr 16:");
		return power;
	}
	
	/**
	 * r�knar ut hur ycket energi som kr�vs f�r att v�rma ett visst material ett angivet grader
	 * @param solid - en variabel f�r materialet
	 * @param mass - en variabel f�r massan
	 * @param deltaT - en variabel f�r skillnaden mellan temperaturen i b�rjan och slutet
	 * @return - returnar energy, energin som kr�vs
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		double energy = solid.heatCapacity * mass * deltaT;
		System.out.println("Result of method nr 17:");
		return energy;
	}
	
	/**
	 * r�knar ut hur mycket energi som kr�vs f�r att v�rma en viss massa v�tska ett angivet antal grader
	 * @param fluid - en variabel f�r v�tskan
	 * @param mass - en variabel f�r massan hos v�tskan
	 * @param deltaT - en variabel f�r skillnaden mellan temperaturen i b�rjan och slutet.
	 * @return - returnar energy, energin som kr�vs
	 */
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		double energy = fluid.heatCapacity * mass * deltaT;
		System.out.println("Result of method nr 18:");
		return energy;
	}
	
	/**
	 * r�knar ut hur mycket energi som kr�vs f�r att v�rma en viss massa gas ett angivet antal grader
	 * @param gas -  en variabel f�r gas
	 * @param mass - en variabel f�r massan
	 * @param deltaT -  en variabel f�r skillnaden mellan temperaturen i b�rjan och slutet
	 * @return - returnar power, m�ngden av energin som beh�vs
	 */
	public static double heat(GasTable gas, double mass, double deltaT) {
		double power = gas.heatCapacity * mass * deltaT;
		System.out.println("Result of method nr 19:");
		return power;
	}
	
	/**
	 * r�knar ut hur h�gt ett f�rem�l med en viss hastighet upp�t kommer
	 * @param velocity - en variabel f�r hastigheten
	 * @return - returnar velocityToHeight, den slutgiltiga h�jden
	 */
	public static double velocityToHeight(double velocity) {
		double velocityToHeight = (Math.pow(Math.sin(1.570796),2 )* Math.pow(velocity, 2))/ (2*g_swe);
		System.out.println("Result of method nr 20:");
		return velocityToHeight;
	}
	
	
	
	
	
	
}


