public class PassOb{
  public static void main(String[] args) {
    Test t1 = new Test(22,10);
    Test t2 = new Test(22,10);
    Test t3 = new Test(-8,-8);

    System.out.println("t1==t2 :"+t1.equlaTo(t2));
    System.out.println("t1==t3 :"+t1.equlaTo(t3));

  }
}
