package command;

public class Light {
	private boolean on = false;
	
	public void turnOn() {
		on = true;
		System.out.println("Et la lumière fût !!!");
	}
	public void turnOff() {
		on = false;
		System.out.println("Ici les ténèbres...");
	}

}
