package programmer.zaman.now.application;

import programmer.zaman.now.data.Application;
//menambahkan statis agar importnya pendek
//dan langsung mengarah ke field, method dan inner class static
import static programmer.zaman.now.data.Constant.*;
import programmer.zaman.now.data.Country;
import programmer.zaman.now.util.MathUtil;

public class StaticApp {
    public static void main(String[] args) {
        //cara mengakses field static
        System.out.println(APPLICATION);
        System.out.println(VERSION);

        //cara akses method static
        System.out.println(MathUtil.sum(1,1,1,1,1));

        //cara akses inner class static
        Country.City city = new Country.City();
        city.setName("Bogor");
        System.out.println(city.getName());

        //cara akses block statis
        System.out.println(Application.PROCESSORS);
    }
}
