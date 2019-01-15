package listing1;

public class OverloadDemo{

  void test(){
    System.out.println("No parameter");
  }

  void test(int a){
    System.out.println("a : "+a);
  }

  void test(int a, int b){
    System.out.println("a:"+ a +" b:"+b);
  }

  double test(double a){
    return a*a;
  }

}
