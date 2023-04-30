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

    //method ini dari parent interface si car yaitu
    //interface HasBrand
    public String getBrand(){
        return "Toyota";
    }
    public boolean isMaintenance(){
        return true;
    }

    //ini default method dari interface car
    //boleh ditulis atau tidak
    public boolean isBig(){
        return true;
    }
}
