package programmer.zaman.now.application;

import programmer.zaman.now.data.Customer;
import programmer.zaman.now.data.Level;

import java.sql.SQLOutput;

public class EnumApp {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setName("Rizal");
        //ini penggunaan enumnya
        //sebutkan enumnya, lalu titik, baru setelahnya
        //tentukan pilihan.
        customer.setLevel(Level.STANDARD);

        System.out.println(customer.getName());
        System.out.println(customer.getLevel());
        System.out.println(customer.getLevel().getDescription());

        //konversi dari enum ke string
        //Level dibawah di dapat dari import
        String levelName = Level.VIP.name();
        System.out.println(levelName);

        //konversi dari String ke enum
        Level level = Level.valueOf("PREMIUM");
        System.out.println(level);

        //cek jumlah enum, method .values() adalah untuk memeriksa semua value enum
        for (var value: level.values()
             ) {
            System.out.println(value);
        }
    }
}
