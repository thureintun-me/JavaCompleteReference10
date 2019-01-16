package mypack;

public class AccountBalance {
	public static void main(String args[]) {
	    Blance current[] = new Blance[3];

	    current[0] = new Blance("K. J. Fielding", 123.23);
	    current[1] = new Blance("Will Tell", 157.02);
	    current[2] = new Blance("Tom Jackson", -12.33);

	    for(int i=0; i<3; i++) current[i].show();
	  }
}
