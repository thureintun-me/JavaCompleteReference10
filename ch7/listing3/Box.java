package listing3;

public class Box{
  double weight;
  double height;
  double depth;

  public Box(double weight,double height,double depth){
    this.weight = weight ;
    this.height = height ;
    this.depth  = depth  ;
  }

  double volume(){
    return weight * height * depth ;
  }
}
