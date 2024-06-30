package OPPS.L6MethodOverloading;

public class Addition {
    public int add(int a, int b) {
        // int c = a + b;
        // return c;

        // or

        // same as below
        return a + b;
    }

    public int add(int a, int b, int c){
        // int d = a + b + c;
        // return d;

        // or

        // same as below
        return a + b + c;
    }

    public int add(int a, int b, int c, int d){
        // int e = a + b + c + d;
        // return e;

        // or

        // same as below
        return a + b + c + d;
    }

    public double add(double i, double j) {
        // double k = i + j;
        // return k;

        // or

        // same as below
        return i + j;
    }
    public String add(String s1, String s2){
        // String s3 = s1 + s2;
        // return s3;

        // or

        // same as below
        return s1+s2;
    }
}
