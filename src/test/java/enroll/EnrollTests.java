package enroll;

import base.Basetests;
import org.testng.annotations.Test;
import pages.EnrollPage;

public class EnrollTests extends Basetests {
    @Test
    public void testFillForm() {
        EnrollPage page = homePage.clickEnroll();
        page.typeFirstName("Cole");
        page.typeEmail("Cole@gmail.com");
        page.clickSend();
    }

    @Test
    public void testAlert() throws InterruptedException {
        EnrollPage page = homePage.clickEnroll();
        page.clickSend();

    }
}