package tests;

import lib.CoreTestCase;
import lib.ui.SearchPageObject;
import org.junit.Test;

public class Lesson5Task2 extends CoreTestCase {
    @Test
    public void testEx9() {
        SearchPageObject SearchPageObject = new SearchPageObject(driver);

        SearchPageObject.initSearchInput();
        SearchPageObject.typeSearchLine("ololygon");
        SearchPageObject.waitForElementByTitleAndDescription("Ololygon strigilata","Species of amphibian");
        assertTrue("We found less than three results!",SearchPageObject.getAmountOfFoundArticles()>2);
    }

}
