public class Constructor {
    public static void main(String[] args) {
        //membuat class dengan constructor
        class Person {
            String name;
            String address;
            final String country = "Indonesia";
            //constructor (harus sama dengan nama class)
            Person(String paramName, String paramAddress){
                name = paramName;
                address = paramAddress;
            }
            //constructor overloading (constructor yang berbeda dari constructor lainnya)
            Person(String paramName){
                name = paramName;
            }
            void greetings(String paramName){
                System.out.println("Hello " + paramName);
            }
        }
        //pembuatan instance/object
        Person person1 = new Person("Noprizal", "Bogor");
        person1.greetings("Noprizal");

        var person2 = new Person("Zayn");
        person2.address = "London";
        person2.greetings("Zayn");
    }
}
