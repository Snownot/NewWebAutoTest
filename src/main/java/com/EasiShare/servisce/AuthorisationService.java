package com.EasiShare.servisce;

import com.EasiShare.domain.Repository.UserRepository;
import com.EasiShare.config.TestUsers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class AuthorisationService {

    private final UserRepository userRepository;
    private TestUsers testUsers;

    @Autowired
    public AuthorisationService(UserRepository userRepository, TestUsers testUsers) {
        this.userRepository = userRepository;
        this.testUsers = testUsers;
    }

    public TestUsers getTestUsers() {
        return testUsers;
    }

    @Transactional
    public boolean CheckUsersRegistered(String userName) {
        return userRepository.findByUserName(userName) != null;
    }

    @Transactional
    public void AddTestUser() {

    }
}
