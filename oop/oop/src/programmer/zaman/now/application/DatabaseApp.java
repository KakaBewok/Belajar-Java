package programmer.zaman.now.application;

import programmer.zaman.now.error.DatabaseError;

public class DatabaseApp {
    public static void main(String[] args) {
        //bisa pake try catch, namun tidak direkomendasikan
        connectDatabase("rizal", null);
        System.out.println("Success");
    }
    public static void connectDatabase(String username, String password){
        if(username == null || password == null ){
            throw new DatabaseError("Can't connet to database");
        }
    }
}
