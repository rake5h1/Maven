package selenium.stepDefinitions;


import org.testng.annotations.Test;

import Pages.Search;
import Pages.VisitPage;
import selenium.BaseTest;

public class SeleniumTest2 extends BaseTest {

    @Test
    public void testGoogleSearch2() throws InterruptedException {
        if (driver == null) {
            System.out.println("Driver is null");
        } else {
            VisitPage visit = new VisitPage(driver);
            visit.navigateTo("https://google.com");
            Search search = new Search(driver);
            search.search("Selenium");
        }
    }

}
