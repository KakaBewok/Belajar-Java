public class Inheritance {
    public static void main(String[] args) {
        //parent
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
        //instance object parent
        Person person1;
        person1 = new Person("Zayn", 27);
        person1.greetings("Harry");

        //child
        class Student extends Person {
            String major;
            int nim;
            Student(String paramName, int paramAge, String paramMajor, int paramNim) {
                super(paramName, paramAge);
                this.major = paramMajor;
                this.nim = paramNim;
            }
            //override method dari parent class
            void greetings(String name){
                System.out.println("Hello" + " " + name + " my name is " + this.name + " i'am " + this.major + " student with nim " + this.nim );
            }
        }
        //instance object child
        var student1 = new Student("Noprizal", 27, "Economy", 1810002);
        student1.greetings("Budi");
        //memanggil method override, method yang diparent tidak bisa diakses lagi.
        student1.greetings("Anjai");
    }
}
//this. untuk meresolved masalah var shadowing.
//this. me re-presentasikan Object saat ini

//inheritance untuk mewariskan/menurunkan class
//di Java class child hanya bisa mempunyai 1 parent
//namun 1 parent bisa memiliki banyak child class

//ketika method parent dipanggil/overriding dichild class,
//maka method di parentnya tidak bisa diakses lagi.
