package mar29.Generics3;

public class RogersMain {
    public static void main(String[] args) {

        Rogers<Integer, String, Integer> rogers1 = new Rogers<>(5072, "nikhil", 80);
        Rogers<Integer, String, Integer> rogers2 = new Rogers<>(2122, "karan", 91);
        Rogers<Integer, String, Integer> rogers3 = new Rogers<>(7544, "harpinder", 70);

        System.out.println(rogers1);
        System.out.println();
        System.out.println(rogers2);
        System.out.println();
        System.out.println(rogers3);


    }
}
