public class SuperKeyword {
    public static void main(String[] args) {
        //parent
        class Shape{
            //method
            int getCorner(){
                return 0;
            }
        }

        //child
        class Rectangle extends Shape{
            //override method dari parent
            //method di parent tidak bisa diakses lagi.
            int getCorner(){
                return 4;
            }
            //method untuk mengakses "method" yang ada di parent
            //menggunakan "super" == "class parentnya".
            int getParentCorner(){
                return super.getCorner();
            }
        }

        //object parent
        Shape shape1 = new Shape();
        System.out.println("Parent " + shape1.getCorner()); //0

        //object child
        var rectangle1 = new Rectangle();
        System.out.println("Child meng-override " + rectangle1.getCorner());//4
        System.out.println("Child memanggil method parentnya lagi " + rectangle1.getParentCorner());//0
    }
}
//gunakan keyword super untuk mengakses method parent class dari child.