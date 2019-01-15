public class PassObjRef{
  public static void main(String[] args) {
    Test t = new Test(2,4);

    System.out.println("t.a and t.b before call : " + t.a + " " + t.b);

    t.match(t);
    System.out.println("t.a and t.b after call : " + t.a + " " + t.b);

  }


}
