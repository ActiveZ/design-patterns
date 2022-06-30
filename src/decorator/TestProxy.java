package decorator;

public class TestProxy {

	public static void main(String[] args) {
		Logger logger = new ConsoleLogger();
		Logger cachedLogger = new CachedLogger(logger);
		cachedLogger.log("Coucou");
		cachedLogger.log("comment");
		cachedLogger.log("vas");
		cachedLogger.log("tu ?");
		System.out.println("AVANT DEPASSEMENT");
		cachedLogger.log("dfgsdfgqsdfkgjqmfdkjgmqdkfjgmkdjsfgmklsjfgmksjfdgmkjsdfmkgjqdnfqnmqkndfggmqkfjdgksqjdfgmskjfg");
		cachedLogger.log("dfgsdfgqsdfkgjqmfdkjgmqdkfjgmkdjsfgmklsjfgmksjfdgmkjsdfmkgjqdnfqnmqkndfggmqkfjdgksqjdfgmskjfg");
		cachedLogger.log("dfgsdfgqsdfkgjqmfdkjgmqdkfjgmkdjsfgmklsjfgmksjfdgmkjsdfmkgjqdnfqnmqkndfggmqkfjdgksqjdfgmskjfg");
		cachedLogger.log("dfgsdfgqsdfkgjqmfdkjgmqdkfjgmkdjsfgmklsjfgmksjfdgmkjsdfmkgjqdnfqnmqkndfggmqkfjdgksqjdfgmskjfg");
		cachedLogger.log("dfgsdfgqsdfkgjqmfdkjgmqdkfjgmkdjsfgmklsjfgmksjfdgmkjsdfmkgjqdnfqnmqkndfggmqkfjdgksqjdfgmskjfg");
		cachedLogger.log("dfgsdfgqsdfkgjqmfdkjgmqdkfjgmkdjsfgmklsjfgmksjfdgmkjsdfmkgjqdnfqnmqkndfggmqkfjdgksqjdfgmskjfg");
		
//		Logger bigCachedLogger = new CachedLogger(logger, 1000);
	}

}
