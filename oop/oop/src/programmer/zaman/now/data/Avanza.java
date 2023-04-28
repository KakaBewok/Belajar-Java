package programmer.zaman.now.data;

public class Avanza implements Car{
    //class turunan interface,
    //harus meng-override method2 milik interfacenya
    //(karena masih bersifat abstract)
    public void drive(){
        System.out.println("Avanza drive");
    }
    public int getTire(){
        return 4;
    }
}
