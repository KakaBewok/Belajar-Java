package programmer.zaman.now.application;

import programmer.zaman.now.data.CreateUserRequest;
import programmer.zaman.now.util.ValidationUtil;

//penggunaan validationReflection
public class ReflectionApp {
    public static void main(String[] args) {
        CreateUserRequest request = new CreateUserRequest();
        request.setUsername("Eko");
//        request.setPassword("rahasia");
        ValidationUtil.validationReflection(request);
    }
}
