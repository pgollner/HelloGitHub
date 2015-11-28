package eclipse;

public class OOP_Konto 
{
	 private String AccountHolder;
	 private String IBAN;
	 private String BIC;
	 private int CurrentBalance;
	 
	 public String getAccountHolder() {
		return AccountHolder;
	}
	public int getCurrentBalance() 
	{
		 
		return CurrentBalance;
	}
	public OOP_Konto(String Holder, String IBAN, String BIC, int CurrentBalance)
	 {
		 this.AccountHolder = Holder;
		 this.IBAN = IBAN;
		 this.BIC = BIC;
		 this.CurrentBalance = CurrentBalance;
	 }
	 public void receive(int amountreceived)
	 {
		 CurrentBalance += amountreceived;
	 }
	 public void pay(int amountpayed)
	 {
		 if (CurrentBalance > amountpayed)
		 {
			 CurrentBalance -= amountpayed;
			 System.out.println("Zahlung von " + amountpayed + " wurde erfolgreich druchgeführt" );
		 }
		 else
		 { 
			System.out.println("Kontostand zu Niedrig");
		 }
	 }


}
