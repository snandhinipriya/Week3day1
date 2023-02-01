package week3.day1;

public class SmartPhone extends AndroidPhone {
	
	public void connectWhatsapp () {
		System.out.println("Connect to Whatsapp");
	}
	
	public static void main(String [] args) {
		SmartPhone phone = new SmartPhone();
		phone.connectWhatsapp();
		phone.takeVideo();
		phone.makeCall();
		phone.sendMsg();

}
}
