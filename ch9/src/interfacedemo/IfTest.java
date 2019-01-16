package interfacedemo;

public class IfTest {

	public static void main(String[] args) {

		FixedStack obj1 = new FixedStack(5);
		FixedStack obj2 = new FixedStack(8);
		
		for(int i=0;i<5;i++)obj1.push(i);
		for(int i=0;i<8;i++)obj2.push(i);
		
		System.out.println("item in stack1");
		 
		for(int i=0;i<5;i++) {
			System.out.println(obj1.pop());
		}
		
		System.out.println("item in stack2");
		
		for(int i=0;i<8;i++) {
			System.out.println(obj2.pop());
		}
	}

}
