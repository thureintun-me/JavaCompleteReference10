package list24;

public interface MyIf {
	
	int getNumber();
	
	// This is a default method. Notice that it provides 
	  // a default implementation. 
	default String getString() {
		return "Default String";
	}

}
