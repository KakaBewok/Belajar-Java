public class RecursiveMethod {
    public static void main(String[] args) {
        //tanpa rekursif
        System.out.println(factorial(5)); //120

        //dengan rekursif
        System.out.println(factorialRekursif(5));

        //method stackoverflow
        //(kalo memory laptopnya habis maka akan stackoverflow)
        loop(100);
    }

    //Ini faktorial tanpa rekursif
  static int factorial(int value){
        var result = 1;
        for(var i = 1; i <= value; i++){
            result *= i;
        }
        return result;
  }

  //faktorial dengan rekursif
    static  int factorialRekursif(int value){
        if(value == 1){
            return 1;
        } else {
            return value * factorialRekursif(value -1);
        }
    }

    //contoh method stackoverflow
    static void loop(int value){
        if(value == 0){
            System.out.println("Selesai");
        } else {
            System.out.println("Loop ke " + value);
            loop(value-1);
        }
    }
}
//method yang memanggil methodnya sendiri (memanggil dirinya sendiri)
//biasanya dipake untuk faktorial

//faktorial itu angka dikali dengan angka2 sebelumnya

//misal faktorial 5, berarti:
//5*5
//5*4
//5*3
//dst.

//hati2 dengan rekursif dapat membuat stackoverflow