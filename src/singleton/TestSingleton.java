package singleton;

public class TestSingleton {

	public static void main(String[] args) {
		
		ConfigSingleton cs = ConfigSingleton.getInstance();
		
		ConfigSingleton cs2 = ConfigSingleton.getInstance();
		
		System.out.println(cs);
		System.out.println(cs2);
	}

}
