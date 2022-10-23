package otus.ru.java.pro.providers.extensions;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import otus.ru.java.pro.providers.SelenideWebDriver;

public class AppiumExtension implements BeforeAllCallback {

  @Override
  public void beforeAll(ExtensionContext extensionContext) throws Exception {
    Configuration.browserSize = null;
    Configuration.browser = SelenideWebDriver.class.getName();
  }
}
