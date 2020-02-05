package co.edu.uniremington.uvirtual.carrental.application;

import co.edu.uniremington.uvirtual.carrental.domain.Car;
import co.edu.uniremington.uvirtual.carrental.domain.Minibus;
import co.edu.uniremington.uvirtual.carrental.domain.Truck;
import co.edu.uniremington.uvirtual.carrental.domain.Van;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("SAK87B");
        Minibus minibus = new Minibus("LKJ45N");
        Van van = new Van("LKJ23L", 3.0d);
        Truck truck = new Truck("ILK65P", 3.0d);

        System.out.println(car.rental(10) + " " + car.getPlate());
        System.out.println(minibus.rental(10) + " " + minibus.getPlate());
        System.out.println(van.rental(10) + " " + van.getPlate() + " " + van.getPma());
        System.out.println(truck.rental(10) + " " + truck.getPlate() + " " + truck.getPma());

    }

}
