package p2;

public class OtherPackage {
	 
	public OtherPackage() {
		p1.Protection p = new p1.Protection();
		System.out.println("Other package Construtor...");
		
		//class or package only
		//System.out.println("n:"+p.n);
		
		//class only
		//System.out.println("n_pri"+p.n_pri);
	
		//class , subclass or package only
		//System.out.println("n_pro"+p.n_pro);
		
		System.out.println("n_pub"+p.n_pub);
	}
}
