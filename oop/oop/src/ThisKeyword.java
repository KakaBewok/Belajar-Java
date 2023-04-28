public class ThisKeyword {
    public static void main(String[] args) {
        class Person{
            String name;
            int age;
            final String country = "Indonesia";

            //constructor
            Person(String paramName, int paramAge){
                //this me re-presentasikan Object saat ini
                this.name = paramName;
                this.age = paramAge;
            }

            void greetings(String name){
                System.out.println("Hello" + " " + name + " my name is " + this.name);
            }
        }
        //instance object
        Person person1;
        person1 = new Person("Zayn", 27);
        person1.greetings("Harry");
    }
}
//this. untuk meresolved masalah var shadowing.

//this. me re-presentasikan Object saat ini
