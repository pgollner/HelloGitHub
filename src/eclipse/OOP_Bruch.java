package eclipse;

public class OOP_Bruch 
{
	private double nenner,zaehler;
	
	public OOP_Bruch(double zaehler, double nenner)
	 {
		 this.nenner = nenner;
		 this.zaehler = zaehler;

	 }

	public double getNenner() {
		return nenner;
	}

	public double getZaehler() {
		return zaehler;
	}
	
	public void print()
	{
		System.out.println(zaehler + "/" + nenner);
	}
	public double doubletodecimal()
	{
		return zaehler / nenner;
	}
	public OOP_Bruch multiplicate(OOP_Bruch b2)
	{
		double ezaehler = this.zaehler * b2.getZaehler();
		double enenner = this.nenner * b2.getNenner();
		
		OOP_Bruch erg = new OOP_Bruch(ezaehler,enenner);
		return erg;
		
	}
	public void multiplicateb3(double zaehlerb2,double nennerb2)
	{
		double ezaehler = this.zaehler * zaehlerb2;
		double enenner = this.nenner * nennerb2;
		double zerg= ezaehler * zaehlerb2;
		double nerg= enenner * nennerb2;
		System.out.println("(Bruch1 * Bruch2) * Bruch2 " + zerg + "/" + nerg);
	}
	
	
}
