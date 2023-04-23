public class Looping {
    public static void main(String[] args) {
        //for
        for(var i = 1; i <= 10; ++i){
            System.out.println("Ini ke-" + i);
        }

        //while loop
        var counter = 1;
        while(counter <= 10){
            System.out.println("Pengulangan ke-" + counter);
            counter++;
        }

        //do while loop (pengecekannya diakhir)
        var counter2 = 1;
        do {
            System.out.println("Ulang ke " + counter2);
            counter2++;
        } while(counter2 <=10);

        //break
        var counter3 = 1;
        while(true){
            System.out.println("ke-" + counter3);
            counter3++;

            if(counter3 >=10){
                break;
            }
        }
        System.out.println("Perulangan berhenti");

        //continue
        for(var loop = 1; loop <= 10; loop++){
            if(loop % 2 == 0){
                continue;
            }
            System.out.println("Ini ganjil " + loop);
        } //outputnya hanya keluar angka ganjil.

        //forEach
        String[] names = {
                "Adul", "Jojon", "Ghina", "Ima", "Kiki"
        };
        for (String name: names) {
            System.out.println(name);
        }
    }
}
//FOR
//jika inisialisasi, kondisi dan post dikosongkan
// maka akan looping hell
//WHILE LOOP
//while loop hanya ada perulangan, tanpa init dan post statement
//FOR EACH
//untuk mengambil data di array secara satu per satu

//break menghentikan seluruhnya
//continue menghentikan sementara