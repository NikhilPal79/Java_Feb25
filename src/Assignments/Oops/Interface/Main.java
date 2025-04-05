package Assignments.Oops.Interface;

public class Main {
    public static void main(String[] args) {

        Lion lion = new Lion();
        lion.feed();
        lion.makeSound();
        System.out.println();

        Penguin penguin = new Penguin();
        penguin.feed();
        penguin.makeSound();
        penguin.swim();
        System.out.println();

        Monkey monkey = new Monkey();
        monkey.feed();
        monkey.makeSound();
        monkey.climb();
        monkey.swim();
        System.out.println();

        Pigeon pigeon = new Pigeon();
        pigeon.feed();
        pigeon.makeSound();
        pigeon.fly();
        System.out.println();

        Rat rat = new Rat();
        rat.feed();
        rat.makeSound();
        rat.swim();
        rat.dig();

    }
}
