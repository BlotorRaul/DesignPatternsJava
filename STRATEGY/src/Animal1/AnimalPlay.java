package Animal1;

import Animal1.Animal;

public class AnimalPlay {
    public static void main(String[] args) {
        Animal sparky = new Dog();
        Animal tweety = new Bird();

        System.out.println("Dog: " + sparky.tryToFly());
        System.out.println("Bird: " + tweety.tryToFly());

        //putem DINAMIC sa spunem ca sparky(cainele) zboara

        sparky.setFlyingType(new ItFlys());
        System.out.println("Dog: " + sparky.tryToFly());

    }
}
