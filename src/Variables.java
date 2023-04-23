public class Variables {
    public static void main(String[] args) {
        String firstName;
        firstName = "Noprizal";
        firstName = "Rizal"; //re-initialization

        String lastName = "KakaBewok";

        var fullName = firstName + " " + lastName; //pake var harus langsung di isi value.

        final short age = 27; //prefix "final" untuk membuat variable menjadi constant(tidak bisa diubah).

        System.out.println(fullName + " berusia " + age);
    }
}
