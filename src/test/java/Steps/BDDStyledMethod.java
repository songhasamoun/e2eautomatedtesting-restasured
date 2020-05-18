package Steps;

import io.restassured.http.ContentType;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class BDDStyledMethod {

    public static void SimpleGETPost(String postNumber) {
        given().contentType(ContentType.JSON).
                when().get(String.format("http://localhost:3000/posts/%s", postNumber)).
                then().body("author", is("Sam Oun"));
    }

    public static void PerformContainsCollection() {
        given()
            .contentType(ContentType.JSON)
        .when()
            .get("http://localhost:3000/posts")
        .then()
                .body("author", containsInAnyOrder("typicode", "Sam Oun", "ExecuteAutomation", "ExecuteAutomation"));
    }

    public static void PerformPathParameter() {
        given()
                .contentType(ContentType.JSON).
        with()
                .pathParam("post", 2).
        when()
                .get("http://localhost:3000/posts/{post}").
        then()
                .body("author", containsString("Sam Oun"));
    }

    public static void PerformQueryParameter() {
        given()
                .contentType(ContentType.JSON)
                .pathParam("id", 2).
        when()
                .get("http://localhost:3000/posts/").
        then()
                .body("author", hasItem("Sam Oun"));
    }
}
