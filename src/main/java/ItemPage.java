import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Selenide.$$x;

public class ItemPage {
//    @FindBy(xpath = "//div[@class='schema-product__title']")
//    private WebElement elementLg;

    private ElementsCollection elementLg = $$x("//div[@class='schema-product__title']");

    public Boolean print() {
        for (SelenideElement element : elementLg) {
            element.getText().contains(" LG ");
        }
        return true;
    }
}
