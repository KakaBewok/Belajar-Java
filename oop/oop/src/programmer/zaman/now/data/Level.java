package programmer.zaman.now.data;

//enum mirip seperti array, yang datanya sudah dibatasi
//misal female, male atau level: high, medium, low.
public enum Level {
    //penulisan pilihannya tidak ada "" nya
    //pilihan enumnya harus memanggil constructnya
    STANDARD("Standard Level"),
    PREMIUM("Premium Level"),
    VIP("VIP Level");

    //field dalam enum
    private String description;
    //construct dalam enum
    Level(String description){
        this.description = description;
    }
    //method dalam enum
    public String getDescription(){
        return description;
    }



}
//Best practicenya capslock
//penggunaannya mirip penggunaan class static

//constructor di enum tidak boleh public
