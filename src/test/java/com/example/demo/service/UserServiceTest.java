package com.example.demo.service;

import com.example.demo.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.EmbeddedDatabaseConnection;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

/**
 * Created by Brenda on 6/24/17.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@DataJpaTest
@AutoConfigureTestDatabase(connection = EmbeddedDatabaseConnection.H2)
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void saveAndFindUser() {

        String email = "email@gmail.com";
        String name = "name";
        User user = new User(name, email);
        userService.saveUser(user);

        List<User> users = userService.findByEmail(email);
        assertEquals(users.get(0).getName(), name);
    }

    @Test
    public void getAllUsers() {
        String email = "email@gmail.com";
        String name = "name";
        User user = new User(name, email);
        String email2 = "email2@gmail.com";
        String name2 = "name2";
        User user2 = new User(name2, email2);
        userService.saveUser(user);
        userService.saveUser(user2);

        assertThat(userService.findAllUsers().size(), is(2));
    }
}