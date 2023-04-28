package programmer.zaman.now.data;

public interface Car {
    //ex. method abstract dari interface
    void drive();
    int getTire();
}
//dalam membuat interface, methodnya sudah ter-default
//menjadi "public" dan "abstract"

//dan method yang dibuat pasti tanpa block "{ }"
//juga hanya diperbolehkan membuat const field "final"
//(tidak bisa diubah)

//untuk menurukan interface, gunakan keyword "implements"
//bukan lagi extends
