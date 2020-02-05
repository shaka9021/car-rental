package co.edu.uniremington.uvirtual.carrental.domain;

public class Van extends Vehicle {

    protected double pma;

    public Van(String plate, double base, double pma) {
        super(plate, base);
        this.pma = pma;
    }

    public Van(String plate, double pma) {
        super(plate);
        this.pma = pma;
    }

    @Override
    public double rental(long days) {
        return super.rental(days) + 20 * this.pma;
    }

    public double getPma() {
        return pma;
    }

}
