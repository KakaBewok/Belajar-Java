package programmer.zaman.now.application;
import programmer.zaman.now.data.City;

public class LocationApp {
    public static void main(String[] args) {
        //error, tidak bisa diinstance karena class bertipe abstract
//        var location = new Location();

        City city = new City();
        city.name = "Jakarta";

        System.out.println(city.name);
    }
}
