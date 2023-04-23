public class SwitchStatement {
    public static void main(String[] args) {
        var nilai = 90;

            //switch biasa
          switch(nilai){
              case 90:
                  System.out.println("A");
                  break;
              case 70:
                  System.out.println("B");
                  break;
              case 50:
                  System.out.println("C");
                  break;
              default:
                  System.out.println("D");
          }

          //switch lambda (tanpa break)
        switch(nilai){
              case 90 -> System.out.println("Anda luar biasa");
              case 80, 70 -> System.out.println("Anda lulus");
            default -> System.out.println("Maaf, anda tidak lulus");
        }

        //switch lambda (tanpa break) tanpa yield
        String predikat;
        switch(nilai){
            case 90 -> predikat = "Anda luar biasa";
            case 80, 70 -> predikat = "Anda lulus";
            default -> predikat = "Maaf, anda tidak lulus";
        }
        System.out.println(predikat);

        //switch lambda (tanpa break) dengan yield
        String predicate;
        predicate = switch(nilai){
            case 90 : yield "Awesome";
            case 80, 70 : yield "Pass";
            default : yield "Sorry, you failed";
        };
        System.out.println(predicate);
    }
}
//switch statement hanya untuk sama dengan (==).
//switch lambda dan yield hanya running dijava >= 14
