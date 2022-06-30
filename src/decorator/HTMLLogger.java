package decorator;

public class HTMLLogger extends LoggerDecorator {

	public HTMLLogger(Logger logger) {
		super(logger);
	}

	@Override
	public void log(String message) {
		logger.log(makeHTML(message));
	}
	
	private String makeHTML(String message) {
		return "<HTML>" + message + "</HTML>";
	}

}
