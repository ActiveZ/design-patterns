package decorator;

public class CachedLogger implements Logger {
	
	private Logger logger;
	private StringBuilder sb = new StringBuilder();
	private int size;
	
	public CachedLogger(Logger logger) {
		this(logger, 50);
	}
	public CachedLogger(Logger logger, int size) {
		this.logger = logger;
		this.size = size;
	}
	
	@Override
	public void log(String message) {
		sb.append(message);
		if (sb.length()>this.size) {
			logger.log(sb.toString());
			sb.setLength(0);
		}else {
			sb.append("\n");
		}
	}

}
