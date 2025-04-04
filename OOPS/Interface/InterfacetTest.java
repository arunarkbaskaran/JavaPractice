package Interface;

public class InterfacetTest implements InterfacePlayer {
 
    public static void main(String[] args)
    {
    	InterfacetTest it=new InterfacetTest();
    	System.out.println(it.shuffle());
        System.out.println(id);

    }

	public int shuffle() {
		System.out.println("inside Shuffle Override method!");
		return id+10;
	}
}