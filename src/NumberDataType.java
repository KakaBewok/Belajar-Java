public class NumberDataType {
    public static void main(String[] args) {
        byte iniByte = 100; //max 127, 1 bytes
        short iniShort = 1_000; //max 32_767, 2 bytes
        int iniInt = 1_000_000; //max 2_147_483_647, 4 bytes
        long iniLong = 1_000_000_000; //> int, 8 bytes
        long iniLong2 = 1_000_000_000L; //> int, 8 bytes

        float iniFloat = 10.10f; //f/F, 32-bit
        double iniDouble = 10.10; //64-bit

        int decimalInt = 35;
        int hexaDecimal = 0xFFFFFF; //prefix 0x
        int binaryDecimal = 0b10101010; //prefix 0b

        //konversi tipe data number:
        //cara otomatis(karena kapasitas penampungnya pasti cukup) berikut caranya:
        //byte > short > int > long > float > double. Jika dibalik maka harus manual.

        //contoh otomatis:
        byte iniByteKonversi = 100;
        short iniShortKonversi = iniByteKonversi;
        int iniIntKonversi = iniShortKonversi;
        long iniLongKonversi = iniIntKonversi;
        //contoh manual:
        int iniIntKonversi2= 4;
        byte iniByteKonversi2 = (byte) iniIntKonversi2;
        //jika angka melebihi kapasitas bisa number overflow
    }
}
