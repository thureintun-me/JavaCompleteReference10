//listing 1

//creating a super class
class A{
  int i , j ;

  void showij(){
    System.out.println("i and j : " + i +" "+ j );
  }

}
  //creating a subclass by extending class A
class B extends A {
    int k ;

    void showK(){
      System.out.println("k " + k) ;

    }

    void sum(){
      System.out.println("i+j+k :"+(i+j+k));
    }
  }


public class SimpleInheritance{
  public static void main(String[] args) {
    A superOb = new A();
    B subOb = new B();

    subOb.i = 10 ;
    subOb.j = 20 ;
    System.out.println("Contents of superOb");
    subOb.showij();
    System.out.println();

    System.out.println("Sum of i ,j and k in subOb ");
    subOb.sum();


  }
}
