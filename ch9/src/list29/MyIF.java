package list29;

public interface MyIF {
	
	int getNumber();
	
	default String getString() {
		return "Default String";
	}
	
	static int getDeafultNumber() {
		return 0;
	}
}
