package singleton;

public class ConfigSingleton {
	
	private final static ConfigSingleton INSTANCE = new ConfigSingleton();
	
	private ConfigSingleton() {}
	
	public static ConfigSingleton getInstance() {
		return INSTANCE;
	}
	
	public String getConfig(String key) {
		return "TRUC";
	}

}
