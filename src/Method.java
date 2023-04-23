public class Method {
    //tempat untuk memanggil method-method.
    public static void main(String[] args) {
        sayHelloWorld("Zayn", "Malik");
        sayHelloWorld("Lionel", "Messi");

        var hasil = sum(5,5);
        System.out.println(hasil); //10

        var result = hitung(5, "+", 5);
        System.out.println(result);

        //method sebelum adanya var arguments
        int[] arr = {
                75,90,50,90
        };
        sayCongrats("Rizal", arr);

        //method dengan var arguments (tidak perlu buat arr dulu)
        sayCongratsDua("Rizal", 95,90,50,90);
    }
    static void sayHelloWorld(String first, String last){
        System.out.println("Hello " + first + " " + last);
    }
    static int sum(int a, int b){
        var result = a + b;
        return result;
    } //method yang mereturn value.
    static int hitung(int a, String operator, int b){
        switch(operator){
            case "+" :
                return a + b;
            case "-" :
                return a - b;
            case "*" :
                return a * b;
            default:
                return 0;
        }
    };

    //method sebelum adanya var arguments
    static void sayCongrats(String name, int[] values){
        var total = 0;
        for (var value: values) {
            total += value;
        }
        //dirata-ratakan
        var result = total / values.length;

        if(result >= 75){
            System.out.println("Selamat " + name + " Lulus");
        } else {
            System.out.println("Maaf " + name + " Anda belum Lulus :(");
        }
    }

    //method dengan var arguments
    static void sayCongratsDua(String name, int... values){
        var jumlah = 0;
        for (var value: values) {
            jumlah += value;
        }
        //dirata-ratakan
        var result = jumlah / values.length;

        if(result >= 75){
            System.out.println("Selamat " + name + " Lulus");
        } else {
            System.out.println("Maaf " + name + " Anda belum Lulus :(");
        }
    }

}

//static cuma boleh manggil static juga.
//Secara default method tidak menghasilkan value apapun

// void = tidak menghasilkan nilai apapun.
//void harus diganti dengan tipe data yang akan direturn.

//di Java hanya bisa menghasilkan 1 data di sebuah method.

//param dengan tipe variabel argument harus ditempatkan di posisi akhir