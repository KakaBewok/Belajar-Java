package programmer.zaman.now.data;

import java.util.Objects;

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

    //gunanya memanggil/meng-override method toString adalah
    //agar kita bisa memprint isi yang ada didalam method
    //toString() tanpa menggunakan sout(System.out.println()).
    public String toString(){
        return "Product name " + name + ", price: " + price;
    }

    //mengoverride method equals dengan cara manual.
//    public boolean equals(Object o){
//        if(o == this) return true;
//        if(!(o instanceof Product)) return false;
//        Product  product = (Product) o;
//        if(this.price != product.price ) return false;
//        if(this.name != null){
//            return this.name.equals(product.name);
//        } else {
//            return product.name == null;
//        }
//    }
    @Override //dengan generator code
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (price != product.price) return false;
        return Objects.equals(name, product.name);
    }
    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + price;
        return result;
    }
    //idealnya selalu mengoverride method equals() dan hashCode() ketika
    //membuat class.
    //cara meng-override method equals melalui IDE
    //code -> generate -> equals() & hashcode() -> ...
}
//public class hanya bisa dibuat 1 di satu file.
//nama public class harus sama dengan nama filenya.

