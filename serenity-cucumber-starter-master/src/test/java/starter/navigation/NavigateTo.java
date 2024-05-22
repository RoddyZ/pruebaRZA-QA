package starter.navigation;

import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo {
    public static Performable theSaucedemoHomePage() {
        return Task.where("{0} opens the Saucedemo home page",
                Open.browserOn().the(SaucedemoHomePage.class));
    }
}
