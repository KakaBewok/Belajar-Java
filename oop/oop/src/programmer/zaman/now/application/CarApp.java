package programmer.zaman.now.application;

import programmer.zaman.now.data.Avanza;
import programmer.zaman.now.data.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Avanza();
        System.out.println(car.getTire());
        car.drive();
    }
}
//kalo bikin contract, idealnya pake interface jgn abstract class