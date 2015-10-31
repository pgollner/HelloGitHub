package eclipse;

public class HelloGitHub 
{

	public static void main(String[] args) 
	{
																								// variablen anlegen
		boolean treeFront = true; 																// booleanvariable angelegt mit Ausgangswert
		String text = "Baumvoraus ";															//String ist immer groﬂ zu schreiben
		int numberleafes = 0; 																	// intvariable angelegt mit Ausgangswert 0
		char meinZeichen = 'X';
		double a = 9;
		double b = 5;
		System.out.println("\nTextausgabe \n" );
																								// Ausgabe als Text; ohne "ln" g‰be 
																								// es keinen Zeilenumbruch
		numberleafes++;
		System.out.println("Ist baum voraus? " + treeFront);
		System.out.println("Anzahl Bl‰tter: " + numberleafes);
		System.out.println();																	//leerzeile
		System.out.println("Anzahl Bl‰tter: " + numberleafes + "\n" + text + treeFront);
		System.out.println(meinZeichen);
		
		System.out.println("\nRechenoperationen \n" );
		
		System.out.println(a + " + " + b + " = " + (a + b));
		System.out.println(a + " - " + b + " = " + (a - b));
		System.out.println(a + " x " + b + " = " + (a * b));
		System.out.println(a + " : " + b + " = " + (a / b));
		System.out.println(a + " % " + b + " = " + (a % b));									//Rest einer Division ausgeben
		
		System.out.println("\nZinsberechnung \n" );
		double kontostand = 1000;
		double zinsen = 2.5;
		double erg = Zinsberechnung(kontostand, zinsen);										//der wert der in return gespeichert wird
		System.out.println("Zinsen: " + erg);													//kommt als erg
		
		System.out.println("\nCelsius in Fahrenheit \n" );
		double celsius = 30;
		double ergcelsius = celsius2fahrenheit(celsius);										
		System.out.println(celsius + "∞ Celsius sind " + ergcelsius + " ∞ Fahrenheit");
		
		System.out.println("\nFahrenheit in Celsius \n" );
		double fahrenheit = 86;
		double ergfahrenheit = fahrenheit2celsius(fahrenheit);										
		System.out.println(fahrenheit + "∞ Fahrenheit sind " + ergfahrenheit + " ∞ Celsius");
		
	}
	public static double Zinsberechnung(double kontostand,double zinsen)						//ausgelagerte Zinsberechnung
	{
		
		return kontostand * zinsen / 100;
		
	}
	
	public static double celsius2fahrenheit(double celsius)										//ein weiteres Beispiel
	{
		return (9.0/5.0) * celsius + 32;
	}
	public static double fahrenheit2celsius(double fahrenheit)																							//ein weiteres Beispiel
	{
		return  (fahrenheit -32) / (9.0/5.0);
	}
}
