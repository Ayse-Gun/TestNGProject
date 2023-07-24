package tests.US001;

import javafx.scene.input.Dragboard;
import org.testng.annotations.Test;
import pages.Page;
import utilities.ConfigReader;
import utilities.Driver;

public class TC01_SearchBoxTest {
    @Test
    public void test01() {
        Driver.getDriver().get(ConfigReader.getProperty("amazonUrl"));
        Page page = new Page();
        page.searchBox.click();
        Driver.closeDriver();
    }
}
