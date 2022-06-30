package decorator;

public abstract class LoggerDecorator implements Logger {
	
	Logger logger;
	
	public LoggerDecorator(Logger logger) {
		this.logger = logger;
	}

	@Override
	public abstract void log(String message);
}
