public class AugmentedAssign {
    public static void main(String[] args) {
        int angka = 10;
        int angka2 = 10;

        var result = angka += 20; //angka = angka + 20;
        var result2 = angka2 -= 5; //angka2 = angka2 - 5;

        System.out.println(result);
        System.out.println(result2);
    }
}
