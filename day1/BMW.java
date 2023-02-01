package week3.day1;

public class BMW extends Car  {
	
	public void autoPark() {
		System.out.println("Auto Park");
	}
	
	public static void main(String [] args) {
		BMW myCar = new BMW();
		myCar.applyBrake();
		myCar.soundHorn();
		myCar.turnOnAC();
		myCar.autoPark();
	}

}
