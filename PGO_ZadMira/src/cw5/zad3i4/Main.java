package cw5.zad3i4;

public class Main {
    public static void main(String[] args) {
        Animal cat= new Cat();
        Animal dog= new Dog();
        Animal lion= new Lion();
        Animal wolf= new Wolf();

        cat.sleep();
        cat.makeNoise();
        cat.roam();
        System.out.println();
        dog.sleep();
        dog.makeNoise();
        dog.roam();
        System.out.println();
        lion.sleep();
        lion.makeNoise();
        lion.roam();
        System.out.println();
        wolf.sleep();
        wolf.makeNoise();
        wolf.roam();
    }
}
