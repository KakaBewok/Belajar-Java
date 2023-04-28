public class PolymorphismApp {
    public static void main(String[] args) {
        //instance ke class yang ada di file polymorphism
        Employee employee = new Employee("Rizal");

        //tipe datanya Employee, tapi bisa berubah bentuk menjadi
        //object new Manager
        Employee manager = new Manager("Rizal");

        //tipe datanya Manager, tapi bisa berubah bentuk menjadi
        //object new VicePresident
        Manager vicePresident = new VicePresident("Rizal");

        //instance dari obj diatas
        employee.Hello("Ima");
        manager.Hello("Ima");
        vicePresident.Hello("Ima");

        //mencoba polymorphism dengan method
        greetings(new Employee("Rizal"));
        //di paramsnya harus bertipe employee, tapi dengan
        //polymorphism bisa juga dengan tipe manager dan VP.
        greetings(new Manager("Rizal"));
        greetings(new VicePresident("Rizal"));
    }

    static void greetings(Employee employee){
        //pengecekan instance
        if(employee instanceof VicePresident){
            VicePresident vicePresident = (VicePresident) employee;
            System.out.println("Hello VP " + employee.name);
        } else if (employee instanceof Manager){
            Manager manager = (Manager) employee;
            System.out.println("Hello Manager " + employee.name);
        } else {
            System.out.println("Hello Employee " + employee.name);
        }
    }
}
