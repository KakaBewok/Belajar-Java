package programmer.zaman.now.data;

import programmer.zaman.now.annotation.Fancy;

@Fancy(name = "Car", tags = {"application", "java"})
public interface Car extends HasBrand, IsMaintenance {
    //ex. method abstract dari interface
    void drive();
    int getTire();

    //sejak java v.8, kita bisa membuat default method konkrit
    //di interface
    default boolean isBig(){
        return true;
    }
}
//dalam membuat interface, methodnya sudah ter-default
//menjadi "public" dan "abstract"

//dan method yang dibuat pasti tanpa block "{ }", kecuali dengan
//prefix default dan harus membuat konkrit methodnya.
//juga hanya diperbolehkan membuat const field "final"
//(tidak bisa diubah)

//untuk menurukan interface, gunakan keyword "implements"
//bukan lagi extends
