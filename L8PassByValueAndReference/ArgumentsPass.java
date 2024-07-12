package OPPS.L8PassByValueAndReference;

public class ArgumentsPass {
    public static void main(String[] args) {
        int x = 10, y = 20;
        // System.out.println("Before swapping: x = " + x + ", y = " + y);

        System.out.println("Before incrementing, x = " +x + ",y = " + y);
        System.out.println("After incrementing, x = " +x + ",y = " + y);
        
    }
    public static void increment(int a, int b){

        a = a + 5;
        b = b + 5;
    }
}
