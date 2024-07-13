package OPPS.L9Static;
class Demo{
    int a;
    static int b;

}
public class Statics {
    public static void main(String[] args) {
        Demo d1 = new Demo();
        Demo d2 = new Demo();
        Demo d3 = new Demo();

        d1.a = 10;
        d2.a = 20;
        d3.a = 30;

        System.out.println(d1.a + " " + d2.a + " " + d3.a);

        d1.b = 40;
        d2.b = 50;
        d3.b = 60;
        System.out.println(d1.b + " " + d2.b + " " + d3.b); //b is same of all value to ans is last print

        Demo.b = 40;
        Demo.b = 50;
        Demo.b = 60;

        System.out.println(Demo.b);



    }
}
