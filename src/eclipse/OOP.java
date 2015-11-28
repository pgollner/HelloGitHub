package eclipse;

public class OOP 
{
	public static void main(String[] args)
	{
		//Demo
		OOP_car porsche912 = new OOP_car();
		porsche912.Brand = "Porsche";
		porsche912.Colour = "Black";
		porsche912.Year= 2027;
		System.out.println("Auto mit folgenden Werten erstellt: Marke="+ porsche912.getBrand() + " Baujahr=" + porsche912.getYear() + 
						   " Farbe=" + porsche912.getColour()) ;
		porsche912.SetCurrenGear(3);
		System.out.println("Aktueller Gang Porsche: " + porsche912.getCurrentGear());
		porsche912.accelerate();
		porsche912.NextGear();
		System.out.println("Aktueller Gang Porsche: " + porsche912.getCurrentGear());
		System.out.println("Aktueller Speed Porsche: " + porsche912.getCurrentSpeed());

		OOP_car fiesta = new OOP_car();
		fiesta.Brand = "Ford";
		fiesta.Colour = "Frostwhite";
		fiesta.Year = 2014;
		System.out.println("Auto mit folgenden Werten erstellt: Marke="+ fiesta.getBrand() + " Baujahr=" + fiesta.getYear() + 
						   " Farbe=" + fiesta.getColour()) ;
		fiesta.SetCurrenGear(2);
		System.out.println("Aktueller Gang Fiesta: " + fiesta.getCurrentGear());
		fiesta.accelerate();
		fiesta.accelerate(90);
		fiesta.NextGear();
		System.out.println("Aktueller Gang Fiesta: " + fiesta.getCurrentGear());
		System.out.println("Aktueller Speed Fiesta: " + fiesta.getCurrentSpeed());
		
		OOP_Waehrungsbetrag chfBetrag = new OOP_Waehrungsbetrag();
		chfBetrag.Wert = 15000;
		chfBetrag.Zeichen = "CHF";
		
		System.out.println("---------------------------------" );
		
		OOP_Konto Account1 = new OOP_Konto("Patrick G.","AT600000","OPSKATWW",1000);
		System.out.println("Aktueller Kontostand " + Account1.getAccountHolder() +": " + Account1.getCurrentBalance());
		Account1.receive(1000);
		System.out.println("Aktueller Kontostand " + Account1.getAccountHolder() +": " + Account1.getCurrentBalance());
		Account1.pay(1250);
		System.out.println("Aktueller Kontostand " + Account1.getAccountHolder() +": " + Account1.getCurrentBalance());
		
	}
}

