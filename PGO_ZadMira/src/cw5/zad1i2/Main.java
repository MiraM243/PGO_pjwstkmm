package cw5.zad1i2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(5);

        System.out.println("Liczba miejsc w samochodzie: " + car.getNumberOfSeats());

        car.start();
        car.stop();

    }
}
