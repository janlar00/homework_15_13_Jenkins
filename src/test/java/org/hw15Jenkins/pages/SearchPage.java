package org.hw15Jenkins.pages;

import static com.codeborne.selenide.Selenide.$;
import static org.openqa.selenium.By.linkText;

import org.hw15Jenkins.tests.JenkinsParameterizedTest;

import com.codeborne.selenide.SelenideElement;

public class SearchPage {

    private final SelenideElement repoLink = $(linkText(JenkinsParameterizedTest.REPONAME));

    public SearchPage repoLinkClick() {
        repoLink.click();
        return this;
    }
}
