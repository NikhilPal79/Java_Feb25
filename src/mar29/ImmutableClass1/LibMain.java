package mar29.ImmutableClass1;

public class LibMain {
    public static void main(String[] args) {

        Library library = new Library(159,"rich dad poor dad", 29032025);
        System.out.println(library);
        System.out.println(library.getId());
    }
}
