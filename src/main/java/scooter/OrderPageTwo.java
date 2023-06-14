package scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.junit.Assert.assertTrue;
import static config.ConfigApp.APP_URL;

public class OrderPageTwo {

    WebDriver driver;

    public OrderPageTwo(WebDriver driver) {
        this.driver = driver;
        driver.get(APP_URL);
    }

    private By FieldCalendar = By.xpath(".//input[@placeholder = '* Когда привезти самокат']");
    private By DropdownRentalPeriod = By.xpath(".//span[@class='Dropdown-arrow']");
    private By RentalPeriodOneDay = By.xpath(".//div[@role='option' and text()='сутки']");
    private By ScooterColourBlack = By.id("black");
    private By FieldComments = By.xpath(".//input[@placeholder = 'Комментарий для курьера']");
    private By ButtonOrder = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Заказать']");
    private By TextQuestionOrder = By.xpath(".//div[text()='Хотите оформить заказ?']");
    private By ButtonOrderYes = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Да']");
    private By OrderSuccessfullyDone = By.xpath(".//div[@class='Order_ModalHeader__3FDaJ' and text()='Заказ оформлен']");

    public void typeFieldCalendar(String calendarDate){
        driver.findElement(FieldCalendar).sendKeys(calendarDate);
    }
    public void clickDropdownRentalPeriod(){
        driver.findElement(DropdownRentalPeriod).click();
    }
    public void chooseRentalPeriodOneDay(){
        driver.findElement(RentalPeriodOneDay).click();
    }
    public void chooseScooterColourBlack(){
        driver.findElement(ScooterColourBlack).click();
    }
    public void typeFieldComments(String comments){
        driver.findElement(FieldComments).sendKeys(comments);
    }
    public void clickButtonOrder(){
        driver.findElement(ButtonOrder).click();
    }
    public void checkTextQuestionOrder(){
        boolean isDisplayed = driver.findElement(TextQuestionOrder).isDisplayed();
        assertTrue(isDisplayed);
    }
    public void clickButtonOrderYes(){
        driver.findElement(ButtonOrderYes).click();
    }
    public void checkOrderSuccessfullyDone(){
        boolean isDisplayed = driver.findElement(OrderSuccessfullyDone).isDisplayed();
        assertTrue(isDisplayed);
    }
}
