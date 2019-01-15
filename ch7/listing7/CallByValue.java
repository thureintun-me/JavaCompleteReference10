public class CallByValue{
  public static void main(String[] args) {
    Test test = new Test();
    int a =15 , b = 20 ;

    System.out.println("a and b before call : " + a + " " + b);

    test.math(a,b);
    System.out.println("a and b after call : " + a + " " + b);

  }
}
