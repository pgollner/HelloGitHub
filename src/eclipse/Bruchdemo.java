package eclipse;

public class Bruchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bruch b1 = new Bruch(3, 4);
		System.out.println(b1.toDecimal());
		b1.print();
		System.out.println("Anzahl der Brüche: " + Bruch.counter);
		Bruch b2 = new Bruch(5, 7);
		b2.print();
		System.out.println("Anzahl der Brüche: " + Bruch.counter);
		Bruch erg = b1.multiplicate(b2);
		erg.print();
		System.out.println("Anzahl der Brüche: " + Bruch.counter);
		Bruch b3 = new Bruch(1, 2);
		b3.print();
		System.out.println("Anzahl der Brüche: " + Bruch.counter);
		Bruch erg2 = b1.multiplicate(b2, b3);
		erg2.print();
		System.out.println("Anzahl der Brüche: " + Bruch.counter);
		
	}

}



