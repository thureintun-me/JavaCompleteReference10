//listing 18

abstract  class Figure{
  double dim1;
  double dim2;

  Figure(double a,double b){
    dim1 = a ;
    dim2 = b ;
  }

  abstract double area();
}
class Rectangle extends Figure {

    Rectangle(double a, double b){
    super(a,b);
    }

    double area(){
      System.out.println("Area of Rectangle");
      return dim1  * dim2 ;
    }
}

class Triangle extends Figure {
    Triangle(double a,double b){
    super(a,b);
  }

  double area(){
    System.out.println("Area of Triangle");
    return dim1 * dim2 / 2 ;
  }
}
public  class AbstractArea{
  public static void main(String[] args) {

      // abstract class cannot create object

      Rectangle r = new Rectangle(9,8);
      Triangle  t = new Triangle(10,50);

      Figure f ;

      f = r ;
        System.out.println("Area is " +f.area());

      f = t ;
      System.out.println("Area is " + f.area());

    }
}
