package scooter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import static config.ConfigApp.APP_URL;

public class Main {

    WebDriver driver;
    public Main(WebDriver driver){

        this.driver = driver;
        driver.get(APP_URL);

    }

    //Кнопка "Заказать"(верхняя)
    private By buttonOrderUp = By.className("Button_Button__ra12g");
    //Блок с кнопкой "Заказать"(снизу).
    private By blockOrderDown = By.className("Home_RoadMap__2tal_");
    //Кнопка "Заказать"(снизу)
    private By buttonOrderDown = By.xpath("//div[@class='Home_FinishButton__1_cWm']//button[contains(text(), 'Заказать')]");
    //Раздел "Вопросы о важном"
    private By importantQuestions = By.className("Home_FourPart__1uthg");
    //Кнопка с вопросом "Сколько это стоит? И как оплатить?"
    private By textQuestionCoastPayment = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Сколько это стоит? И как оплатить?')]");
    //Текст ответа на вопрос о стоимости и оплате
    private By textAnswerCoastPayment = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Сутки — 400 рублей. Оплата курьеру — наличными или картой.']");
    //Кнопка с вопросом "Хочу сразу несколько самокатов! Так можно?"
    private By textQuestionScooters = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Хочу сразу несколько самокатов! Так можно?')]");
    //Текст ответа на вопрос о нескольких самокатах
    private By textAnswerScooters = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.']");
    //Кнопка с вопросом "Как рассчитывается время аренды?"
    private By textQuestionRentalTime = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Как рассчитывается время аренды?')]");
    //Текст ответа на вопрос о времени аренды
    private By textAnswerRentalTime = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.']");
    //Кнопка с вопросом "Можно ли заказать самокат прямо на сегодня?"
    private By textQuestionScooterToday = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Можно ли заказать самокат прямо на сегодня?')]");
    //Текст ответа на вопрос об аренде самоката сегодня
    private By textAnswerScooterToday = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Только начиная с завтрашнего дня. Но скоро станем расторопнее.']");
    //Кнопка с вопросом "Можно ли продлить заказ или вернуть самокат раньше?"
    private By textQuestionExtendOrReturn = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Можно ли продлить заказ или вернуть самокат раньше?')]");
    //Текст ответа на вопрос можно ли продлить или вернуть раньше
    private By textAnswerExtendOrReturn = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.']");
    //Кнопка с вопросом "Вы привозите зарядку вместе с самокатом?"
    private By textQuestionCharger = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Вы привозите зарядку вместе с самокатом?')]");
    //Текст ответа на вопрос о зарядке
    private By textAnswerCharger = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.']");
    //Кнопка с вопросом "Можно ли отменить заказ?"
    private By textQuestionCancelOrder = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Можно ли отменить заказ?')]");
    //Текст ответа на вопрос об отмене заказа
    private By textAnswerCancelOrder = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.']");
    //Кнопка с вопросом "Я живу за МКАДом, привезёте?"
    private By textQuestionMKADDelivery = By.xpath("//div[@class='Home_FAQ__3uVm4']//div[contains(text(), 'Я жизу за МКАДом, привезёте?')]");
    //Текст ответа на вопрос о доставка за МКАД
    private By textAnswerMKADDelivery = By.xpath("//div[@class='Home_FAQ__3uVm4']//p[text()='Да, обязательно. Всем самокатов! И Москве, и Московской области.']");


    public void clickButtonOrderUp() {
        driver.findElement(buttonOrderUp).click();
    }

    public void scrollBlockOrderDown() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(blockOrderDown));
    }

    public void clickButtonOrderDown() {
        driver.findElement(buttonOrderDown).click();
    }

    public void scrollImportantQuestions() {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", driver.findElement(importantQuestions));
    }

    public void clickTextQuestionCoastPayment() {
        driver.findElement(textQuestionCoastPayment).click();
    }

    public void checkTextAnswerCoastPayment(String expectedText) {
        String currentText = driver.findElement(textAnswerCoastPayment).getText();
        Assert.assertEquals(expectedText, currentText);
    }

    public void clickTextQuestionScooters() {
        driver.findElement(textQuestionScooters).click();
    }

    public void checkTextAnswerScooters(String expectedText) {
        String currentText = driver.findElement(textAnswerScooters).getText();
        Assert.assertEquals(expectedText, currentText);
    }

    public void clickTextQuestionTRentalTime() {
        driver.findElement(textQuestionRentalTime).click();
    }

    public void checkTextAnswerRentalTime(String expectedText) {
        String currentText = driver.findElement(textAnswerRentalTime).getText();
        Assert.assertEquals(expectedText, currentText);
    }

    public void clickTextQuestionScooterToday() {
        driver.findElement(textQuestionScooterToday).click();
    }

    public void checkTextAnswerScooterToday(String expectedText) {
        String currentText = driver.findElement(textAnswerScooterToday).getText();
        Assert.assertEquals(expectedText, currentText);
    }

    public void clickTextQuestionExtendOrReturn() {
        driver.findElement(textQuestionExtendOrReturn).click();
    }

    public void checkTextAnswerExtendOrReturn(String expectedText) {
        String currentText = driver.findElement(textAnswerExtendOrReturn).getText();
        Assert.assertEquals(expectedText, currentText);
    }

    public void clickTextQuestionCharger() {
        driver.findElement(textQuestionCharger).click();
    }

    public void checkTextAnswerCharger(String expectedText) {
        String currentText = driver.findElement(textAnswerCharger).getText();
        Assert.assertEquals(expectedText, currentText);
    }

    public void clickTextQuestionCancelOrder() {
        driver.findElement(textQuestionCancelOrder).click();
    }

    public void checkTextAnswerCancelOrder(String expectedText) {
        String currentText = driver.findElement(textAnswerCancelOrder).getText();
        Assert.assertEquals(expectedText, currentText);
    }

    public void clickTextQuestionMKADDelivery() {
        driver.findElement(textQuestionMKADDelivery).click();
    }

    public void checkTextAnswerMKADDelivery(String expectedText) {
        String currentText = driver.findElement(textAnswerMKADDelivery).getText();
        Assert.assertEquals(expectedText, currentText);
    }

    public void checkAllLocators(int index, String expectedResult) {
        By[] buttons = {textQuestionCoastPayment, textQuestionScooters, textQuestionRentalTime, textQuestionScooterToday, textQuestionExtendOrReturn, textQuestionCharger, textQuestionCancelOrder, textQuestionMKADDelivery};
        By[] locators = {textAnswerCoastPayment, textAnswerScooters, textAnswerRentalTime, textAnswerScooterToday, textAnswerExtendOrReturn, textAnswerCharger, textAnswerCancelOrder, textAnswerMKADDelivery};

        driver.findElement(buttons[index]).click();
        String currentText = driver.findElement(locators[index]).getText();
        Assert.assertEquals(expectedResult, currentText);
    }

}
