package com.example.demo;

import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    @Autowired
    UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	//the following will be executed after the springapplication running.
//	@PostConstruct
//	public void saveUser() {
//        User user = new User("name", "email@gmail.com");
//        userService.saveUser(user);
//    }


}
