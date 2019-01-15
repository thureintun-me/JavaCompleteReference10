

public class OverloadCons{
  public static void main(String[] args) {
    Box box1 = new Box(10,12,15);
    Box box2 = new Box();
    Box box3 = new Box(7);

    double vol;

    vol = box1.volume();
    System.out.println("box1.volume :"+vol);

    vol = box2.volume();
    System.out.println("box2.volume :"+vol);

    vol = box3.volume();
    System.out.println("box3.volume : "+ vol);

  }
}
