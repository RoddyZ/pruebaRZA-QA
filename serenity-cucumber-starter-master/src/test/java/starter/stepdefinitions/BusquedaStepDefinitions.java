package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.Actor;
import starter.navigation.NavigateTo;
public class BusquedaStepDefinitions {

    @Given("{actor} ingresa a la aplicacion Swag Labs")
    public void researchingThings(Actor actor) {
        actor.wasAbleTo(NavigateTo.theSaucedemoHomePage());
    }

}
