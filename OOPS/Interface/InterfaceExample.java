package Interface;
/*
 * Interface can have only abstract methods. Since Java 8, it can have default and static methods also.
 * Interface supports multiple inheritance.
 * Interface has only static and final variables.
 * An interface can extend another Java interface only.
 * An interface can be implemented using keyword "implements"
 * Members of a Java interface are public by default.
 * */
interface Vehicle {
	void changeGear(int a);

	void speedUp(int a);

	void applyBrakes(int a);

	abstract void applyColor();

	abstract void printStates();
}

class Bicycle implements Vehicle {

	int speed;
	int gear;

	// to change gear
	@Override
	public void changeGear(int newGear) {

		gear = newGear;
	}

	// to increase speed
	@Override
	public void speedUp(int increment) {

		speed = speed + increment;
	}

	// to decrease speed
	@Override
	public void applyBrakes(int decrement) {

		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println("speed: " + speed + " gear: " + gear);
	}

	public void applyColor() {
		System.out.println("Red");

	}
}

class Bike implements Vehicle {

	int speed;
	int gear;

	// to change gear
	@Override
	public void changeGear(int newGear) {

		gear = newGear;
	}

	// to increase speed
	@Override
	public void speedUp(int increment) {

		speed = speed + increment;
	}

	// to decrease speed
	@Override
	public void applyBrakes(int decrement) {

		speed = speed - decrement;
	}

	public void printStates() {
		System.out.println("speed: " + speed + " gear: " + gear);
	}

	public void applyColor() {
		System.out.println("Black");

	}

}

class InterfaceExample {

	public static void main(String[] args) {

		// creating an instance of Bicycle
		// doing some operations
		Bicycle bicycle = new Bicycle();
		bicycle.changeGear(2);
		bicycle.speedUp(3);
		bicycle.applyBrakes(1);

		System.out.println("Bicycle present state :");
		bicycle.printStates();

		// creating instance of the bike.
		Bike bike = new Bike();
		bike.changeGear(1);
		bike.speedUp(4);
		bike.applyBrakes(3);

		System.out.println("Bike present state :");
		bike.printStates();
	}
}
