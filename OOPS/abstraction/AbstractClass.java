package abstraction;

abstract class AbstractClass {
	/*
	 * Use abstract keyword before the class.
	 * Meant to be extended by other classes.
	 * It can contain both abstract methods (without a body) and concrete methods (with a body).
	 * Subclasses must implement all abstract methods (unless they’re also abstract).
	 * */
	abstract void anIdea();
	
	void sampleIdea()
	{
		System.out.println("Sample Idea Implementation from Abstract Class");
	}
}
