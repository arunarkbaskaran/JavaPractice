package encapsulation;

public class EncapTest {

	public static void main(String[] args) {
		Encap bike1=new Encap();
		Encap bike2=new Encap();
		bike1.setbikeName("Honda");
		bike1.setregNumber("KA X1 AA XXX1");
		bike1.setinsureDate("12-03-2026");
		bike2.setbikeName("Honda");
		bike2.setregNumber("KA X2 AA XXX2");
		bike2.setinsureDate("12-03-2027");
		System.out.println("Bike Name\t:\t"+bike1.getbikeName());
		System.out.println("Reg Number\t:\t"+bike1.getregNumber());
		System.out.println("Insure Date\t:\t"+bike1.getinsureDate());
		System.out.println("\n\t");
		System.out.println("Bike Name\t:\t"+bike2.getbikeName());
		System.out.println("Reg Number\t:\t"+bike2.getregNumber());
		System.out.println("Insure Date\t:\t"+bike2.getinsureDate());
	}

}
