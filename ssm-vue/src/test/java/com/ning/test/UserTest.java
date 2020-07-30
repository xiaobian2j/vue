package com.ning.test;

import com.ning.domain.User;
import com.ning.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class UserTest {

    @Autowired
    private UserService userService;

    @Test
    public void findAll(){
        for (User user : userService.findAll()) {
            System.out.println(user);
        }
    }

    @Test
    public void findById(){
        System.out.println(userService.findById(1));
    }

    @Test
    public void update(){
        User user = userService.findById(1);
        System.out.println(user);
        user.setAge(60);
        userService.update(user);
        user = userService.findById(1);
        System.out.println(user);
    }
}
