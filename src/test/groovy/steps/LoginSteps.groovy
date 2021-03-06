package steps

import cucumber.api.groovy.EN
import cucumber.api.groovy.Hooks
import implementation.ActionsImpl
import implementation.RocketTestException
import io.cify.framework.core.Device
import io.cify.framework.core.DeviceManager

/**
 * Created by FOB Solutions
 */

this.metaClass.mixin(Hooks)
this.metaClass.mixin(EN)

Then(~/^login view should be visible$/) { ->
    if (!ActionsImpl.getLoginActions().isLoginPageVisible()) {
        throw new RocketTestException("Login page should be visible")
    }
}

And(~/^user clicks on login button$/) { ->
    ActionsImpl.getLoginActions().clickLogin();
}

And(~/^user clicks on register button$/) { ->
    ActionsImpl.getLoginActions().clickRegister();
}

And(~/^user types "(.+)" username$/) { String username ->
    ActionsImpl.getLoginActions().enterUsername(username);
}

And(~/^user types "(.+)" password/) { String password ->
    ActionsImpl.getLoginActions().enterPassword(password);
}

Then(~/^username error message should be visible$/) { ->
    if (!(ActionsImpl.getLoginActions().isUsernameFieldErrorVisible())) {
        throw new RocketTestException("Username error should be visible");
    }
}

Then(~/^password error message should be visible$/) { ->
    if (!(ActionsImpl.getLoginActions().isPasswordFieldErrorVisible())) {
        throw new RocketTestException("Password error should be visible")
    }
}

Then(~/^toast message error should be visible$/) { ->
    println(ActionsImpl.getLoginActions().isToastMessagedErrorVisible())
    if (!(ActionsImpl.getLoginActions().isToastMessagedErrorVisible())) {
        throw new RocketTestException("User not found or incorrect password toast message should be visible")
    }
}

Then(~/^login view is visible for all$/) { ->
    List<Device> deviceList = DeviceManager.getInstance().getAllActiveDevices();
    for(Device device: deviceList) {
        if (!ActionsImpl.getLoginActions().isLoginPageVisible()) {
            throw new RocketTestException("Login page is not visible for " + device.category.name())
        }
    }
}

Then(~/^social buttons group should be visible$/) { ->
    List<Device> deviceList = DeviceManager.getInstance().getAllActiveDevices();
    for(Device device: deviceList) {
        if (!ActionsImpl.getLoginActions().isSocialLoginButtonGroupVisible()) {
            throw new RocketTestException("Social Login buttons group is not visible for " + device.category.name())
        }
    }
}