public class BoxDemo{
  public static void main(String[] args) {

    Box box1 = new Box();
    double vol ;
     box1.weidth = 10 ;
     box1.height  = 50 ;
     box1.depth  = 40 ;

     vol = box1.height * box1.depth * box1.height ;

     System.out.println(" Volume is " + vol);

  }

}
