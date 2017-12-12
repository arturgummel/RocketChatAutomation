package steps

import cucumber.api.groovy.EN
import cucumber.api.groovy.Hooks
import implementation.ActionsImpl
import io.cify.framework.core.Device
import io.cify.framework.core.DeviceCategory
import io.cify.framework.core.DeviceManager

this.metaClass.mixin(Hooks)
this.metaClass.mixin(EN)

Given(~/^user opens (.+) application$/) { DeviceCategory category ->
    DeviceManager.getInstance().createDevice(category)
    ActionsImpl.getCoreActions().openApplication()
}

When(~/^user opens "([^"]*)" url$/) { String url ->
    DeviceManager.getInstance().getActiveDevice(DeviceCategory.BROWSER).getDriver().get(url)
}

Given(~/^user open (.+) and (.+) applications$/) { DeviceCategory category1, DeviceCategory category2  ->
    DeviceManager.getInstance().createDevice(category1)
    DeviceManager.getInstance().createDevice(category2)
    List<Device> deviceList = DeviceManager.getInstance().getAllActiveDevices()
    for(Device device: deviceList) {
        ActionsImpl.getCoreActionsForAll(device).openApplication()
    }
}
When(~/^user opens in devices "([^"]*)" url$/) { String url ->
    List<Device> deviceList = DeviceManager.getInstance().getAllActiveDevices()
    for(Device device: deviceList) {
        String category = device.category.name()
        if (category.equals("ANDROID")) {
            ActionsImpl.getHostActionsForAll(device).enterHostname(url)
            ActionsImpl.getHostActionsForAll(device).submit()
        } else if (category.equals("BROWSER")) {
            println("category")
            DeviceManager.getInstance().getActiveDevice(DeviceCategory.BROWSER).getDriver().get(url)
        }
    }
}

After {
    DeviceManager.getInstance().quitAllDevices()
}
