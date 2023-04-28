public class SuperConstructor {
    public static void main(String[] args) {
        //parent
       class Manager{
           String name;
           int age;
           Manager(String paramName, int paramAge){
               this.name = paramName;
               this.age = paramAge;
           }
           Manager(String paramName){
               this.name = paramName;
           }
       }

       //child
        class superVisor extends Manager{
           String company;
           //construc ini wajib dibuat karena,
            // construc parent class mengandung params
           superVisor(String paramName, String paramCompany){
               super(paramName);
               this.company = paramCompany;
           }
        }
    }
}
//untuk mengakses parent class constructor,
//harus mengakses melalui child class constructor.

//kalo constructor parent tidak ada params(default constructor)
//maka child class tidak wajib membuat constructor juga.
