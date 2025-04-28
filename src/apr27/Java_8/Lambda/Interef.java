package apr27.Java_8.Lambda;

public interface Interef {
    public void  m1();
}
class Test{

    int x = 10;

    public void m2(){
        int y = 20; ///local variable

        Interef i = () -> {
            x= 888;
            /*y = 999;*/
            System.out.println(x);
            System.out.println(y);

        };
        i.m1();
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.m2();

        /// from lambda exp we can access enclosing class variable(x) and enclosing method variable(y)

        /// local variable which are referenced from lambda expression must be final or effectively final or declared as final weather we are declaring or not

    }
}
