//listing 3


public class DemoBoxWeight{
  public static void main(String[] args) {
      BoxWeight box1 = new BoxWeight(10,20,15,32.4);
      BoxWeight box2 = new BoxWeight(2,3,4,0.076);
      double vol ;

      vol = box1.volume();
      System.out.println("Volume of Box 1 is " + vol);
      System.out.println("Weight of Box 1 is " + box1.weight);
      System.out.println("");

      vol = box2.volume();
      System.out.println("Volume of Box2 is "+ vol);
      System.out.println("Wight of Box2 is "+ box2.weight);

  }

}

class Box{
  double width;
  double height;
  double depth ;

  //construct clone of an object
  Box(Box ob){
    width  = ob.width ;
    height = ob.height;
    depth  = ob.depth ;
  }

  Box(double w,double h,double d){
    width  = w ;
    height = h ;
    depth  = d ;
  }

  Box(){
    width = -1 ; // used -1 to indicate
    height= -1 ; //an uninitialized
    depth = -1 ; //box

  }

  Box(double len){
    width = height = depth = len ;
  }

  double volume(){
    return width * height * depth ;

  }
}

  class BoxWeight extends Box{
    double weight ;

    BoxWeight(double w , double h , double d , double m){
      width = w ;
      height= h ;
      depth = d ;
      weight= m ;

    }
  }
