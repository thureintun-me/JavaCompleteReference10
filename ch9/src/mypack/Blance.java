package mypack;

public class Blance {
	
	String name;
	  double bal;

	 public  Blance(String n, double b) {
	    name = n;
	    bal = b;
	  }

	 public void show() {
	    if(bal<0) 
	      System.out.print("-->> ");
	    System.out.println(name + ": $" + bal);
	  }
	
}
