package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		EmailLogger logger = new EmailLogger();
		logger.Log(null);
		
		//birden çok işlemi tek bir işlemde toplamaya poliformizm nedir yani çok biçimlilik yani base sınıflarla, interface lerle yaparız
		
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger()};
		for (BaseLogger baseLogger : loggers) {
			baseLogger.Log("Log Mesajı");
		}
		
		
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.Add();
	}

}
