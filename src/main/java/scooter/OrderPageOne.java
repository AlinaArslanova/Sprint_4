package scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static config.ConfigApp.APP_URL;

public class OrderPageOne {

    WebDriver driver;

    public OrderPageOne(WebDriver driver) {
        this.driver = driver;
        driver.get(APP_URL);
    }

    private By FieldName = By.xpath(".//input[@placeholder = '* Имя']");
    private By FieldSurname = By.xpath(".//input[@placeholder = '* Фамилия']");
    private By FieldAddress = By.xpath(".//input[@placeholder = '* Адрес: куда привезти заказ']");
    private By DropdownMetro = By.className("select-search__value");
    private By ListMetro = By.xpath(".//button[@value = '2']");
    private By FieldPhone = By.xpath(".//input[@placeholder = '* Телефон: на него позвонит курьер']");
    private By OrderButtonFurther = By.xpath(".//button[@class='Button_Button__ra12g Button_Middle__1CSJM' and text()='Далее']");

    public void typeFieldName(String name) {

        driver.findElement(FieldName).sendKeys(name);
    }
    public void typeFieldSurname(String surname) {

        driver.findElement(FieldSurname).sendKeys(surname);
    }
    public void typeFieldAddress(String address) {

        driver.findElement(FieldAddress).sendKeys(address);
    }
    public void clickDropdownMetro(){

        driver.findElement(DropdownMetro).click();
    }
    public void chooseListMetro(){

        driver.findElement(ListMetro).click();
    }
    public void typeFieldPhone(String phoneNumber){

        driver.findElement(FieldPhone).sendKeys(phoneNumber);
    }
    public void clickOrderButtonFurther(){

        driver.findElement(OrderButtonFurther).click();
    }
}
