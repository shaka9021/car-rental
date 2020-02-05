package co.edu.uniremington.uvirtual.carrental.domain;

public class Truck extends Van {

    public Truck(String plate, double base, double pma) {
        super(plate, base, pma);
    }

    public Truck(String plate, double pma) {
        super(plate, pma);
    }

    @Override
    public double rental(long days) {
        return super.rental(days) + 40;
    }

}
