public class ObjectClass {
    public static void main(String[] args) {
        var name = "Rizal";
        System.out.println(name);
        //sebenernya tiap print itu memanggil method toString().
        System.out.println(name.toString());
    }
}
//class apapun sebenernya merupakan child dari class parent Object.
//class Object = super class u/ semua class di java