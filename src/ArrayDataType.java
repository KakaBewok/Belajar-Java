public class ArrayDataType {
    public static void main(String[] args) {
        //array dengan tipe data String
        String[] fullName;
        //array dengan max-length 2
        fullName = new String[2];
        //Initialization
        fullName[0] = "Zayn";
        fullName[1] = "Malik";
        //menghapus data(Object) di index
        fullName[0] = null;
        System.out.print(fullName[0]); //Zayn

        //cara kedua buat array(nentuin lengthnya otomatis)
        int[] tanggal = {
                19,20,21
        };
        long[] tanggal2 = new long[]{
                21,20,19
        };
        //menghapus data(primitive) di index
        tanggal[0] = 0;
        System.out.println(tanggal.length); //3

    }
}
//array di java, jumlah data didalamnya harus dengan tipe data yang sama
//dan jumlah/lengthnya harus sudah ditentukan.