package state;

import java.io.PrintStream;
import java.io.PrintWriter;

public class AlertContext {
	private MobileAlert currentMobileAlert = new Vibration();
	public void setMobileAlert(MobileAlert mobileAlert) {
		this.currentMobileAlert = mobileAlert;
	}
	
	public void notify(String message) {
		System.out.println(message);
	}
	
	public void alert() {
		currentMobileAlert.alert(this);
	}
	
	
}
