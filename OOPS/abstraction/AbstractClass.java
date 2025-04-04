package abstraction;

abstract class AbstractClass {
	/*
	 * Use abstract keyword before the class.
	 * Meant to be extended by other classes.
	 * It can contain both abstract methods (without a body) and concrete methods (with a body).
	 * Subclasses must implement all abstract methods (unless they’re also abstract).
	 * A Java abstract class can have class members like private, protected, etc.
	 * An abstract class can extend another Java class and implement multiple Java interfaces.
	 * An abstract class can be extended using keyword "extends".
	 * Abstract class can provide the implementation of interface.
	 * Abstract class can have final, non-final, static and non-static variables.
	 * */
	abstract void anIdea();
	
	void sampleIdea()
	{
		System.out.println("Sample Idea Implementation from Abstract Class");
	}
}
