package otus.ru.java;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import otus.ru.java.pro.providers.data.PostData;
import otus.ru.java.pro.providers.extensions.AppiumExtension;
import otus.ru.java.pro.providers.pages.MainPage;
import otus.ru.java.pro.providers.pages.PostPage;


@ExtendWith(AppiumExtension.class)
public class Demo_Test {

    MainPage mainPage = new MainPage();

    PostPage postPage = new PostPage();

    @Test
    public void firstTest(){

        int numberOfPost = 2;

        mainPage.open();

        mainPage.checkVisibilityPostsOnPage()
                .storeContentOfPost(PostData.CONTENT, numberOfPost)
                .clickByPost(numberOfPost);

        postPage.checkContentInPost(PostData.CONTENT.getContent());
        /*Selenide.open();
        //список из всех постов на экране
        String body = $$(By.xpath("//android.view.View[@content-desc]")).get(0).getAttribute("content-desc");
        String bodyNew = body.replaceAll("Author.*", "");
        System.out.println(bodyNew);
        $$(By.xpath("//android.view.View[@content-desc]")).get(0).click();
        String header = $(By.xpath("//android.view.View[not(@content-desc='Back')]/android.view.View[@index='1']")).getAttribute("content-desc");
        String body2 = $(By.xpath("//android.view.View[not(@content-desc='Back')]/android.view.View[@index='2']")).getAttribute("content-desc");
        String split = header + "\n" + body2;
        System.out.println(split);
        if (bodyNew.trim().equals(split.trim())) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        $(By.xpath("//android.view.View[not(@content-desc='Back')]/android.view.View[@index='2']"));
        $(".android.widget.Button").click();*/
//          $(By.xpath("//*[@text='Accessibility']")).click();
//        $(By.xpath("//*[@text='Accessibility Node Provider']")).shouldBe(Condition.visible);
        //кнопка назад

//        //заголовок
//        $(By.xpath("//android.view.View[not(@content-desc='Back')]/android.view.View[@index='1']"));
//        //боди
//        $(By.xpath("//android.view.View[not(@content-desc='Back')]/android.view.View[@index='2']"));
//        //
//        $(".android.view.View[content-desc^='Author']");
//        $(".android.view.View[content-desc^='Email']");
//        $(".android.view.View[content-desc^='Address']");
//        $(".android.view.View[content-desc^='Zip']");
    }

}
