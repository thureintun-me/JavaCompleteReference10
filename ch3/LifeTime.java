// demonstrate life time of a vairable
public class LifeTime{
  public static void main(String[] args) {
      int x ;
      for(x=0; x<3 ; x++){
      int y = -1 ; // y in initialized each time block is entered

        System.out.println("y iz "+y);

        y = 100;
        System.out.println("y is now " +y);

      }
  }
}
