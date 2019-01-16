package interfacedemo;

public class Client implements Callback {

	@Override
	public void callback(int p) {
		System.out.println("call back with " + p);
	}
	
	void nonIFaceMeth() {
		System.out.println("Class that implemt interface " + " may also define other members, too");
	}
}
