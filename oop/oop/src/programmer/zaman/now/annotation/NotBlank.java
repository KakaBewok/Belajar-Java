package programmer.zaman.now.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//akan memberikan meta data ke field
@Target({ElementType.FIELD})
//RUNTIME agar bisa terbaca oleh reflection
@Retention(RetentionPolicy.RUNTIME)
public @interface NotBlank {
}
