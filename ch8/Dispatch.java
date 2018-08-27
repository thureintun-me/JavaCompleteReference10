//listing 15
class A{

  void callMe(){
    System.out.println("Inside's A mehtod is called");
  }
}


class B extends A{
  //override callMe()
  void callMe(){
    System.out.println("Inside's B method is called");
  }
}

class C extends A{
  //override callMe()
  void callMe(){
    System.out.println("Inside's C method is called");
  }
}

public class Dispatch{
  public static void main(String[] args) {
    A a = new A();
    B b = new B();
    C c = new C();
    A r ;

    r = a ;
    r.callMe(); // calls A version of callMe()

    r = b ;
    r.callMe(); // calls B version of callMe()

    r = c ;
    r.callMe(); // calls C version of callMe()

  }
}
