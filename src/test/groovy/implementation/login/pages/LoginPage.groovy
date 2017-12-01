package implementation.login.pages

import io.appium.java_client.pagefactory.AndroidFindBy
import io.appium.java_client.pagefactory.iOSFindBy
import io.cify.framework.PageObjects
import io.cify.framework.core.Device
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.FindBy

/**
 * Created by FOB Solutions
 */
class LoginPage extends PageObjects {

    @iOSFindBy(accessibility = "usernameTextField")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.ScrollView/android.view.View/android.widget.LinearLayout[1]/android.widget.FrameLayout/android.widget.EditText")
    @FindBy(id = "emailOrUsername")
    WebElement usernameField

    @iOSFindBy(accessibility = "passwordTextField")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.ScrollView/android.view.View/android.widget.LinearLayout[2]/android.widget.FrameLayout/android.widget.EditText")
    @FindBy(id = "pass")
    WebElement passwordField

    @iOSFindBy(accessibility = "Next:")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.ScrollView/android.view.View/android.widget.Button[2]")
    @FindBy(className = "login")
    WebElement nextButton

    @iOSFindBy(accessibility = "createNewAccountButton")
    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.View/android.widget.ScrollView/android.view.View/android.widget.Button[1]")
    @FindBy(className = "register")
    WebElement createNewAccountButton

    @FindBy(xpath = "//*[@id=\"login-card\"]/div[2]/div[1]/div/div")
    WebElement usernameFieldError

    @FindBy(xpath = "//*[@id=\"login-card\"]/div[2]/div[2]/div/div")
    WebElement passwordFieldError

    @AndroidFindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.TextView")
    @FindBy(className = "toast-message")
    WebElement toastMessage

    LoginPage(Device device) {
        super(device)
    }
}