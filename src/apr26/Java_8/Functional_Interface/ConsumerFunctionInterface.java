package apr26.Java_8.Functional_Interface;

import java.util.function.Consumer;

public class ConsumerFunctionInterface {
    public static void main(String[] args) {


        Consumer<String>  stringConsumer = s -> System.out.println(s);
        stringConsumer.accept("Hello");
        stringConsumer.accept("i am learning Consumer Functional Interface");
        stringConsumer.accept("under functional interface");
        stringConsumer.accept("import java.util.function.Consumer first");
        stringConsumer.accept("works on Principle: accept function but return void ");
    }
}
