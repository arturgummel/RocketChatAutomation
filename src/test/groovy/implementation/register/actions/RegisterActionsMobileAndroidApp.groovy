package implementation.register.actions

import implementation.register.pages.RegisterPage
import io.cify.framework.actions.ActionsMobileAndroidApp
import io.cify.framework.core.Device


class RegisterActionsMobileAndroidApp implements IRegisterActions, ActionsMobileAndroidApp {

    Device device
    RegisterPage registerPage

    RegisterActionsMobileAndroidApp(Device device) {
        this.device = device
        this.registerPage = new RegisterPage(device)
    }

    /**
     * Verifies if login page is visible
     * @return
     */
    @Override
    boolean isRegisterPageVisible() {
        return isDisplayed(registerPage.getEmailField()) &&
                isDisplayed(registerPage.getUsernameField()) &&
                isDisplayed(registerPage.getPasswordField())
    }
}
