package programmer.zaman.now.data;

//public == bisa diakses dimanapun
public class Product {
    //protected = hanya bisa diakses di packet yang sama
    //class yang sama dan turunannya (tidak bisa diluar paket).
    protected String name;
    protected int price;

    //constructornya harus pake "public"
    //agar bisa diakses diluar file/package

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    };
}
//public class hanya bisa dibuat 1 di satu file.
//nama public class harus sama dengan nama filenya.