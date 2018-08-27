//listing 9
class A{
  int i;
}

class B extends A{
  int i ; // this i hides the i in A
   B(int a , int b){
     super.i = a; // i in A
     i = b; // i in B
   }

   void show(){
     System.out.println("i in superclass : " + super.i);
     System.out.println("i in subclass : "+ i);
   }

}
public class UseSuper{
  public static void main(String[] args) {
      B subOb = new B(2,3);
      subOb.show();
  }

}
