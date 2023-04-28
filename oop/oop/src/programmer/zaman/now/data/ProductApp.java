package programmer.zaman.now.data;

public class ProductApp {
    public static void main(String[] args) {
        Product product = new Product("Mac Book Pro", 30_000_000);

        //field protect (name) dari Product Class
        //masih bisa diakses di class ini, karena masih satu package
        System.out.println(product.name);
        //jika fieldnya private dari product class
        //tidak bisa diakses karena diluar class product itu sendiri
        //private hanya bisa diakses di class yang sama.
        System.out.println(product.price);
    }
}
