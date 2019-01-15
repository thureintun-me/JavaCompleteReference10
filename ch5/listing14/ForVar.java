public class ForVar{
  public static void main(String[] args) {
    int i = 0;
    int j = 5;
    boolean done = false;

      for (;!done ; ) {
        System.out.println("i is "+i);
        if(i==10)done=true;
        i++;

      }
      System.out.println("==========================================================");
      for(;j>0;){
        System.out.println("j :" + j);
        j--;
      }
  }
}
