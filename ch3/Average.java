public class Average{
  public static void main(String[] args) {
    double[] nums = { 10.1, 11.1, 12.1, 13.1, 14.1} ;
    double result = 0 ;
    int i ;

    for(i = 0 ; i< 5 ; i++)
      result = result + nums[i] ;

    System.out.println("Average is " + (result/5)) ;
  }
}
