public class TestStack{
  public static void main(String[] args) {
    Stack stack1 = new Stack();
    Stack stack2 = new Stack();

    for (int i=0; i<10; i++) stack1.push(i);
    for (int i=10;i<20;i++) stack2.push(i);

    System.out.println("Stack in my stack1");
    for (int i=0; i<10; i++) {
      System.out.println(stack1.pop());

    }

    System.out.println("Stack in my stack 2");

    for(int i=0;i<10;i++)
    System.out.println(stack2.pop());




  }
}
