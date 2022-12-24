package scootertests;

import org.junit.Test;

import ru.yandex.practikum.HomePageClass;

import static org.junit.Assert.assertEquals;

public class QuestionImportantTest extends TestBase {


    private final String howMuchCostAnswerExpected = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";
    private final String iWantFewAnswerExpected = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";
    private final String howCalculateRentTimeAnswerExpected = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";
    private final String canIRentTodayAnswerExpected = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";
    private final String canIChangeRentTimeAnswerExpected = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";
    private final String aboutChargeAnswerExpected = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";
    private final String canICancelOrderAnswerExpected = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";
    private final String beyondTheMKADAnswerExpected = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";


    @Test

    public void howMuchCostAnswerTest() {

        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickHowMuchCostQuestion();

        HomePageClass objHomePageClass = new HomePageClass(driver);

        String howMuchCostAnswerActual = objHomePageClass.getHowMuchCostAnswer();

        assertEquals("Текст не соответствует ОР", howMuchCostAnswerExpected, howMuchCostAnswerActual);

    }

    @Test

    public void iWantFewAnswerTest() {

        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickIWantFewQuestion();

        HomePageClass objHomePageClass = new HomePageClass(driver);
        String iWantFewAnswerActual = objHomePageClass.getiWantFewAnswer();

        assertEquals("Текст не соответствует ОР", iWantFewAnswerExpected, iWantFewAnswerActual);

    }

    @Test
    public void howCalculateRentTimeAnswerTest() {
        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickHowCalculateRentTimeQuestion();
        HomePageClass objHomePageClass = new HomePageClass(driver);
        String howCalculateRentTimeAnswerActual = objHomePageClass.getHowCalculateRentTimeAnswer();
        assertEquals("Текст не соответствует ОР", howCalculateRentTimeAnswerExpected, howCalculateRentTimeAnswerActual);

    }


    @Test
    public void canIRentTodayAnswerTest() {
        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickCanIRentTodayQuestion();
        HomePageClass objHomePageClass = new HomePageClass(driver);
        String canIRentTodayAnswerActual = objHomePageClass.getCanIRentTodayAnswer();
        assertEquals("Текст не соответствует ОР", canIRentTodayAnswerExpected, canIRentTodayAnswerActual);

    }

    @Test
    public void canIChangeRentTimeAnswerTest() {
        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickCanIChangeRentTimeQuestion();
        HomePageClass objHomePageClass = new HomePageClass(driver);
        String canIChangeRentTimeAnswerActual = objHomePageClass.getCanIChangeRentTimeAnswer();
        assertEquals("Текст не соответствует ОР", canIChangeRentTimeAnswerExpected, canIChangeRentTimeAnswerActual);

    }

    @Test
    public void aboutChargeAnswerTest() {
        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickAboutChargeQuestion();
        HomePageClass objHomePageClass = new HomePageClass(driver);
        String aboutChargeAnswerActual = objHomePageClass.getAboutChargeAnswer();
        assertEquals("Текст не соответствует ОР", aboutChargeAnswerExpected, aboutChargeAnswerActual);

    }

    @Test
    public void canICancelOrderAnswerTest() {
        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickCanICancelOrderQuestion();
        HomePageClass objHomePageClass = new HomePageClass(driver);
        String canICancelOrderAnswerActual = objHomePageClass.getCanICancelOrderAnswer();
        assertEquals("Текст не соответствует ОР", canICancelOrderAnswerExpected, canICancelOrderAnswerActual);

    }

    @Test
    public void beyondTheMKADAnswerTest() {
        new HomePageClass(driver)
                .openPage()
                .scrollPage()
                .clickBeyondTheMKADQuestion();
        HomePageClass objHomePageClass = new HomePageClass(driver);
        String beyondTheMKADAnswerActual = objHomePageClass.getBeyondTheMKADAnswer();
        assertEquals("Текст не соответствует ОР", beyondTheMKADAnswerExpected, beyondTheMKADAnswerActual);

    }

}
