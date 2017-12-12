package implementation.login.actions

/**
 * Created by FOB Solutions
 */
interface ILoginActions {

    /**
     * Verifies if login page is visible
     * @return
     */
    boolean isLoginPageVisible()

    /**
     * Enter username to field
     * @param username
     */
    void enterUsername(String username)

    /**
     * Enter password to field
     * @param password
     */
    void enterPassword(String password)

    /**
     * Click login button
     */
    void clickLogin()

    /**
     * Click register button
     */
    void clickRegister()

    /**
     * Verifies if username field error is visible
     * @return
     */
    boolean isUsernameFieldErrorVisible()

    /**
     * Verifies if password field error is visible
     * @return
     */
    boolean isPasswordFieldErrorVisible()

    /**
     * Verifies if toast message error is visible
     * @return
     */
    boolean isToastMessagedErrorVisible()

    /**
     * Verifies if social buttons group is visible
     * @return
     */
    boolean isSocialLoginButtonGroupVisible()
}