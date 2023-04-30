package programmer.zaman.now.data;

public class Application {
    public static final int PROCESSORS;

    static {
        System.out.println("Mengakses class Application");

        //diisi value untuk mengetahui berapa processor yang jalan
        //di PC/Laptop
        PROCESSORS = Runtime.getRuntime().availableProcessors();
    }
}
