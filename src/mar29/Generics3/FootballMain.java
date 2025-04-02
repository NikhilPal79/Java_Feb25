package mar29.Generics3;

public class FootballMain {
    public static void main(String[] args) {

        Football<Integer, String> f1 = new Football(7,"ronaldo");
        Football<Integer, String> f2 = new Football(10,"messi");

        System.out.println(f1);
        System.out.println();
        System.out.println(f2);
    }
}
