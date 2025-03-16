package org.automation.framework.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.automation.framework.BrowserManager;
import org.automation.framework.SeleniumActions;
import org.openqa.selenium.By;

public class HomePage {
    Logger log = LogManager.getRootLogger();
    BrowserManager manager = new BrowserManager();
    SeleniumActions actions = new SeleniumActions(manager);

    private final static By HOME_PAGE_BANNER = By.xpath("//*[@id=\"indexsearch\"]/div[2]/div");

    public void openHomePage() {
        log.info("Open home page");
        manager.openBrowser();
        manager.getDriver().get("https://www.booking.com/");
    }

    public String homePageTitle() {
        log.info("Get home page title");
        return manager.getDriver().getTitle();
    }

    public boolean isBannerDisplayed() {
        log.info("Check if banner is displayed");
        return actions.isElementDisplayed(HOME_PAGE_BANNER);
    }

    public boolean isBannerEnabled() {
        log.info("Check if banner is enabled");
        return actions.isElementEnabled(HOME_PAGE_BANNER);
    }


}
