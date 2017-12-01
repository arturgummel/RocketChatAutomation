package steps

import cucumber.api.groovy.EN
import cucumber.api.groovy.Hooks
import implementation.ActionsImpl
import implementation.RocketTestException

this.metaClass.mixin(Hooks)
this.metaClass.mixin(EN)

Then(~/^register view should be visible$/) { ->
    if (!ActionsImpl.registerActions.isRegisterPageVisible()) {
        throw new RocketTestException("Register page should be visible")
    }
}