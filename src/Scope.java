public class Scope {
    public static void main(String[] args) {
        Hello("Zayn");
    }
    static void Hello(String name){
        String greetings = "Hello " + name;

        System.out.println(greetings);
    }

//    System.out.println(greetings); //beda block, var tidak bisa diakses
}
//jika var ada di dalam block, maka cuma bisa diakses diblock tersebut
//isBlank() untuk memeriksa var kosong atau tidak.
