package programmer.zaman.now.error;

public class BlankException extends RuntimeException{
    public BlankException(String message){
        super(message);
    }
}
//runtime exception tidak wajib menggunakan try catch, berbeda
//dengan tipe error yang lain

//runtimeException merupakan child dari class throwable juga
