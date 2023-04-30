package programmer.zaman.now.data;

public class Customer {
    private String name;
    //ini untuk menggunakan tipe data enum
    //cukup gunakan sebagai tipe data(dalam hal ini nama enumnya level)
    private Level level;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }
}
