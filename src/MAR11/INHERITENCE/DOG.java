package MAR11.INHERITENCE;

public class DOG extends ANIMAL{

    int lifespan = 10;



    ///  creating a constructor
    public DOG() {
        super();
        //this();  // dog class default constructor  , this should be the firsts statement in constructor body
        // super() has to be the first statement in constructor body
        // both can not be used at a single time, to sue both at same time see below
        // this.fuelCap = super.fuelCap;
    }


    @Override
    public void animallife() {
        super.show();
        System.out.println("animal are loyal " + super.lifespan );
    }
}
