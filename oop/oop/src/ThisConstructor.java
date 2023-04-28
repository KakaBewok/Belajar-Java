public class ThisConstructor {
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
                    //this merujuk ke construc diatasnya(sesuaikan jumlah paramsnya)
                    this(paramName, null);
                }
                Person(){
                    //this merujuk ke construc diatasnya(sesuaikan jumlah paramsnya)
                    this(null);
                }
                void greetings(String paramName){
                    System.out.println("Hello " + paramName);
                }
            }
            //pembuatan instance/object, construc ke-1
            Person person1 = new Person("Noprizal", "Bogor");
            person1.greetings("Noprizal");

            //pembuatan instance/object, construc ke-2
            var person2 = new Person("Zayn");
            person2.address = "London";
            person2.greetings("Zayn");

            //pembuatan instance/object, construc ke-3
            Person person3;
            person3 = new Person();
            person3.name = "Messi";
            person3.address = "Argentina";
        }

}
//constructor bisa memanggil constructor lain,
//menggunakan keyword this.
// this. == construc diatasnya.

//variable shadowing = variabel yang tertimpa