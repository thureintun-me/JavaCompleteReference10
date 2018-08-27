//listing 7
class Box{
    private double width;
    private double height;
    private double depth ;

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
