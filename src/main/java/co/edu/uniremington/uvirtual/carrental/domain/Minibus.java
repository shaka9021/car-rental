package co.edu.uniremington.uvirtual.carrental.domain;

public class Minibus extends Car {

    public Minibus(String plate) {
        super(plate);
    }

    public Minibus(String plate, long base) {
        super(plate, base);
    }

    @Override
    public double rental(long days) {
        return super.rental(days) + 2;
    }
}
