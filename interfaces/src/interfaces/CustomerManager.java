package interfaces;

public class CustomerManager {
	private Logger[] loggers;
	
	
	public CustomerManager(Logger[] loggers) {
		
		this.loggers = loggers;
		
	}
	
	public void add(Customer customer) {
		System.out.println("M??teri eklendi : " +customer.getFirstName());
		/*for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
			
		}*/
	
		Utils.runLoggers(loggers,customer.getLastName());
	}
	public void delete(Customer customer) {
		/*System.out.println("M??teri silindi." +customer.getFirstName());
		for(Logger logger:loggers) {
			logger.log(customer.getFirstName());
			
			
		}*/
		Utils.runLoggers(loggers,customer.getLastName());
	}

}
