public class BooleanOperation {
    public static void main(String[] args) {
        var absen = 70;
        var nilaiAkhir = 80;

        var lulusAbsen = absen >= 75;
        var lulusNilai = nilaiAkhir >= 75;

        var lulus = lulusAbsen && lulusNilai;

        if(!lulus) {
            System.out.println("Tidak lulus");
        } else {
            System.out.println("Lulus");
        }
    }
}
// && = true, jika dua nilai bernilai true, selain itu false.
// || = true, semua true kecuali kedua nilainya false.
// !, jika !false maka hasilnya true !/kebalikan.
