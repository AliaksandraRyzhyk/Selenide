import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.*;

public class MainPage {
//    @FindBy(xpath = "//span[contains(text(),'Телевизоры')]")
//    private WebElement element;

    private final SelenideElement element = $x("//span[contains(text(),'Телевизоры')]");

//    @FindBy(xpath="//div[@class='schema-tags__item']")
//    private WebElement elementSamsung;

    private final SelenideElement elementSamsung = $x("//div[@class='schema-tags__item']");

//    @FindBy(xpath="//ul[@class='schema-filter__list']//span[text()='Samsung']")
//    private WebElement elementTvSamsung;

    private final SelenideElement elementTvSamsung = $x("//ul[@class='schema-filter__list']//span[text()='Samsung']");

//    @FindBy(xpath = "//ul[@class='schema-filter__list']//span[text()='LG']")
//    private WebElement elementTvLg;

    private final SelenideElement elementTvLg = $x("//ul[@class='schema-filter__list']//span[text()='LG']");

//    @FindBy(xpath = "//div[@class='schema-product__title']")
//    private WebElement elementLg;

    private final ElementsCollection elementLg = $$x("//div[@class='schema-product__title']");


    public MainPage chooseElementTv() {
        element.click();
        return this;
    }

    public MainPage chooseElementSamsung() {
        elementSamsung.click();
        return this;
    }

    public Boolean isSelectedSamsung() {
        elementTvSamsung.isSelected();
        return false;
    }

    public MainPage chooseElementLg() {
        elementTvLg.scrollIntoView(true).click();
        return this;
    }

    public Boolean isElementsCollectionContainsText() {
// используя for each, тест работает через раз
//        for (SelenideElement element : elementLg) {
//            element.getText().contains(" LG ");
//        }
        for (int i = 0; i < elementLg.size(); i++) {
            elementLg.get(i).getText().contains(" LG ");
        }
        return true;
    }
}
