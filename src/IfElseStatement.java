public class IfElseStatement {
    public static void main(String[] args) {
        var nilai = 75;
        var absen = 75;

        if(nilai >= 90 && absen >= 90){
            System.out.println("Anda Lulus dengan predikat terbaik!");
        } else if (nilai >= 75 && absen >= 75){
            System.out.println("Anda Lulus");
        }
        else {
            System.out.println("Anda tidak Lulus");
        }
    }
}
