package readmore;

import base.Basetests;
import org.testng.annotations.Test;
import pages.ReadMorePage;
import static org.testng.Assert.*;

public class ReadMoreTests extends Basetests {

    @Test
    public void testClickReadMore() {
        String urlBefore = driver.getCurrentUrl();
        ReadMorePage readMorePage = homePage.clickReadMore();
        String urlAfter = readMorePage.getCurrentUrl();
        assertNotEquals(urlBefore, urlAfter);
    }
}