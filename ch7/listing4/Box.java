

public class Box{
  private double width;
  private double height;
  private double depth;

  public Box(double width,double height,double depth){
    this.width = weight;
    this.height = height;
    this.depth  = depth ;

  }

  Box(){
    width = -1;
    height = -1;
    depth  = -1;
  }

  Box(double len){
    width=height=depth=len;
  }

  double volume(){
    return width * height * depth ;
  }
}
