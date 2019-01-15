package listing2;

public class OverloadDemo{

    void test(){
      System.out.println("No Parameter");
    }

    void test(int a){
      System.out.println("int a " + a);
    }

    void test(int a, int b){
      System.out.println("a and b " + a +" " + b);
    }

    void test(double a){
      System.out.println("double a : " +a);
    }
}
