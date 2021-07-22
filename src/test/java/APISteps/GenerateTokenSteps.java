package APISteps;

import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.RequestSpecification;
import org.junit.Test;
import utils.apiConstants;

import static io.restassured.RestAssured.given;

public class GenerateTokenSteps {
    static String token;

    @Given("a JWT is generated")
    public void a_jwt_is_generated() {
        RequestSpecification generateTokenRequest = given().header("Content-Type","application/json").body("{\n" +
                "   \n" +
                "  \"email\": \"jamala_1234@gmail.com\",\n" +
                "  \"password\": \"Satara.123@124\"\n" +
                "}");
        Response generateTokenResponse = generateTokenRequest.when().post(apiConstants.GENERATE_TOKEN_URI);
        generateTokenResponse.prettyPrint();

        token="Bearer "+generateTokenResponse.jsonPath().getString("token");
    }
}
