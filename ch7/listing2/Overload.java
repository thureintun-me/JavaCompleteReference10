package listing2;

public class Overload{
    public static void main(String[] args) {
      OverloadDemo ob = new OverloadDemo();
      int i = 88 ;
      double d = 88 ;

      ob.test();
      ob.test(4,5);
      ob.test(i);
      ob.test(d);
      ob.test(44.2);
    }
}
