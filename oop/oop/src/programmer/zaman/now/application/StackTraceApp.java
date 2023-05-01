package programmer.zaman.now.application;

public class StackTraceApp {
    public static void main(String[] args) {
//        try{
//            String[] names = {
//                    "Zayn", "Malik"
//            };
//
//            System.out.println(names[10]);
//            //tangkap error dengan Throwable lalu dimasukan
//            //ke variable throwable
//        }catch (Throwable throwable){
//            //memprint error dengan method printStack di class throwable
//            throwable.printStackTrace();
//        }

        //implementasi error bertingkat
        try{
           sampleError();
        }catch (RuntimeException exception){
            exception.printStackTrace();
        }

    }
    //contoh error multiple stackTrace
    public static void sampleError(){
        try{
            String[] names = {
                    "Zayn", "Malik"
            };

            System.out.println(names[10]);
        }catch (Throwable throwable){

            throw new RuntimeException(throwable);
        }

    }
}
//method StackTrace dari Class Throwable merupakan method
//yang berguna untuk melacak lokasi error dan memprint ke console
//atau terminal
