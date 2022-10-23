package otus.ru.java.pro.providers.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class PostPage {

    public Boolean checkContentInPost(String text){
        String title = $(By.xpath("//android.view.View[not(@content-desc='Back')]/android.view.View[@index='1']")).getAttribute("content-desc");
        String body = $(By.xpath("//android.view.View[not(@content-desc='Back')]/android.view.View[@index='2']")).getAttribute("content-desc");
        String content = title + "\n" + body;

        if (text.trim().equals(content.trim())) {
            return true;
        } else {
            return false;
        }
    }

    public PostPage returnToMainPage(){
        $(".android.widget.Button").click();
        return this;
    }

}
