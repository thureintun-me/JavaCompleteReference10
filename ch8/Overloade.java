// listing 14
// method overloading

class A{
  int i,j;

   A(int a, int b){
    i = a ;
    j = b ;
  }

  //display i and j
  void show(){
    System.out.println("i and j :" + i + " " + j);

  }

}
class B extends A{

    int k ;

    B(int a,int b , int c){
      super(a,b);
      k = c;
    }

    void show(String msg){
      System.out.println(msg +" " + k );
    }
  }

  public class Overloade{
    public static void main(String[] args) {
      B subOb = new B(2,3,4);
      subOb.show("This is k"); // this call show()  in B
      subOb.show(); // this call show() in A

    }
  }
