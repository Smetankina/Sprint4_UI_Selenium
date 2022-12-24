package ru.yandex.practikum;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageClass {

    private WebDriver driver;

    //конструктор для класса страницы
    public HomePageClass(WebDriver driver) {
        this.driver = driver;
    }


    public HomePageClass openPage() {
        driver.get("https://qa-scooter.praktikum-services.ru/");
        return this;
    }

    //кнопка Заказать в Header
    private By orderButtonInHeader = By.xpath(".//button[(@class ='Button_Button__ra12g' and text()='Заказать')]");
    //кнопка Заказать в ThirdPart
    private By orderButtonInEnd = By.className("Button_Button__ra12g Button_Middle__1CSJM");
    //0 Кликнуть на "Сколько это стоит?И как оплатить?" By.id="accordion__heading-0"
    private By howMuchCostQuestion = By.id("accordion__heading-0");
    //Сутки — 400 рублей. Оплата курьеру — наличными или картой.
    private By howMuchCostAnswer = By.xpath(".//*[@id='accordion__panel-0']/p");
    //1 Хочу сразу несколько самокатов! Так можно?
    private By iWantFewQuestion = By.id("accordion__heading-1");
    //Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.
    private By iWantFewAnswer = By.xpath(".//*[@id='accordion__panel-1']/p");
    //2 Как рассчитывается время аренды?
    private By howCalculateRentTimeQuestion = By.id("accordion__heading-2");
    //Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.
    private By howCalculateRentTimeAnswer = By.xpath(".//*[@id='accordion__panel-2']/p");
    //3 Можно ли заказать самокат прямо на сегодня?
    private By canIRentTodayQuestion = By.id("accordion__heading-3");
    //Только начиная с завтрашнего дня. Но скоро станем расторопнее.
    private By canIRentTodayAnswer = By.xpath(".//*[@id='accordion__panel-3']/p");
    //4 Можно ли продлить заказ или вернуть самокат раньше?
    private By canIChangeRentTimeQuestion = By.id("accordion__heading-4");
    //Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.
    private By canIChangeRentTimeAnswer = By.xpath(".//*[@id='accordion__panel-4']/p");
    //5 Вы привозите зарядку вместе с самокатом?
    private By aboutChargeQuestion = By.id("accordion__heading-5");
    //Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.
    private By aboutChargeAnswer = By.xpath(".//*[@id='accordion__panel-5']/p");
    //6 Можно ли отменить заказ?
    private By canICancelOrderQuestion = By.id("accordion__heading-6");
    // Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.''
    private By canICancelOrderAnswer = By.xpath(".//*[@id='accordion__panel-6']/p");
    //7 Я жизу за МКАДом, привезёте?
    private By beyondTheMKADQuestion = By.id("accordion__heading-7");
    // Да, обязательно. Всем самокатов! И Москве, и Московской области.
    private By beyondTheMKADAnswer = By.xpath(".//*[@id='accordion__panel-7']/p");


    //метод для клика по кнопке Заказать в Хедере
    public HomePageClass clickOrderButtonInHeader() {
        driver.findElement(orderButtonInHeader).click();
        return this;
    }

    public HomePageClass orderButtonInEnd() {
        driver.findElement(orderButtonInEnd).click();
        return this;
    }


    // методы для клика по элементам в списке
    public HomePageClass clickHowMuchCostQuestion() {


        driver.findElement(howMuchCostQuestion).click();

        return this;

    }


    public HomePageClass clickIWantFewQuestion() {

        driver.findElement(iWantFewQuestion).click();

        return this;
    }

    public HomePageClass clickHowCalculateRentTimeQuestion() {

        driver.findElement(howCalculateRentTimeQuestion).click();
        return this;
    }

    public HomePageClass clickCanIRentTodayQuestion() {

        driver.findElement(canIRentTodayQuestion).click();
        return this;
    }

    public HomePageClass clickCanIChangeRentTimeQuestion() {

        driver.findElement(canIChangeRentTimeQuestion).click();
        return this;
    }

    public HomePageClass clickAboutChargeQuestion() {

        driver.findElement(aboutChargeQuestion).click();
        return this;
    }

    public HomePageClass clickCanICancelOrderQuestion() {

        driver.findElement(canICancelOrderQuestion).click();
        return this;
    }

    public HomePageClass clickBeyondTheMKADQuestion() {

        driver.findElement(beyondTheMKADQuestion).click();
        return this;
    }

    // метод для получения текста элемента в списке
    public String getHowMuchCostAnswer() {

        return driver.findElement(howMuchCostAnswer).getText();

    }

    public String getiWantFewAnswer() {

        return driver.findElement(iWantFewAnswer).getText();
    }

    public String getHowCalculateRentTimeAnswer() {

        return driver.findElement(howCalculateRentTimeAnswer).getText();
    }

    public String getCanIRentTodayAnswer() {

        return driver.findElement(canIRentTodayAnswer).getText();
    }

    public String getCanIChangeRentTimeAnswer() {

        return driver.findElement(canIChangeRentTimeAnswer).getText();
    }

    public String getAboutChargeAnswer() {

        return driver.findElement(aboutChargeAnswer).getText();
    }

    public String getCanICancelOrderAnswer() {

        return driver.findElement(canICancelOrderAnswer).getText();
    }

    public String getBeyondTheMKADAnswer() {

        return driver.findElement(beyondTheMKADAnswer).getText();
    }
    //метод для прокрутки страницы до элемента

    public HomePageClass scrollPage() {
        WebElement element = driver.findElement(howMuchCostQuestion);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", element);
        return this;
    }
}

