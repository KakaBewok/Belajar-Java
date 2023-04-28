package programmer.zaman.now.application;

//kalo classnya bukan public, tidak bisa diimport
//import programmer.zaman.now.data.Product;
//import programmer.zaman.now.data.Data;
import programmer.zaman.now.data.*; //kalo gak mau satu2 pake tanda bintang

public class Application {
    public static void main(String[] args) {
        //instance class product
        Product product = new Product("Mac Book  Pro", 30_000_000);

        //field "name" tidak bisa diakses
        //karena field tersebut bersifat protect
        //tidak bisa diakses diluar package/folder.
        //kalo mau tetep diakses
        //ubah dari protect ke public
//        System.out.println(product.name);

        //instance class Data
        Data data = new Data();
    }
}
//sebenernya String/tipe data lainnya diimport otomatis(secara default)
//contoh: java.lang.String;
//tapi itu terjadi dibalik layar dan sudah dilakukan oleh Javanya.

