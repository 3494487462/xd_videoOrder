package com.zwf.boot1;



import com.zwf.boot1.controller.UserController;
import com.zwf.boot1.domain.User;
import com.zwf.boot1.utils.JsonData;
import junit.framework.TestCase;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserTest {

    @Autowired
    UserController userController;
    @Test
    void loginTest() {
        User user = new User(2,"a","123");
        JsonData jsonData = userController.login(user);

        TestCase.assertEquals(0,jsonData.getCode());

        System.out.println("啊啊");
    }


}