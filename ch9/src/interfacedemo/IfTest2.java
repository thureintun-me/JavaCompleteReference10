package interfacedemo;

public class IfTest2 {

	public static void main(String[] args) {

		DynStack obj1 = new DynStack(5);
		DynStack obj2 = new DynStack(8);
		
		for(int i=0;i<12;i++)obj1.push(i);
		for(int i=0;i<20;i++)obj2.push(i);
		
		System.out.println("item in stack 1");
		for(int i=0;i<12;i++) {
			System.out.println(obj1.pop());
		}
		
		System.out.println("item in stack 2");
			for(int i=0;i<20;i++) {
				System.out.println(obj2.pop());
			}
	}

}
