final class HttpRequest {

    private String url;
    private String method;
    private int statusCode;
    private String body;

    private HttpRequest(HttpRequestBuilder builder){
        this.url = builder.url;
        this.method = builder.method;
        this.statusCode = builder.statusCode;
        this.body = builder.body;
    }

    public static class HttpRequestBuilder{
        private String url;
        private String method;
        private int statusCode;
        private String body;

        public HttpRequestBuilder url(String url){
            this.url = url;
            return this;
        }
        public HttpRequestBuilder method(String method){
            this.method = method;
            return this;
        }

        public HttpRequestBuilder statusCode(int statusCode){
            this.statusCode = statusCode;
            return this;
        }
        public HttpRequestBuilder body(String body){
            this.body = body;
            return this;
        }

        public HttpRequest build(){
            return new HttpRequest(this);
        }
    }

    @Override
    public String toString(){
        return "Request Sent with url : " + this.url + ", method : " + this.method + ", statusCode : " + this.statusCode + ", body : " + this.body;
    }


}
