package mar25.InnerClass;

public class OuterClass {


    int x = 10;


    // creating a method

    public void set(){
        System.out.println("outer class set method ");
    }

    // creating an inner class
    class InnerClassDemo{

        // creating method
        public void show(){
            System.out.println("Inner class show method ");
        }
    }


    // creating an inner class

    class GameClass{

        // creating method

        public void Football(){
            System.out.println("play as center attacking mid ");
        }
    }

    class ProgramingClass {

        public void Java (){
            System.out.println("learning java ");
        }
    }
}
