package programmer.zaman.now.application;

public class EqualsApp {
    public static void main(String[] args) {
        String first = "Eko";
        first = first + " " + "Khannedy";
        String second = "Eko Khannedy";
        String third = "Eko Khannedy";

        System.out.println(first);
        System.out.println(second);

        //hasil dari pengecekan dibawah ini pasti false
        //karena keduanya berasal dari Obj yang berbeda
        //jadi bukan membandingkan isi dari Stringnya.
        System.out.println(first == second);
        //kalo yang dibawah ini pasti true, karena ...
        //tipe string yang ada didalam objnya sama (pengoptimize-an memory)
        System.out.println(third == second);
        //cara BENARnya untuk membandingkan Obj
        //adalah menggunakan method .equals()
        System.out.println(first.equals(second));
    }
}
