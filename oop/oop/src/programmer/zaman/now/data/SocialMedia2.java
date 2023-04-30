package programmer.zaman.now.data;

//parent
class SocialMedia2 {
    String name;
}

class Instagram extends SocialMedia2{
   final void login(String username, String password){
       System.out.println("Selamat datang");
    }
}

class FakeInstagram extends Instagram{
    //method login tidak bisa dioverride,
    //karena method bertanda final di parent classnya.
//    void login(String username, String password){
//        System.out.println("Selamat datang");
//    }
}


