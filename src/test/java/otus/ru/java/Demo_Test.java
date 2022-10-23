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
    public void checkPostsInApp(){

        int numberOfPost = 2;

        mainPage.open();

        mainPage.checkVisibilityPostsOnPage()
                .storeContentOfPost(PostData.CONTENT, numberOfPost)
                .clickByPost(numberOfPost);

        postPage.checkContentInPost(PostData.CONTENT.getContent());
    }

}
