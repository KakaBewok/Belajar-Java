package programmer.zaman.now.data;

//kalo record class, constructornya langsung di sebelah kanan
//nama record classnya

//contruct paling atas akan berubah menjadi field
//record class gak bisa extend ke class lain,
//cuma bisa implements ke interface
public record LoginRequest(String username, String password) {

    //membuat constructor tambahan/utama
    //tanpa block params "()"
    //ketika construct diatas dipanggil, construc tambahanpun
    //dieksekusi
    public LoginRequest{
        System.out.println("Mmebuat Obj LoginRequest");
    }

    //construc tambahan kedua (construct overloading)
    //wajib memanggil contruct paling atasnya
    public LoginRequest(String username){
        this(username, "");
    }

}
//record class immutable (tidak bisa diubah)
//defaultnya final
