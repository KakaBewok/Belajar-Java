public class NonPrimitiveDataType {
    public static void main(String[] args) {
        Integer age = 10;
        Long iniLong = 10L;
        Byte memory;
        memory = 125;
        System.out.println(age + " " + memory);

        //konversi(otomatis) dari primitive ke non-primitive
        int angka = 1_000;
        Integer angkaBaru = angka;

        //konversi dari Object ke primitive yang beda tipe data (ex. dari Integer ke short dan long)
        short InishortPrimitive = angkaBaru.shortValue();
        long IniLongPrimitive = angkaBaru.longValue();
    }
}
//ciri tipe data primitive adalah punya default value,
//Ciri tipe data non-primitive adalah huruf awalnya besar dan default valuenya null.
//String adalah data non-primitive (Object).

//method untuk mengubah tipe data dari Object ke primitive dengan cara:
// [nama variabel yang akan diubah].[tipe data primitive tujuan]Value();
