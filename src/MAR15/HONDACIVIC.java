package MAR15;

public class HONDACIVIC extends CAR{
    ///  NOTE ===> any non abstract class inherits from abstract class , must implement all abstract methods...
    ///  NOTE ===> CAN NOT CREATE THE OBJECT OF CAR CLASS

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public void run() {
        System.out.println("fuel efficient ");

    }

    @Override
    public void brake() {

        System.out.println("most stolen car in gta");
    }

    @Override
    public void windows() {

        System.out.println("reliable ");
    }
}
