package com.EasiShare.steps;

import com.EasiShare.pages.DictionaryPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EndUserSteps extends ScenarioSteps {

    private DictionaryPage dictionaryPage = null;

    @Step
    public void openWebPage() {
        dictionaryPage.open();
    }

    @Step
    public void enters(String key ,String keyword) {
        dictionaryPage.enterKeywords(key, keyword);
    }

    public void clickButton(String keyword) {
        dictionaryPage.clickButton(keyword);
    }
}