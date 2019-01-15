package listing1;

public class Overload{

    public static void main(String[] args) {

        OverloadDemo ob = new OverloadDemo();
        double result;

        ob.test();
        ob.test(7);
        ob.test(7,4);
        result = ob.test(123.25);
        System.out.println("Result :"+result);
    }
}
