package FEB22;

public class MethodDemo {

    // METHOD OVERLOADING ======> METHOD WITH SAME NAME AND DIFFERENT PARAMETERS

    public int addition(int a, int b) {
        return a + b;
    }

    public int addition(int a, int b, int c) {
        return a + b + c;
    }

    public int multi(int a, int b){
        return a * b;
    }

    public int multi(int a, int b, int c, int d ){
        return a * b * c * d;
    }


    public static void main(String[] args) {
        MethodDemo methodDemo = new MethodDemo();
        System.out.println(methodDemo.addition(10, 20));

        System.out.println(methodDemo.addition(20, 20, 25));

        System.out.println(methodDemo.multi(15, 56));

        System.out.println(methodDemo.multi(14, 45, 2,8));
    }
}
