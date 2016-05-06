import org.junit.Test;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class Apprentice {

    @Test
    public void shouldSearchForNearsoftAtGoogle() {
        open("http://google.com/");
        sleep(1000);
        $(By.name("q")).setValue("Nearsoft").pressEnter();
        $(By.cssSelector("div > h3 > a")).click();
        $(By.cssSelector("body > div.space > div.ns-hero.big.steps > h1")).shouldBe(text("Grow Your Development Team"));
    }

    @Test
    public void shouldLookForAJavascriptVacancyAtNearsoft(){
        open("http://nearsoft.com/");
        sleep(2000);
        $(By.linkText("Join Us!")).click();
        sleep(3000);
        $(By.cssSelector("a[href*='http://nearsoft.com/join-us/front-end-developer-2/'")).click();
        $(By.className("title")).shouldHave(text("Front-end Developer"));
    }

    @Test
    public void shouldSendAnEmailFromGmail(){
        open("http://mail.google.com");
        $(By.name("Email")).setValue("ExampleSelenide@gmail.com").pressEnter();
        $(By.name("Passwd")).setValue("ExampleSelenide123").pressEnter();
        sleep(3000);
        $(By.cssSelector(".T-I-KE")).click();
        $(By.id(":9m")).setValue("ariel.isaacm@gmail.com");
        $(By.name("subjectbox")).setValue("Hola desde Selenide!");
        $(By.id(":8w")).click();
    }

}
