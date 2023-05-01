package programmer.zaman.now.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD})
//retention menentukan anotasi ini akan berguna dimana (seteleah compile/source code, dll)
//hal itu ditentukan di @retention
@Retention(RetentionPolicy.RUNTIME)
public @interface Fancy {
    //bikin field disini mirip kaya bikin method abstract
    //bisa juga dipakein default value agar orang yang menggunakan
    //atau mengextends anotasi ini tidak perlu meng-override fieldnya
    String name();

    String[] tags() default {};

}
//annotation sangat sederhana
//tidak bisa extends atau implements
//membuatnya menggunakan @interface (bukan interface kaya sebelumnya
//dan harus ada @target dan @retention diatasnya)

