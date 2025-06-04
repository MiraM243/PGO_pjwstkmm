package cw5.zad1i2;

public class Car extends Vehicle {
    private int numberOfSeats;

    public Car(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }
    @Override
    public void start(){
        System.out.println("Car with "+ numberOfSeats + " seats started");
    }

    @Override
    public void stop(){
        System.out.println("Car with "+ numberOfSeats + " seats stopped");
    }
}
