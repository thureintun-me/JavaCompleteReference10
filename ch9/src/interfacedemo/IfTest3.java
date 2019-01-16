package interfacedemo;

public class IfTest3 {
	public static void main(String[] args) {
		
		IntStack myStack ;
		DynStack ds = new DynStack(5);
		FixedStack fs = new FixedStack(8);
		
		myStack = ds;
		for(int i=0;i<12;i++)myStack.push(i);
		
		myStack = fs;
		for(int i=0;i<8;i++)myStack.push(i);
		
		System.out.println("item in dynamic stack");
		myStack = ds;
		for(int i=0;i<12;i++) {
			System.out.println(myStack.pop());
		}
		
		System.out.println("item in fixed stack");
		myStack = fs;
		for(int i=0;i<8;i++) {
			System.out.println(myStack.pop());
		}
		
		
		
		
	}
	
}
