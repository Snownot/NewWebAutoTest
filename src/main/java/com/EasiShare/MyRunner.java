package com.EasiShare;

import com.EasiShare.domain.Entity.User;
import com.EasiShare.servisce.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MyRunner implements CommandLineRunner {

    @Autowired
    private UserService userService;

    @Override
    public void run(String... args) {
        List<User> users = userService.findAll();
        users.forEach(user -> System.out.println(user.toString()));
    }
}
