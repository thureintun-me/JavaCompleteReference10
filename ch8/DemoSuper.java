public class DemoSuper{
  public static void main(String[] args) {
    BoxWeight box1 = new BoxWeight(10,12,13,52.4);
    BoxWeight box2 = new BoxWeight(2,3,4,0.076);
    BoxWeight box3 = new BoxWeight(); // default
    BoxWeight cube = new BoxWeight(3,2);
    BoxWeight cloneBox= new BoxWeight(box1);
    double vol;


    vol = box1.volume();
    System.out.println("Volume of box 1 is " + vol);
    System.out.println("Weight of box 1 " + box1.weight);
    System.out.println();

    vol = box2.volume();
    System.out.println("Volume of box 2 is " + vol);
    System.out.println("Weight of box 2 " + box3.weight);
    System.out.println();

    vol = box3.volume();
    System.out.println("Volume of box 3 is " + vol);
    System.out.println("Weight of box 3 " + box3.weight);
    System.out.println();

    vol = cube.volume();
    System.out.println("Volume of cube is " + vol);
    System.out.println("Weight of cube " + cube.weight);
    System.out.println();

    vol = cloneBox.volume();
    System.out.println("Volume of cloneBox is " + vol);
    System.out.println("Weight of cloneBox " + cloneBox.weight);
    System.out.println();
  }
}
