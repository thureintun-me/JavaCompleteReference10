package p2;

public class Protection2 extends p1.Protection {
	
	public Protection2() {
		System.out.println("Derived Other Package Constructor...");
		//class or package only
		//System.out.println("n:"+n);
		
		//class only
		//System.out.println("n_pri"+n_pri);
		
		System.out.println("n_pro"+n_pro);
		System.out.println("n_pub"+n_pub);
	}

}
