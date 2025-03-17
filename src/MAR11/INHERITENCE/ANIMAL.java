package MAR11.INHERITENCE;

public class ANIMAL {

    /// CREATING A METHOD

    int lifespan = 30;

    ///  creating a constructor

    public ANIMAL() {
        System.out.println("super class constructor");
    }

    public void animallife(){
        System.out.println("animal are loyal " + lifespan);
    }

    public void show(){
        System.out.println("i am dog lover");
    }
}
