package co.edu.uniremington.uvirtual.carrental.domain;

public class Car extends Vehicle {

    public Car(String plate) {
        super(plate);
    }

    public Car(String plate, long base) {
        super(plate, base);
    }

    @Override
    public double rental(long days) {
        return super.rental(days) + 1.5d * days;
    }

}
