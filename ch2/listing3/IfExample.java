public class IfExample{
  public static void main(String[] args) {
    int x , y ;
    x= 10;
    y=20;
    if(x<y)System.out.println("x is less than y");

    x = x * 2 ;
    if(x==y)System.out.println("x is now equal to y");

    //this won't display anything
    if(x==y)System.out.println("you won't see this");

  }
}
