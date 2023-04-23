public class MethodOverLoading {
    public static void main(String[] args) {
        Greetings();
        Greetings("Zayn");
        Greetings("Harry", "Styles");
    }
    static void Greetings(){
        System.out.println("Hello!");
    }
    static void Greetings(String name){
        System.out.println("Hello! " + name);
    }
    static void Greetings(String firstName, String lastName){
        System.out.println("Hello! " + firstName + " " + lastName);
    }
}
//method overloading = kemampuan membuat method dengan nama yang sama > 1x
//dengan syarat paramnya harus berbeda-beda (yang sama hanya nama methodnya saja)

