package programmer.zaman.now.data;

public abstract class Animal {
    public String name;

    //method abstract tidak perlu membuat block code deklarasi {}
    //method ini berguna untuk dioverride oleh child classnya
    public abstract void run();
}
