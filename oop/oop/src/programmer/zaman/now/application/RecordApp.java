package programmer.zaman.now.application;

import programmer.zaman.now.data.LoginRequest;

public class RecordApp {
    public static void main(String[] args) {
        //implementasi record class dari file LoginRequest.java
        LoginRequest loginRequest = new LoginRequest("Zayn", "rahasia");

        System.out.println(loginRequest);

        //ini untuk getter dan setternya
        //getternya: nama field + ().
        System.out.println(loginRequest.username());
        System.out.println(loginRequest.password());

        //mencoba memanggil beberapa contruct di file LoginRequest
        System.out.println(new LoginRequest("Zayn"));
        System.out.println(new LoginRequest("Zayn", "rahasia"));
    }
}
