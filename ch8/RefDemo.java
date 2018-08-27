//listing 5

public class RefDemo{
  public static void main(String[] args) {
    BoxWeight weightBox = new BoxWeight(3,5,7,8.13);
    Box plainBox = new Box();
    double vol ;

    vol = weightBox.volume();
    System.out.println("Volume of weightBox is " + vol);
    System.out.println("Weight of Weight Box is " + weightBox.weight);
    System.out.println();

    // assign box weight reference to Box reference
    plainBox = weightBox ;

    vol = plainBox.volume();
    System.out.println("Volume of plain Box is "+ vol);



  }
}
