package decorator;

public class TestDecorator {

	public static void main(String[] args) {
		Logger logger = new ConsoleLogger();
		Logger decorator = new HTMLLogger(logger);
		logger.log("Message de test de mon logger...");
		decorator.log("Message de test de mon decorator HTML...");
	}

}
