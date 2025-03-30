package mar29.Generics3;

public class OntarioMain {
    public static void main(String[] args) {

        Ontario< String, Double, Integer> o1 = new Ontario<>("cambridge",15000.00, 5);
        System.out.println(o1);
    }
}
