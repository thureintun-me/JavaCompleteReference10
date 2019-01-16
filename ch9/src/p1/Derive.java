package p1;
import p1.Protection;

public class Derive extends Protection {
	
	public Derive() {
		
		System.out.println("Derived Constructor....");
		System.out.println("n :" + n);
		//class only
		//System.out.println("n_pri" + n_pri);
		System.out.println("n_pro"+n_pro);
		System.out.println("n_pub"+n_pub);
		
		
	}
}
