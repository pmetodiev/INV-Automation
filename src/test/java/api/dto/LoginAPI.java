package api.dto;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LoginAPI {
    private static final Gson GSON=new GsonBuilder().setPrettyPrinting().create();
    private static final String BASE_URI= "https://pm-eood.inv.bg";
    private static final String BASE_PATH="/v3/";
    private static final String LOGIN_URI= "https:/login/token";

    public static String getBearerToken(String email, String password, String domain){
        LoginCredentials credentials = new LoginCredentials(email, password, domain);
        RestAssured.baseURI = BASE_URI; //Sets the base uri
        RestAssured.basePath = BASE_PATH; //Sets the base path
        Response loginResp = RestAssured.given()
                .contentType(ContentType.JSON)
                .log().all()
                 .body(GSON.toJson(credentials))
                .when()
                .post(LOGIN_URI)
                .prettyPeek();
        String body = loginResp.body().asString();
        String token= GSON.fromJson(body, LoginResp.class).token;
        return token;
    }


    public static void main(String[] args) {
       String token= getBearerToken("plamen478@gmail.com","parola123!","pm-eood");
        System.out.println("The toke is:"+ token);
    }
}
