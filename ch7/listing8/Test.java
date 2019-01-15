public class Test{
  int a , int b;

  Test(int i , int j){
    a = i ;
    b = j ;
  }

  void match(Test o){
    o.a *= 2 ;
    o.b /= 2 ;

  }
}
