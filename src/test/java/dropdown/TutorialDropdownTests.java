package dropdown;

import base.Basetests;
import org.testng.annotations.Test;
import pages.TutorialDropdownPage;

public class TutorialDropdownTests extends Basetests {

    @Test
    public void testHover(){
        TutorialDropdownPage page = homePage.clickTutorialDropDown();
        page.hoverMenu();
    }
}