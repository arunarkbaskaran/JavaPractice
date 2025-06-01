package Practice;

class CustomException extends Exception {
	public CustomException(String message) {
		super(message);
	}

}

public class TryCatch {

	public static void main(String[] args) {
		try {
			int a = 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage().toString());
		} catch (Exception e) {
			System.out.println(e.getMessage().toString());
		} finally {
			System.out.println("Executed after Execption");
			try {
				System.out.println("Example for Custom Exception");
				customExp();
			} catch (CustomException ce) {
				System.out.println("Caught Custom Exception : " + ce.getMessage());
			}
		}
	}

	private static void customExp() throws CustomException {
		throw new CustomException("Custom Exception Message");
	}

}
