package eclipse;

public class OOP_Bruch_Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OOP_Bruch b1 = new OOP_Bruch(1,4);
		
		b1.print();
		OOP_Bruch b2 = new OOP_Bruch(20,4);
		
		b2.print();
		System.out.println("Der Bruch1 als Dezimalzahl " + b1.doubletodecimal());
		System.out.println("Der Bruch1 als Dezimalzahl " + b2.doubletodecimal());
		
		b1.multiplicateb3(b2.getZaehler(), b2.getNenner());
	
	
	}

}
