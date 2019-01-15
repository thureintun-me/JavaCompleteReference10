public class OverloadCons2{
  public static void main(String[] args) {
    Box box1 = new Box(10,5,8);
    Box box2 = new Box();
    Box box3 = new Box(7);

    Box box4 = new Box(box1);

    double vol;

    vol = box1.volume();
    System.out.println("box1.vol :"+vol);

    vol = box2.volume();
    System.out.println("box2.volume :"+vol);

    vol = box3.volume();
    System.out.println("box3.volume :"+vol);

    vol = box4.volume();
    System.out.println("box4.volume :"+vol);

  }
}
