package eclipse;

public class OOP_car 
{
	 private int CurrentSpeed;
	 public String Colour;
	 public String Brand;
	 public int Year;
	 private int CurrentGear;


	 public void SetCurrenGear (int CurrentGear)
	 {
		 this.CurrentGear = CurrentGear;
	 }
	 
	 
	 public String getColour() {
		return Colour;
	}


	public void setColour(String colour) {
		Colour = colour;
	}


	public String getBrand() {
		return Brand;
	}


	public void setBrand(String brand) {
		Brand = brand;
	}


	public int getYear() {
		return Year;
	}


	public void setYear(int year) {
		Year = year;
	}


	public int getCurrentGear() {
		return CurrentGear;
	}

	public void NextGear()
	 {
		 CurrentGear++;
	 }

	public void accelerate()
	 {
		 this.CurrentSpeed+=10;
	 }
	 
	 public void accelerate(int eigengewaehlt)
	 {
		 CurrentSpeed +=eigengewaehlt;
	 }


	public int getCurrentSpeed() {
		return CurrentSpeed;
	}
	 
}
