package state;

public class TestState {
	public static void main(String[] args) {
		AlertContext alertContext = new AlertContext();
		alertContext.alert();
		alertContext.alert();
		alertContext.alert();
		alertContext.setMobileAlert(new Normal());
		alertContext.alert();
		alertContext.alert();
		alertContext.alert();
		alertContext.alert();
		alertContext.setMobileAlert(new Silent());
		alertContext.alert();
		alertContext.alert();
		alertContext.alert();
		alertContext.alert();
		
	}

	
}
