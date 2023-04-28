package programmer.zaman.now.data;

public class Category {
    private String id;
    private boolean expensive;

    //getter and setter
    public String getId() {
        return id;
    }
    public void setId(String id) {
        if(id != null){
            this.id = id;
        }
    }
    public boolean isExpensive() {
        return expensive;
    }
    public void setExpensive(boolean expensive) {
        this.expensive = expensive;
    }
}
//cara membuat getter dan setter di IDE Intellij
// ke tab code -> generate -> Getter & Setter -> pilih fieldnya
// -> lalu ok -> selesai (code akan otomatis tergenerate).
