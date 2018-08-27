//listing 17

abstract  class A{
    abstract void callMe();

    //ci=concrete methods are still alllowed in abstract class
    void callMeToo(){
      System.out.println("This is a concrete method");
    }
}

class B extends A{
  void callMe(){
    System.out.println("B implementation of callMe()");
  }
}
public  class AbstractDemo{
  public static void main(String[] args) {

      B b = new B();
      b.callMe();
      b.callMeToo();
  }
}
