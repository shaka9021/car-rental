package co.edu.uniremington.uvirtual.carrental.domain;

public abstract class Vehicle {

    protected String plate;
    protected double base = 50.0d;

    public Vehicle(String plate, double base) {
        super();
        this.plate = plate;
        this.base = base;
    }

    public Vehicle(String plate) {
        super();
        this.plate = plate;
    }

    public double rental(long days) {
        return days * this.base;
    }

    public String getPlate() {
        return plate;
    }

}
