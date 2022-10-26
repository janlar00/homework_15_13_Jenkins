package org.hw15Jenkins.steps;

import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;

import org.hw15Jenkins.pages.MainPage;
import org.hw15Jenkins.pages.RepoPage;
import org.hw15Jenkins.pages.SearchPage;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class WebSteps {
    MainPage mainPage = new MainPage();
    RepoPage repoPage = new RepoPage();
    SearchPage searchPage = new SearchPage();

    @Step("Открываем главную страницу")
    public void openMainPage() {
        mainPage.openPage();
    }

    @Step("Ищем  поиске репозиторий")
    public void searchForRepository(String repoName) {
        mainPage.searchInputClick().searchInputSetValue(repoName).searchInputSubmit();
    }

    @Step("Кликаем по ссылке репозитория")
    public void clickOnRepositoryLink() {
        searchPage.repoLinkClick();
    }

    @Step("Кликаем на таб Issues")
    public void openIssuesTab() {
        repoPage.issueTabClick();
    }

    @Step("Проверяем наличие Issue")
    public void checkIssueTitle(String issueTitle) {
        repoPage.checkIssueTitle(issueTitle);
    }

    @Attachment(value = "Screenshot", type = "image/png", fileExtension = "png")
    public byte[] takeScreenshot() {
        return ((TakesScreenshot)WebDriverRunner.getWebDriver()).getScreenshotAs(OutputType.BYTES);
    }

}