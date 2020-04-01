package com.EasiShare.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="my")
public class TestUsers {

    private String tester1;
    private String tester2;
    private String tester3;

    public String getTester1() {
        return tester1;
    }

    public void setTester1(String tester1) {
        this.tester1 = tester1;
    }

    public String getTester2() {
        return tester2;
    }

    public void setTester2(String tester2) {
        this.tester2 = tester2;
    }

    public String getTester3() {
        return tester3;
    }

    public void setTester3(String tester3) {
        this.tester3 = tester3;
    }
}
