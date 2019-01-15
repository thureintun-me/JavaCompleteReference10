public class Box{

  double weidth;
  double height;
  double depth;

  Box(){
    System.out.println("Constructing the box...");
    weidth = 10;
    height = 15;
    depth  = 20;
  }

  Box(double weidth,double height,double depth){
    this.weidth = weidth;
    this.height = height;
    this.depth  = depth;
  }

    void volume(){
      System.out.print("Volume is  ");
      System.out.println( weidth * height * depth);
    }

    double volume2(){
      return weidth * height * depth ;
    }

    // set dimensions of box
    void setDim(double w , double h, double d){
      weidth = w;
      height = h;
      depth  = d;
    }


}
