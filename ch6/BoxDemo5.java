public class BoxDemo5{
  public static void main(String[] args) {
    Box box1 = new Box();
    Box box2 = new Box();
    double vol;

  


    box1.setDim(10,15,20);
    box2.setDim(3,6,9);

    vol = box1.volume2();
    System.out.println("Box1.Volume " + vol);

    vol = box2.volume2();
    System.out.println("Box2.Volume " + vol);


  }
}
