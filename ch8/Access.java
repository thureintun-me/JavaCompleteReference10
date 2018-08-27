//listing 2

class A{
  int i ; // public be default
  private int j ;

  void setij(int x, int y){
    i = x ;
    j = y ;

  }
}

class B extends A{
  int total ;

   void sum(){
      total = i + j ; // Error ! j is not accessible here because j is private field in class A

   }
}


public class Access{

  public static void main(String[] args) {

    B subOb = new B();

    subOb.setij(10,20);
    subOb.sum();

    System.out.println("Total is " + subOb.total) ;
  }
}
