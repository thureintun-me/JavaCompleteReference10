public class BoxDemo7{
  public static void main(String[] args) {
    Box box1 = new Box(10,12,15);
    Box box2 = new Box(3,6,9);
    double vol;

    vol = box1.volume2();
    System.out.println("Box1.Volume :" + vol);

    vol = box2.volume2();
    System.out.println("Box2.Volume :" + vol);

  }
}
