package Practice;

public class SingletonPractice {
	private static SingletonPractice instance = null;;

	private SingletonPractice() {
		// Private Constructor
		//Cannot create constructor in another class
	}

	public static SingletonPractice createObject() {
		if (instance == null) {
			instance = new SingletonPractice();
		}
		return instance;
	}

	public static void main(String[] args) {
		SingletonPractice sp = SingletonPractice.createObject();
	}

}
