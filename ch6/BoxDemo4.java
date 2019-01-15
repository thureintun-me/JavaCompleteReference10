public class BoxDemo4{
  public static void main(String[] args) {
    Box box1 = new Box();
    Box box2 = new Box();
    double vol ;

    box1.weidth = 10 ;
    box1.height = 15 ;
    box1.depth  = 20 ;

    box2.weidth = 3;
    box2.height = 6 ;
    box2.depth  = 9 ;

    vol = box1.volume2();
    System.out.println("box1.volume " + vol);

    vol = box2.volume2();
    System.out.println("box2.volume " + vol);
  }
}
