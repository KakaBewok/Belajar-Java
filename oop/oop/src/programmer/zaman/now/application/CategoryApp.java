package programmer.zaman.now.application;

import programmer.zaman.now.data.Category;

public class CategoryApp {
    public static void main(String[] args) {
        var category = new Category();
        //setter untuk merubah field, tidak lagi lgsg rubah ke field
        category.setId("ID");
        category.setId(null); //ini diabaikan
        category.setExpensive(true);

        //untuk mengambil id dan expensive,
        //harus pake method getter bukan lagi lgsg ke field;
        System.out.println(category.getId());
        System.out.println(category.isExpensive());
    }
}
