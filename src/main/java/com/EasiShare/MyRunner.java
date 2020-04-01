package com.EasiShare;

import com.EasiShare.servisce.AuthorisationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private final AuthorisationService authorisationService;

    @Autowired
    public MyRunner(AuthorisationService authorisationService) {
        this.authorisationService = authorisationService;
    }

    @Override
    public void run(String... args) {
        System.out.println(authorisationService.CheckUsersRegistered("Admin"));
        System.out.println(authorisationService.CheckUsersRegistered("TestUser"));
        authorisationService.AddTestUser();
        System.out.println(authorisationService.getTestUsers().getTester1());
        System.out.println(authorisationService.getTestUsers().getTester2());
        System.out.println(authorisationService.getTestUsers().getTester3());
    }
}
