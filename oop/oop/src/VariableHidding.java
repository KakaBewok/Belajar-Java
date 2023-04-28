public class VariableHidding {
    public static void main(String[] args) {
        class Parent {
            String name;
            void doIt(){
                System.out.println("Do it with parent.");
            }
        };

        class Child extends Parent {
            String name;

            void doIt(){
                System.out.println("Do it with child.");
            }

            void doItParent(){
                super.doIt(); //super == Obj Parent.
            }
        };

        //instance child
        Child child = new Child();
        child.name = "Rizal";
        //prints
        child.doIt();
        System.out.println(child.name);

        //convert to parent
        //tetep menjadi obj child walaupun tipenya Parent
        Parent parent = new Child();
        parent.doIt();

        //outputnya adalah name dari parent, bukan dari child
        System.out.println(parent.name);
    }
}
//untuk filed tidak bisa dioverride yang ada hidden (tertutupi).
//field/property di java itu independent(tidak bisa ditimpa).