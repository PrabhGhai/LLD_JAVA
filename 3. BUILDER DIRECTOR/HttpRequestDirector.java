public class HttpRequestDirector {

    public static String postMethod(String url , String body)
    {
        HttpRequest http = new HttpRequest.HttpRequestBuilder()
                .url(url)
                .method("POST")
                .body(body)
                .statusCode(200)
                .build();
        return http.toString();
    }
}
