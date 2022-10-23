package otus.ru.java.pro.providers.pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import otus.ru.java.pro.providers.data.PostData;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class MainPage {

    ElementsCollection posts = $$(By.xpath("//android.view.View[@content-desc]"));

    public MainPage open() {
        Selenide.open();

        return this;
    }

    public MainPage checkVisibilityPostsOnPage() {
        for (SelenideElement element : posts){
            element.shouldBe(Condition.visible);
        }
        return this;
    }

    public MainPage storeContentOfPost(PostData postData, int numberOfPost){
        postData.setContent($$(By.xpath("//android.view.View[@content-desc]")).get(numberOfPost).getAttribute("content-desc").replaceAll("Author.*", ""));
        return this;
    }

    public MainPage clickByPost(int numberOfPost) {

        posts.get(numberOfPost).shouldBe(Condition.visible);
        posts.get(numberOfPost).click();
        return this;
    }


}
