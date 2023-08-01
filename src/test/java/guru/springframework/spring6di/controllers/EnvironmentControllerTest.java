package guru.springframework.spring6di.controllers;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EnvironmentControllerTest {
    @Autowired
    EnvironmentController controller;

    @Test
    void getEnvironment() {
        System.out.println(controller.getEnvironment());
    }
}
