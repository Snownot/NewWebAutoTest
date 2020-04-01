package com.EasiShare.jbehave;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.thucydides.jbehave.ThucydidesJUnitStories;

public class AcceptanceTestSuite extends ThucydidesJUnitStories {

    public AcceptanceTestSuite()  {
        WebDriverManager.chromedriver().setup();
        runThucydides().withDriver("chrome");
    }
}
