package programmer.zaman.now.application;

import programmer.zaman.now.annotation.Fancy;
import programmer.zaman.now.data.LoginRequest;
import programmer.zaman.now.error.ValidationException;
import programmer.zaman.now.util.ValidationUtil;


public class ValidationApp {
    @Fancy(name = "ValidationApp", tags = {"application", "java"})
    public static void main(String[] args) {
        LoginRequest loginRequest = new LoginRequest(null, null);

       //pengecekan error harus dibungkus oleh block try-catch tipe 1
        try {
            ValidationUtil.validate(loginRequest);
            System.out.println("Data Valid!");
            //dibawah ini kalo pengen nangkep errornya sekaligus
        } catch (ValidationException | NullPointerException error){
            System.out.println("Error, not valid: " + error.getMessage());
        }
//        catch ( NullPointerException error){
//            System.out.println("Error, null: " + error.getMessage());
//        }
        finally {
            System.out.println("Error/gak ini akan dieksekusi");
        }

        //implementasi runtime exception
        //kalo runtime tidak wajib pake try catch
        LoginRequest loginRequest2 = new LoginRequest(null, null);
        ValidationUtil.validateRuntime(loginRequest2);

    }
}
//kalo errornya dua jenis,
//berarti catchnya ada dua block

//ada 3 jenis exception
//1. checked
//2. runtime
//3. error (not recommended u/ try catch)
