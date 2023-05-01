package programmer.zaman.now.util;

import programmer.zaman.now.annotation.NotBlank;
import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.BlankException;
import programmer.zaman.now.error.ValidationException;

import java.lang.reflect.Field;

public class ValidationUtil {
    //exception selalu static
    public static void validate(LoginRequest loginRequest) throws ValidationException, NullPointerException {
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if(loginRequest.username().isBlank()){
            throw new ValidationException("Username is blank");
        } else if(loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if(loginRequest.password().isBlank()) {
            throw new ValidationException("Password is blank");
        }
    }
    //method dengan BlankException
    //kalo yang runtime gak wajib pake keyword throws
    public static void validateRuntime(LoginRequest loginRequest) {
        if(loginRequest.username() == null){
            throw new NullPointerException("Username is null");
        } else if(loginRequest.username().isBlank()){
            throw new BlankException("Username is blank");
        } else if(loginRequest.password() == null) {
            throw new NullPointerException("Password is null");
        } else if(loginRequest.password().isBlank()) {
            throw new BlankException("Password is blank");
        }
    }

    //method baru untuk mencoba anotasi dan reflection
    //paramsnya Object, artinya kelas apapun bisa divalidasi
    public static void validationReflection(Object object) {
        Class aClass = object.getClass();
        //method dibawah ini, intinya ngambil field dari
        //class yang diambil dari params
        //getDeclaredFields() ngambil semua field (tidak hanya
        //public field saja)
        Field[] fields = aClass.getDeclaredFields();

        //pengecekan field satu2 oleh forEach()
        for(var field: fields){
            //method ini memaksa field private agar bisa dibaca juga
            field.setAccessible(true);
            if(field.getAnnotation(NotBlank.class) != null){
                //validate
                try{
                    String value = (String) field.get(object);

                    if(value == null || value.isBlank()){
                        throw new BlankException("Field " + field.getName() + " is blank");
                    }
                } catch(IllegalAccessException exception){
                    System.out.println("Tidak bisa mengakses field " + field.getName() );
                }
            }
        }
    }
}
