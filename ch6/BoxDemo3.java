public class BoxDemo3{
  public static void main(String[] args) {
    Box box1 = new Box();
    Box box2 = new Box();
    

    box1.weidth = 10 ;
    box1.height = 15 ;
    box1.depth  = 20 ;

    box2.weidth = 3;
    box2.height = 6 ;
    box2.depth  = 9 ;

     box1.volume();
     box2.volume();
  }
}
