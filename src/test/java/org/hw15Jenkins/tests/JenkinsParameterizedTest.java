package org.hw15Jenkins.tests;

import org.hw15Jenkins.BaseTest;
import org.hw15Jenkins.steps.WebSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Story;

public class JenkinsParameterizedTest extends BaseTest {
    public static final String REPONAME = "janlar00/homework_15_13_Jenkins";
    private static final String ISSUENAME = "Issues";
    WebSteps webSteps = new WebSteps();

    @Test
    @Feature("Issue в репозитории")
    @Story("Создать issue")
    @Owner("jan")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "Testing", url = "https://testing.github.com")
    @DisplayName("Проверить имя issue – тест с аннотацией @Step")
    public void checkIssueNameWithAnnotationStep() {
        webSteps.openMainPage();
        webSteps.searchForRepository(REPONAME);
        webSteps.clickOnRepositoryLink();
        webSteps.openIssuesTab();
        webSteps.checkIssueTitle(ISSUENAME);

    }

}
