package interfacedemo;

public class AnotherClient implements Callback {

	public void callback(int p) {
		System.out.println("Another version of callback...");
		System.out.println("p sqaured is :" + (p*p));
	}

}
