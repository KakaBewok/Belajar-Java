package programmer.zaman.now.application;

import programmer.zaman.now.data.HelloWorld;

public class HelloWorldApp {
    public static void main(String[] args) {

        //contoh penggunaan anonymus class
        //interface HelloWorld tidak harus jadi parent untuk child classnya dulu
        //langsung override method saja
        HelloWorld english = new HelloWorld() {
            @Override
            public void sayHello() {
                System.out.println("Hello");
            }

            @Override
            public void sayHello(String name) {
                System.out.println("Hello " + name);
            }
        };

        english.sayHello();
        english.sayHello("Rizal");
    }
}
//kekurangan anonymus class tidak bisa direuse