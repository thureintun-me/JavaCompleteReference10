public class Search{
  public static void main(String[] args) {
    int[] nums = {6,7,5,8,9,3,4};
    int val = 5 ;
    boolean found = false;

    for(int x : nums){
      if(val == x){
        found = true;
        break;
      }
    }

    if(found)
    System.out.println("Value Found....");

  }
}
