//listing 11

class A{

  A(){
    System.out.println("Inside's A constructor");
  }
}

class B extends A{

    B(){
      System.out.println("Inside's B constructor");
    }
}

class C extends B{

    C(){
      System.out.println("Inside's C constructor");
    }
}


public class CallingCons{
  public static void main(String[] args) {
    C c = new C();
  }
}
