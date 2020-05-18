package Steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;

public class GETPostSteps {
    @Given("I perform GET operation for \"([^\"]*)\"$")
    public void iPerformGETOperationFor(String url) {
        given().contentType(ContentType.JSON);
    }

    @And("I perform GET for the post number \"([^\"]*)\"$")
    public void iPerformGETForThePostNumber(String postNumber) {
        BDDStyledMethod.SimpleGETPost(postNumber);
    }

    @Then("I should see the author name as {string}")
    public void iShouldSeeTheAuthorNameAs(String arg0) {
    }

    @Then("I should see the author names$")
    public void iShouldSeeTheAuthorNames() {
        BDDStyledMethod.PerformContainsCollection();
    }

    @Then("I should see verify GET Parameter$")
    public void iShouldSeeVerifyGETParameter() {
        BDDStyledMethod.PerformPathParameter();
    }
}
