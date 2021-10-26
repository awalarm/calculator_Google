package base;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorGoogleTest extends BaseSettingsTest {
    private static final By ZERO = By.cssSelector("tr:nth-child(5) > td:nth-child(1) > .A2W7l > .XRsWPe");
    private static final By ONE = By.cssSelector("tr:nth-child(4) > td:nth-child(1) > .A2W7l > .XRsWPe");
    private static final By TWO = By.cssSelector("tr:nth-child(4) > td:nth-child(2) > .A2W7l > .XRsWPe");
    private static final By THREE = By.cssSelector("tr:nth-child(4) > td:nth-child(3) > .A2W7l > .XRsWPe");
    private static final By FOUR = By.cssSelector("tr:nth-child(3) > td:nth-child(1) > .A2W7l > .XRsWPe");
    private static final By FIVE = By.cssSelector("tr:nth-child(3) > td:nth-child(2) > .A2W7l > .XRsWPe");
    private static final By SIX = By.cssSelector("tr:nth-child(3) > td:nth-child(3) > .A2W7l > .XRsWPe");
    private static final By SEVEN = By.cssSelector("tr:nth-child(2) > td:nth-child(1) > .A2W7l > .XRsWPe");
    private static final By EIGHT = By.cssSelector("tr:nth-child(2) > td:nth-child(2) > .A2W7l > .XRsWPe");
    private static final By NINE = By.cssSelector("tr:nth-child(2) > td:nth-child(3) > .A2W7l > .XRsWPe");

    private static final By EQUALS = By.cssSelector(".UUhRt");
    private static final By ADD = By.cssSelector("tr:nth-child(5) .mF5fo > .MEdqYd");
    private static final By SUBTRACTION = By.cssSelector("tr:nth-child(4) .mF5fo > .XRsWPe");
    private static final By MULTIPLICATION = By.cssSelector("tr:nth-child(3) .mF5fo > .XRsWPe");


    @Test
    public void ResultTest() {
        getDriver().get("https://google.com");

        getDriver().findElement(By.name("q")).sendKeys("Калькулятор");
        getDriver().findElement(By.className("gNO89b")).click();

        getDriver().findElement(ONE).click();
        getDriver().findElement(MULTIPLICATION).click();
        getDriver().findElement(TWO).click();
        getDriver().findElement(SUBTRACTION).click();
        getDriver().findElement(THREE).click();
        getDriver().findElement(ADD).click();
        getDriver().findElement(ONE).click();
        getDriver().findElement(EQUALS).click();

        Assert.assertEquals(getDriver().findElement(By.xpath("//span[contains(.,'1 × 2 - 3 + 1 =')]")).getText(), "1 × 2 - 3 + 1 =");

        Assert.assertEquals(getDriver().findElement(By.id("cwos")).getText(), "0");
    }
}
