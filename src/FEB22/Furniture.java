package FEB22;

public class Furniture {

    String color;
    double length;
    double width;
    double height;


    // creating a method(method depicts the behavior)

    public void show(){
        System.out.println("show method-----");

    }
    public void set(){
        System.out.println("set method-----");

    }

    // CONSTRUCTOR

    // STARTING POINT OF EXECUTION OF PROGRAM

    // JVM  ==== JAVA VIRTUAL MACHINE

    public static void main(String[] args) {

        // OBJECT

        // HOW TO CREATE A OBJECT

        // OBJECT SYNTAX =====> class_name reference(lowerCase same name) = new constructor;

        // new keyword gives memory to the object
        // constructor = class_name()

        // with the help of object you can call any method within the class

        Furniture furniture = new Furniture();
        furniture.show();//  CALLING THE METHOD


        furniture.set();

        furniture.color = "Red";
        furniture.width = 19.12;

        System.out.println(furniture.color);
        System.out.println(furniture.width);

    }

}
