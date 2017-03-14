public class FileLogger {

	private static FileLogger logger;

	private FileLogger() {
	}

	public static FileLogger getLogger() {
		if (logger == null) {
			logger = new FileLogger();
		}
		return logger;
	}
	
	
}
