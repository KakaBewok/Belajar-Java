package programmer.zaman.now.application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//public class ReadApp {
//    public static void main(String[] args) {
//        BufferedReader reader = null;
//
//        try{
//            reader = new BufferedReader(
//                    new FileReader("README.md")
//            );
//
//            while(true){
//                String line = reader.readLine();
//                if(line == null){
//                    break;
//                }
//                System.out.println(line);
//            }
//
//        }catch(Throwable throwable){
//            System.out.println("error membaca file " + throwable.getMessage());
//        } finally {
//            if(reader != null){
//               try{
//                    reader.close();
//                   System.out.println("success closed!");
//               } catch(IOException exception){
//                   System.out.println("Error menutup resource " + exception.getMessage());
//               }
//            }
//        }
//    }
//}
//BufferedReader merupakan child dari class Closeable -> AutoCloseable
//kode diatas menggunakan close resource manual

public class ReadApp {
    public static void main(String[] args) {
        try ( BufferedReader reader = new BufferedReader(
                new FileReader("README.md")
        )){
            while(true){
                String line = reader.readLine();
                if(line == null){
                    break;
                }
                System.out.println(line);
            }
        }catch(Throwable throwable){
            System.out.println("error membaca file " + throwable.getMessage());
        }
    }
}
//diatas menggunakan cara lebih sederhana try with resource
