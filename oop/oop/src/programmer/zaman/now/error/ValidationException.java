package programmer.zaman.now.error;

//semua class exception/error pasti parentnya class Throwable
//bisa pake method exception built-in atau buat sendiri
//dibawah ini merupakan exception custom
public class ValidationException extends Throwable {

    //construc
    public ValidationException(String message){
        //gunakan construc parent class Throwable
        super(message);
    }
}
