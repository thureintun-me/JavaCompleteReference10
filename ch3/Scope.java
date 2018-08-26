//demonstrate block scope
public class Scope{
  public static void main(String[] args) {
    int x ; // known to all code within main

    x = 10 ;
     if (x == 10){// start new scope
       int y = 20 ; // known only in this block

       System.out.pritnln("x and y :" + x + " " +y);
       x = y  * 2 ;

     }

     y = 30 ; // Error! y not known here

     System.out.println("x is " + x) ; // x  is still known here
  }
}
