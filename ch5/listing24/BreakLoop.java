public class BreakLoop{
  public static void main(String[] args) {
    for(int i = 0; i<3 ; i++){
      System.out.println("Pass " + i + " ");
       for(int j = i ; j <100 ; j++){
         if (j==10)
          break;
          System.out.println(j + " ");
       }
    }
    System.out.println("Loops Complete.....");
  }
}
