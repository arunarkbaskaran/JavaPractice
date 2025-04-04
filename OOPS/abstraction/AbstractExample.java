package abstraction;

public class AbstractExample {
	public static void main(String args[]) {
		/*
		 * Abstraction means separates idea from actual implementation
		 * 
		 * Define only idea in one class
		 * 
		 * Ideas can be implemented in its subclass
		 * 
		 * Can be implemented by Abstract class and Interface
		 * */
		SubClassOne objClass1 = new SubClassOne();
		objClass1.anIdea();
		objClass1.sampleIdea();
		SubClassTwo objClass2 = new SubClassTwo();
		objClass2.anIdea();
		objClass2.sampleIdea();

	}
}
