class A{
  final void meth(){
    System.out.println("This is a final method");
  }

}

class B extends A{
  void meth(){//error !
    System.out.println("Illegal");
  }
}

public class Listing19{
  public static void main(String[] args) {
    // final method cannot Override
    // final class cannot has a subclass
  }
}
