
        //parent 1
        class Employee {
            String name;
            Employee(String name){
                this.name = name;
            }

            void Hello(String name){
                System.out.println("Hello Employee " + name + " my name is " + this.name);
            }
        }
        //parent 2
        class Manager extends Employee {
            Manager(String name){
                super(name);
            }

            void Hello(String name){
                System.out.println("Hello Manager " + name + " my name is " + this.name);
            }
        }
        //child
        class VicePresident extends Manager {
            VicePresident(String name){
                super(name);
            }
            void Hello(String name){
                System.out.println("Hello VP " + name + " my name is " + this.name);
            }
        }

//polymorphism = banyak bentuk.
//polymorphism erat kaitannya dengan inheritance
