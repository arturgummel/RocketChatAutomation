package implementation.login.actions

import implementation.login.pages.LoginPage
import io.cify.framework.actions.ActionsMobileIOSApp
import io.cify.framework.core.Device

/**
 * Created by FOB Solutions
 */
class LoginActionsMobileAndroidApp implements ILoginActions, ActionsMobileIOSApp {

    Device device
    LoginPage loginPage

    LoginActionsMobileAndroidApp(Device device) {
        this.device = device
        this.loginPage = new LoginPage(device)
    }

    /**
     * Verifies if login page is visible
     * @return
     */
    @Override
    boolean isLoginPageVisible() {
        return isDisplayed(loginPage.getUsernameField()) &&
                isDisplayed(loginPage.getPasswordField())
    }

    /**
     * Enter username to field
     * @param username
     */
    @Override
    void enterUsername(String username) {
        sendKeys(loginPage.getUsernameField(), username)
    }

    /**
     * Enter password to field
     * @param password
     */
    @Override
    void enterPassword(String password) {
        sendKeys(loginPage.getPasswordField(), password)
    }

    /**
     * Click login button
     */
    @Override
    void clickLogin() {
        click(loginPage.getNextButton())
    }

    /**
     * Click register button
     */
    @Override
    void clickRegister() {
        click(loginPage.getCreateNewAccountButton())
    }

    /**
     * Verifies if username field error is visible
     * @return
     */
    @Override
    boolean isUsernameFieldErrorVisible() {
        return isDisplayed(loginPage.usernameFieldError())
    }

    /**
     * Verifies if password field error is visible
     * @return
     */
    @Override
    boolean isPasswordFieldErrorVisible() {
        return isDisplayed(loginPage.passwordFieldError())
    }

    /**
     * Verifies if toast message error is visible
     * @return
     */
    @Override
    boolean isToastMessagedErrorVisible() {
        return isDisplayed(loginPage.getToastMessage())
    }

    /**
     * Verifies if social buttons group is visible
     * @return
     */
    @Override
    boolean isSocialLoginButtonGroupVisible() {
        return isDisplayed(loginPage.getSocialButtonsGroup())
    }
}
