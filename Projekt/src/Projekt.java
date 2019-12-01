

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
		
		//Svaren p� de 10 fr�gorna:
		
		//60dm^3 �r detsamma som 0.6m^3
		System.out.println("Hur mycket v�ger 60dm^3 j�rn?");
		System.out.println(volumeToMass(SolidTable.IRON,0.06) + "kg");
		
		//50 minuter �r detsamma som 3000 sekunder
		System.out.println("Hur l�ngt hinner Tomas om han l�per med medelhastigheten 2.7m/s i 50 minuter?");
		System.out.println(svtDistance(2.7,3000));
	
		System.out.println("Hur mycket energi kr�vs f�r att v�rma upp 4 liter vatten fr�n rumstemperatur (22 grader) till kokpunkten");
		System.out.println(heat(FluidTable.WATER,4,78));
		
		System.out.println("Hur stort �r det totala trycket 75 meter under havsytan?");
		System.out.println(fluidPressure(FluidTable.WATER,75));
		
		System.out.println("Tomas som �r 180cm l�ng kastar upp en boll med massan 250 gram i luften s� den f�r starthastigheten 60km/h. Hur h�gt kommer bollen?");
		System.out.println(velocityToHeight(16.6) + 1.8 + "m");
		
		System.out.println("En bil med massan 735kg accelererar med konstand acceleration fr�n 0-100 p� 4.8 sekunder. Hur stor effekt har bilens motor uppn�t?");
		System.out.println(power(580500, 4.8) + "W");
	
		System.out.println("En studsboll som v�ger 1kg sl�pps fr�n 10 meters h�jd och varje g�ng den nuddar marken s� tappar den 1% av sin energi. Hur m�nga g�nger kommer bollen studsa i marken innan den inte studsar h�gre �n 0.5 meter?");
		System.out.println(amountOfBounces(12));
	
		System.out.println("Hur h�g hastighet f�r kulan om den kommer 15 meter p� 2.79 sekunder?");
		System.out.println(svtVelocity(15,2.79));
	
		System.out.println("Hur m�nga fler m�l gjorde IFK G�teborg �n AIK om det blev 11-1 till IFK G�teborg?");
		System.out.println(delta(1,11));
	
		System.out.println("Hur l�ngt kommer Kalle om han springer i 40 sekunder med hastigheten 20m/s?");
		System.out.println(svtDistance(20,40));
	
		
		//Tio egna fysikaliska metoder:
		
		/**
		 * Egna fr�gor till metoderna:
		 * 1. Vad �r r�relseenergin om ett f�rem�l har massan 50kg och befinner sig 15 meter upp i luften?
		 * 2. Vad �r arean av en triangel med basen 10cm och h�jden 15cm?
		 * 3. Vad �r arean av en circel med radien 7cm?
		 * 4. Hur l�ng �r hypotenusan om basen �r 15cm och h�jden 15cm?
		 * 5. Vad �r r�relseenergin om massan �r 47 och hastigheten �r 15m/s?
		 * 6. Hur mycket kraft beh�vs f�r att lyfta en m�nniska som v�ger 60kg?
		 * 7. Hur m�nga kilometer per timme �r 5 miles per hour?
		 * 8. Hur m�nga centimeter �r 8 inches?
		 * 9. Hur m�nga meter �r 100 feet?
		 * 10. Hur stor �r volymen p� en cylinder med radien 14cm och h�jden 31cm?
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
	 * @return - returnar kelvinToCelsius, allts� resultatet angivet i Celsius 
	 */
	public static double kelvinToCelsius(double kelvin) {
		double kelvinToCelsius = kelvin - 273.15;
		System.out.println("Method nr 2:");
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
		System.out.println("Method nr 3:");
		return fluidPressure;
	}
	
	/**
	 * R�knar ut v�tsketrycket i vatten vid ett visst djup
	 * @param deep - en variabel f�r djupet
	 * @return - returnar pressureUnderWater, v�tsketrycket i vattnet vid det angivna djupet
	 */
	public static double pressureUnderWater(double deep) {
		double pressureUnderWater = 10 * G * 998;
		System.out.println("Method nr 4:");
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
		System.out.println("Method nr 5:");
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
		System.out.println("Method nr 6:");
		return potentialEnergy;
	}
	
	/**
	 * R�knar ut hur h�g hastighet man kommer upp i om man sl�pper ett f�rem�l fr�n en viss h�jd
	 * @param height - en variabel f�r h�jden
	 * @return - returnar fallSpeed, hastigheten som f�rem�let kommer upp i
	 */
	public static double fallSpeed(double height) {
		double fallSpeed = Math.sqrt ((2*height) / g_swe) * g_swe;
		System.out.println("Method nr 7:");
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
		System.out.println("Method nr 8:");
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
		System.out.println("Method nr 9:");
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
		System.out.println("Method nr 10:");
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
		System.out.println("Method nr 11:");
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
		System.out.println("Method nr 12:");
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
		System.out.println("Method nr 13:");
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
		System.out.println("Method nr 14:");
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
		System.out.println("Method nr 15:");
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
		System.out.println("Method nr 16:");
		return power;
	}
	
	/**
	 * r�knar ut hur mycket energi som kr�vs f�r att v�rma ett visst material ett angivet grader
	 * @param solid - en variabel f�r materialet
	 * @param mass - en variabel f�r massan
	 * @param deltaT - en variabel f�r skillnaden mellan temperaturen i b�rjan och slutet
	 * @return - returnar energy, energin som kr�vs
	 */
	public static double heat(SolidTable solid, double mass, double deltaT) {
		double energy = solid.heatCapacity * mass * deltaT;
		System.out.println("Method nr 17:");
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
		System.out.println("Method nr 18:");
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
		System.out.println("Method nr 19:");
		return power;
	}
	
	/**
	 * r�knar ut hur h�gt ett f�rem�l med en viss hastighet upp�t kommer
	 * @param velocity - en variabel f�r hastigheten
	 * @return - returnar velocityToHeight, den slutgiltiga h�jden
	 */
	public static double velocityToHeight(double velocity) {
		double velocityToHeight = (Math.pow(Math.sin(1.570796),2 )* Math.pow(velocity, 2))/ (2*g_swe);
		System.out.println("Method nr 20:");
		return velocityToHeight;
	}
	
	

	/**
	 * R�knar ut hur m�nga g�nger en boll kommer studsa om den f�rlorar 1% av sin energi efter varje studs
	 * @param height - en variabel f�r h�jden
	 * @return - bounceCounter, hur m�nga g�nger bollen har studsat
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
	 * R�knar ut l�gesnergin med en given massa samt h�jd
	 * @param mass -  en variabel f�r massa
	 * @param height - en variabel f�r h�jd
	 * @return - returnar r�relseenergi, den totala r�relseenergin
	 */
	public static double energyOfPosition(double mass, double height) {
		double r�relseenergi = mass * g_swe * height;
		System.out.println("Answer of question nr1");
		return r�relseenergi;
	}
	
	/**
	 * R�knar ut arean av en triangel n�r man f�r reda p� basen och h�jden
	 * @param base - en variabel f�r basen
	 * @param height - en variabel f�r h�jden
	 * @return - returnar area, arean av traingeln
	 */
	public static double areaOfTriangle(double base, double height) {
		double area = (base * height) / 2;
		System.out.println("Answer of question nr2");
		return area;
	}
	
	/**
	 * R��knar ut arean av en circel n�r man vet radien
	 * @param radius - en variabel f�r radien
	 * @return - returnar area, arean av circeln
	 */
	public static double areaOfCircle(double radius) {
		double area = Math.PI * radius * radius;
		System.out.println("Answer of question nr3");
		return area;
	}
	
	/**
	 * R�knar ut l�ngden p� hypotenusan av en r�tvinklig triangel n�r man vet basen och h�jden
	 * @param height - en variabel f�r h�jden
	 * @param base - en variabel f�r basen
	 * @return - returnar hypotenuse, hypotenusan p� triangeln
	 */
	public static double lengthOfHypotenuse(double height, double base) {
		double hypotenuse = Math.pow(height, 2) + Math.pow(base, 2);
		hypotenuse = Math.sqrt(hypotenuse);
		System.out.println("Answer of question nr4");
		return hypotenuse;
	}
	
	/**
	 * R�knar ut r�relseenergin n�r man vet massan och hastigheten
	 * @param mass - en variabel f�r massan
	 * @param velocity - en variabel f�r hastigheten
	 * @return - returnar r�relseenergi, en variabel f�r r�relseenergi (med samma namn bara)
	 */
	public static double momentum(double mass, double velocity) {
		double r�relseenergi = (mass * Math.pow(velocity, 2)) / 2;
		System.out.println("Answer of question nr5");
		return r�relseenergi;
	}
	
	/**
	 * R�knar ut den kraft som beh�vs f�r att lyfta en m�nniska som v�ger ett visst antal kilo
	 * @param mass - en variabel f�r massan (vikten)
	 * @return - returnar force, kraften som kr�vs
	 */
	public static double force(double mass) {
		double force = mass * g_swe;
		System.out.println("Answer of question nr6");
		return force;
	}
	
	/**
	 * Omvandlar miles per hour till kilometer per timme
	 * @param velocity - en variabel f�r hastigheten
	 * @return - returnar speed, hastigheten i km/h
	 */
	public static double mphToKmh(double velocity) {
		double speed = velocity * 1.609344;
		System.out.println("Answer of question nr7");
		return speed;
	}
	
	/**
	 * Omvandlar inches till centimeter
	 * @param length - en variabel f�r l�ngden
	 * @return - returnar lenthInCentimeters, l�ngden fast omvandlad till centimeter
	 */
	public static double inchesToCentimeter(double length) {
		double lengthInCentimeters = length * 2.54;
		System.out.println("Answer of question nr8");
		return lengthInCentimeters;
	}
	
	/**
	 * Omvandlar feet till meter
	 * @param length - en variabel f�r l�ngden
	 * @return - newLength, den nya l�ngden omvandlad till meter
	 */
	public static double feetToMeter(double length) {
		double newLength = length * 0.3048;
		System.out.println("Answer of question nr9");
		return newLength;
	}
	
	/**
	 * R�knar ut volymen p� en cylinder n�r man vet radien och h�jden
	 * @param radius - en variabel f�r radien
	 * @param height - en variabel f�r h�jden
	 * @return - returnar area, arean f�r cylindern
	 */
	public static double volumeCylinder(double radius, double height) {
		double area = 2 * Math.PI * radius * (height + radius);
		System.out.println("Answer of question nr10");
		return area;
	}
		
}


