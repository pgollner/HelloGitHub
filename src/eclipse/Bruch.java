
package eclipse; 
 
public class Bruch { 

 
	private int nenner; 
	private int zaehler; 
	public static int counter=0; 
	public Bruch(int zaehler, int nenner) { 
		this.nenner = nenner; 
		this.zaehler = zaehler;
		this.counter++;
	} 
	
 
	public int getNenner() { 
 		return nenner; 
 	} 
 
 
 	public int getZaehler() { 
 		return zaehler; 
 	} 
 	 
 	public double toDecimal() 
 	{ 
 		return 1.0 * zaehler / nenner; 
 	} 
 	 
 	public void print() 
 	{ 
 		System.out.println(zaehler + " / " + nenner); 
 	} 
 	 
 	public Bruch multiplicate(Bruch b2) 
 	{ 
 		int neu_nenner = this.nenner * b2.getNenner(); 
 		int neu_zaehler = this.zaehler * b2.getZaehler(); 
 		 
 		Bruch ergebnis = new Bruch(neu_zaehler, neu_nenner); 
 		return ergebnis; 
 	} 
 		 
 	public Bruch multiplicate(Bruch b2, Bruch b3) 
 	{ 
 		return new Bruch( 
 				this.nenner * b2.getNenner() *b3.getNenner(),  
 				this.zaehler * b2.getZaehler()*b3.getZaehler());	 
 	} 
 } 

