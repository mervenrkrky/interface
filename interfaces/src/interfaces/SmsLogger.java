package interfaces;

public class SmsLogger implements Logger {//logeri implements(ugulama)eder

	@Override
	public void log(String message) {
		System.out.println("Sms gönderildi "+ message);
		
	}

}
