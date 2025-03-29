package mar25.Annonymous3;

public class GreetingMain {
    public static void main(String[] args) {

        /*
        Greeting greeting = new Hello();
        greeting.greet();


        Hello hello = new Hello();
        hello.greet();
        */

        Greeting greeting = new Greeting() {
            @Override
            public void greet() {
                System.out.println("Hello greeting");

            }
        };
        greeting.greet();
        System.out.println();


        Hindi hindi = new Hindi() {
            @Override
            public void hindi() {
                System.out.println("NAMASTEY");
            }
        };
        hindi.hindi();
        System.out.println();

        SpanishGreeting spanishGreeting = new SpanishGreeting() {
            @Override
            public void spanish() {
                System.out.println("Hola");
            }
        };
        spanishGreeting.spanish();
        System.out.println();

        FrenchGreeting frenchGreeting = new FrenchGreeting() {
            @Override
            public void french() {
                System.out.println("Bonjour");
            }
        };
        frenchGreeting.french();

    }
}
