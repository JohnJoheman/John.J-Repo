

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
		
		//Svaren på de 10 frågorna:
		
		//60dm^3 är detsamma som 0.6m^3
		System.out.println("Hur mycket väger 60dm^3 järn?");
		System.out.println(volumeToMass(SolidTable.IRON,0.06) + "kg");
		
		//50 minuter är detsamma som 3000 sekunder
		System.out.println("Hur långt hinner Tomas om han löper med medelhastigheten 2.7m/s i 50 minuter?");
		System.out.println(svtDistance(2.7,3000));
	
		System.out.println("Hur mycket energi krävs för att värma upp 4 liter vatten från rumstemperatur (22 grader) till kokpunkten");
		System.out.println(heat(FluidTable.WATER,4,78));
		
		System.out.println("Hur stort är det totala trycket 75 meter under havsytan?");
		System.out.println(fluidPressure(FluidTable.WATER,75));
		
		System.out.println("Tomas som är 180cm lång kastar upp en boll med massan 250 gram i luften så den får starthastigheten 60km/h. Hur högt kommer bollen?");
		System.out.println(velocityToHeight(16.6) + 1.8 + "m");
		
		System.out.println("En bil med massan 735kg accelererar med konstand acceleration från 0-100 på 4.8 sekunder. Hur stor effekt har bilens motor uppnåt?");
		System.out.println(power(580500, 4.8) + "W");
	
		System.out.println("En studsboll som väger 1kg släpps från 10 meters höjd och varje gång den nuddar marken så tappar den 1% av sin energi. Hur många gånger kommer bollen studsa i marken innan den inte studsar högre än 0.5 meter?");
		System.out.println(amountOfBounces(12));
	
		System.out.println("Hur hög hastighet får kulan om den kommer 15 meter på 2.79 sekunder?");
		System.out.println(svtVelocity(15,2.79));
	
		System.out.println("Hur många fler mål gjorde IFK Göteborg än AIK om det blev 11-1 till IFK Göteborg?");
		System.out.println(delta(1,11));
	
		System.out.println("Hur långt kommer Kalle om han springer i 40 sekunder med hastigheten 20m/s?");
		System.out.println(svtDistance(20,40));
	
		
		//Tio egna fysikaliska metoder:
		
		/**
		 * Egna frågor till metoderna:
		 * 1. Vad är rörelseenergin om ett föremål har massan 50kg och befinner sig 15 meter upp i luften?
		 * 2. Vad är arean av en triangel med basen 10cm och höjden 15cm?
		 * 3. Vad är arean av en circel med radien 7cm?
		 * 4. Hur lång är hypotenusan om basen är 15cm och höjden 15cm?
		 * 5. Vad är rörelseenergin om massan är 47 och hastigheten är 15m/s?
		 * 6. Hur mycket kraft behövs för att lyfta en människa som väger 60kg?
		 * 7. Hur många kilometer per timme är 5 miles per hour?
		 * 8. Hur många centimeter är 8 inches?
		 * 9. Hur många meter är 100 feet?
		 * 10. Hur stor är volymen på en cylinder med radien 14cm och höjden 31cm?
		 */
		System.out.println(energyOfPosition(50,15));
		System.out.println(areaOfTriangle(10,15));
		System.out.println(areaOfCircle(7));
		System.out.println(lengthOfHypotenuse(15, 15));
		System.out.println(momentum(47, 15));
		System.out.println(force(60));
		System.out.println(mphToKmh(5));
		System.out.println(inchesToCentimeter(8));
		System.out.println(feetToMeter(100));
		System.out.println(volumeCylinder(14, 31));
		
	}	

	
	
	
	
	/**
	 * Omvandlar fahrenheit till Celsius
	 * @param - fahrenheit - temperaturen i fahrenheit
	 * @return - Returnar temperaturen i Celsius
	 */
	public static double fahrenheitToCelsius(double fahrenheit) {
		double Celsius = (fahrenheit-32)*5/9;
		System.out.println("Method nr 1:");
		return Celsius;
	}
	
	/**
	 * Omvandlar Kelvin till Celsius
	 * @param kelvin - temperaturen i kelvin
	 * @return - returnar kelvinToCelsius, alltså resultatet angivet i Celsius 
	 */
	public static double kelvinToCelsius(double kelvin) {
		double kelvinToCelsius = kelvin - 273.15;
		System.out.println("Method nr 2:");
		return kelvinToCelsius;
	}
	
	/**
	 * Räknar ut vätsketrycket i en vätska vid ett visst djup
	 * @param fluid - variabel för en given vätska 
	 * @param deep - variabel för djupet i vätskan
	 * @return - returnar fluidPressure, alltså vätsketrycket 
	 */
	public static double fluidPressure(FluidTable fluid, double deep) {
		double fluidPressure = 10 * G * fluid.density;
		System.out.println("Method nr 3:");
		return fluidPressure;
	}
	
	/**
	 * Räknar ut vätsketrycket i vatten vid ett visst djup
	 * @param deep - en variabel för djupet
	 * @return - returnar pressureUnderWater, vätsketrycket i vattnet vid det angivna djupet
	 */
	public static double pressureUnderWater(double deep) {
		double pressureUnderWater = 10 * G * 998;
		System.out.println("Method nr 4:");
		return pressureUnderWater;
	}

	/**
	 * Räknar ut kinetisk energi med hjälp av massa och hastighet
	 * @param mass - en variabel för massan
	 * @param velocity - en variabel för hastigheten
	 * @return - returnar kineticEnergy, den resulterande kinetiska energin
	 */
	public static double kineticEnergy(double mass, double velocity) {
		double kineticEnergy = 0.5 * mass * (Math.pow(velocity, 2));
		System.out.println("Method nr 5:");
		return kineticEnergy;
	}
	
	/**
	 * Räknar ut potentiell energi med hjälp av massa och höjd
	 * @param mass - variabel för massan
	 * @param height - variabel för höjden
	 * @return - returnar potentialEnergy, den potentiella energin
	 */
	public static double potentialEnergy(double mass, double height) {
		double potentialEnergy = mass * G * height;
		System.out.println("Method nr 6:");
		return potentialEnergy;
	}
	
	/**
	 * Räknar ut hur hög hastighet man kommer upp i om man släpper ett föremål från en viss höjd
	 * @param height - en variabel för höjden
	 * @return - returnar fallSpeed, hastigheten som föremålet kommer upp i
	 */
	public static double fallSpeed(double height) {
		double fallSpeed = Math.sqrt ((2*height) / g_swe) * g_swe;
		System.out.println("Method nr 7:");
		return fallSpeed;
	}
	 
	/**
	 * Räknar ut skillnad mellan två givna värden
	 * @param first - en variabel för det första värdet
	 * @param last - en variabel för det andra värdet
	 * @return - returnar delta, skillnaden mellan de två värdena
	 */
	public static double delta(double first, double last) {
		double delta = last - first;
		System.out.println("Method nr 8:");
		return delta;
	}
	
	/**
	 * Gör om en viss volym av vätska till en massa
	 * @param fluid - en variabel för en viss vätska
	 * @param volume - en variabel för volymen
	 * @return - returnar volumeToMass, den slutgiltiga massan
	 */
	public static double volumeToMass(FluidTable fluid, double volume) {
		double volumeToMass = fluid.density * volume;
		System.out.println("Method nr 9:");
		return volumeToMass;
	}
	
	/**
	 * gör om en viss volym av gas till en massa
	 * @param gas - en variabel för en viss gas
	 * @param volume - en variabel för volymen
	 * @return - returnar volumeToMass, den slutgiltiga massan
	 */
	public static double volumeToMass(GasTable gas, double volume) {
		double volumeToMass = gas.density * volume;
		System.out.println("Method nr 10:");
		return volumeToMass;
	}
	
	/**
	 * gör om en viss volym av materia till en massa
	 * @param solid - en variabel för en viss materia
	 * @param volume - en variabel för volymen
	 * @return - returnar volumeToMass, den slutgiltiga massan
	 */
	public static double volumeToMass(SolidTable solid, double volume) {
		double volumeToMass = solid.density * volume;
		System.out.println("Method nr 11:");
		return volumeToMass;
	}
	
	/**
	 * räknar ut medelhastigheten med hjälp av sträcka och tid
	 * @param distance - en variabel för distansen
	 * @param time - en variabel för tiden
	 * @return - returnar svtVelocity, medelhastigheten
	 */
	public static double svtVelocity(double distance, double time) {
		double svtVelocity = distance / time;
		System.out.println("Method nr 12:");
		return svtVelocity;
	}
	
	/**
	 * räknar ut sträcka med hjälp av hastighet och tid
	 * @param velocity - en variabel för hastigheten
	 * @param time - en variabel för tiden
	 * @return - returnar svtDistance, sträckan
	 */
	public static double svtDistance(double velocity, double time) {
		double svtDistance = velocity * time;
		System.out.println("Method nr 13:");
		return svtDistance;
	}
	
	/**
	 * räknar ut tid med hjälp av sträcka och hastighet
	 * @param distance - en variabel för distansen
	 * @param velocity - en variabel för hastigheten
	 * @return - returnar svtTime, tiden
	 */
	public static double svtTime(double distance, double velocity) {
		double svtTime = distance / velocity;
		System.out.println("Method nr 14:");
		return svtTime;
	}
	
	/**
	 * räknar ut arbete med hjälp av kraft och sträcka
	 * @param force - en variabel för kraft
	 * @param distance - en variabel för distansen/sträckan
	 * @return - returnar work, arbetet som utförs
	 */
	public static double work(double force, double distance) {
		double work = force * distance;
		System.out.println("Method nr 15:");
		return work;
	}
	
	/**
	 * räknar ut effekt med hjälp av arbete och tid
	 * @param work - en variabel för arbete
	 * @param time - en variabel för tid
	 * @return - returnar power, slutgiltiga effekten
	 */
	public static double power(double work, double time) {
		double power = work / time;
		System.out.println("Method nr 16:");
		return power;
	}
	
	/**
	 * räknar ut hur mycket energi som krävs för att värma ett visst material ett angivet grader
	 * @param solid - en variabel för materialet
	 * @param mass - en variabel för massan
	 * @param deltaT - en variabel för skillnaden mellan temperaturen i början och slutet
	 * @return - returnar energy, energin som krävs
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		double energy = solid.heatCapacity * mass * deltaT;
		System.out.println("Method nr 17:");
		return energy;
	}
	
	/**
	 * räknar ut hur mycket energi som krävs för att värma en viss massa vätska ett angivet antal grader
	 * @param fluid - en variabel för vätskan
	 * @param mass - en variabel för massan hos vätskan
	 * @param deltaT - en variabel för skillnaden mellan temperaturen i början och slutet.
	 * @return - returnar energy, energin som krävs
	 */
	public static double heat(FluidTable fluid, double mass, double deltaT) {
		double energy = fluid.heatCapacity * mass * deltaT;
		System.out.println("Method nr 18:");
		return energy;
	}
	
	/**
	 * räknar ut hur mycket energi som krävs för att värma en viss massa gas ett angivet antal grader
	 * @param gas -  en variabel för gas
	 * @param mass - en variabel för massan
	 * @param deltaT -  en variabel för skillnaden mellan temperaturen i början och slutet
	 * @return - returnar power, mängden av energin som behövs
	 */
	public static double heat(GasTable gas, double mass, double deltaT) {
		double power = gas.heatCapacity * mass * deltaT;
		System.out.println("Method nr 19:");
		return power;
	}
	
	/**
	 * räknar ut hur högt ett föremål med en viss hastighet uppåt kommer
	 * @param velocity - en variabel för hastigheten
	 * @return - returnar velocityToHeight, den slutgiltiga höjden
	 */
	public static double velocityToHeight(double velocity) {
		double velocityToHeight = (Math.pow(Math.sin(1.570796),2 )* Math.pow(velocity, 2))/ (2*g_swe);
		System.out.println("Method nr 20:");
		return velocityToHeight;
	}
	
	

	/**
	 * Räknar ut hur många gånger en boll kommer studsa om den förlorar 1% av sin energi efter varje studs
	 * @param height - en variabel för höjden
	 * @return - bounceCounter, hur många gånger bollen har studsat
	 */
	public static double amountOfBounces(double height) {
		double lastEnergy = height * g_swe;
		int bounceCounter = 0;
		double i = 12;
		while (i >= 0.5) {
			lastEnergy *=0.99;
			i = lastEnergy / g_swe;
			bounceCounter++;
		}
		return bounceCounter;
	}
	
	
	
	
	
	//Tio egna fysikaliska metoder:
	
	
	/**
	 * Räknar ut lägesnergin med en given massa samt höjd
	 * @param mass -  en variabel för massa
	 * @param height - en variabel för höjd
	 * @return - returnar rörelseenergi, den totala rörelseenergin
	 */
	public static double energyOfPosition(double mass, double height) {
		double rörelseenergi = mass * g_swe * height;
		System.out.println("Answer of question nr1");
		return rörelseenergi;
	}
	
	/**
	 * Räknar ut arean av en triangel när man får reda på basen och höjden
	 * @param base - en variabel för basen
	 * @param height - en variabel för höjden
	 * @return - returnar area, arean av traingeln
	 */
	public static double areaOfTriangle(double base, double height) {
		double area = (base * height) / 2;
		System.out.println("Answer of question nr2");
		return area;
	}
	
	/**
	 * Rääknar ut arean av en circel när man vet radien
	 * @param radius - en variabel för radien
	 * @return - returnar area, arean av circeln
	 */
	public static double areaOfCircle(double radius) {
		double area = Math.PI * radius * radius;
		System.out.println("Answer of question nr3");
		return area;
	}
	
	/**
	 * Räknar ut längden på hypotenusan av en rätvinklig triangel när man vet basen och höjden
	 * @param height - en variabel för höjden
	 * @param base - en variabel för basen
	 * @return - returnar hypotenuse, hypotenusan på triangeln
	 */
	public static double lengthOfHypotenuse(double height, double base) {
		double hypotenuse = Math.pow(height, 2) + Math.pow(base, 2);
		hypotenuse = Math.sqrt(hypotenuse);
		System.out.println("Answer of question nr4");
		return hypotenuse;
	}
	
	/**
	 * Räknar ut rörelseenergin när man vet massan och hastigheten
	 * @param mass - en variabel för massan
	 * @param velocity - en variabel för hastigheten
	 * @return - returnar rörelseenergi, en variabel för rörelseenergi (med samma namn bara)
	 */
	public static double momentum(double mass, double velocity) {
		double rörelseenergi = (mass * Math.pow(velocity, 2)) / 2;
		System.out.println("Answer of question nr5");
		return rörelseenergi;
	}
	
	/**
	 * Räknar ut den kraft som behövs för att lyfta en människa som väger ett visst antal kilo
	 * @param mass - en variabel för massan (vikten)
	 * @return - returnar force, kraften som krävs
	 */
	public static double force(double mass) {
		double force = mass * g_swe;
		System.out.println("Answer of question nr6");
		return force;
	}
	
	/**
	 * Omvandlar miles per hour till kilometer per timme
	 * @param velocity - en variabel för hastigheten
	 * @return - returnar speed, hastigheten i km/h
	 */
	public static double mphToKmh(double velocity) {
		double speed = velocity * 1.609344;
		System.out.println("Answer of question nr7");
		return speed;
	}
	
	/**
	 * Omvandlar inches till centimeter
	 * @param length - en variabel för längden
	 * @return - returnar lenthInCentimeters, längden fast omvandlad till centimeter
	 */
	public static double inchesToCentimeter(double length) {
		double lengthInCentimeters = length * 2.54;
		System.out.println("Answer of question nr8");
		return lengthInCentimeters;
	}
	
	/**
	 * Omvandlar feet till meter
	 * @param length - en variabel för längden
	 * @return - newLength, den nya längden omvandlad till meter
	 */
	public static double feetToMeter(double length) {
		double newLength = length * 0.3048;
		System.out.println("Answer of question nr9");
		return newLength;
	}
	
	/**
	 * Räknar ut volymen på en cylinder när man vet radien och höjden
	 * @param radius - en variabel för radien
	 * @param height - en variabel för höjden
	 * @return - returnar area, arean för cylindern
	 */
	public static double volumeCylinder(double radius, double height) {
		double area = 2 * Math.PI * radius * (height + radius);
		System.out.println("Answer of question nr10");
		return area;
	}
		
}


