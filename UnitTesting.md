When writing unit tests using this HTTP framework, don't make requests to a real server. Instead, mock the HTTP transport and inject fake HTTP requests and responses. The [pluggable HTTP transport layer](HTTP.md) of the Google HTTP Client Library for Java makes this flexible and simple to do.

Also, some useful testing utilities are included in the [com.google.api.client.testing.http](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/testing/http/package-summary.html) package ([@Beta](https://code.google.com/p/google-api-java-client/#@Beta)).

The following simple example generates a basic `HttpResponse`:

```
HttpTransport transport = new MockHttpTransport();
HttpRequest request = transport.createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
HttpResponse response = request.execute();
```

The following example shows how to override the implementation of the `MockHttpTransport` class:

```
HttpTransport transport = new MockHttpTransport() {
  @Override
  public LowLevelHttpRequest buildRequest(String method, String url) throws IOException {
    return new MockLowLevelHttpRequest() {
      @Override
      public LowLevelHttpResponse execute() throws IOException {
        MockLowLevelHttpResponse response = new MockLowLevelHttpResponse();
        response.addHeader("custom_header", "value");
        response.setStatusCode(404);
        response.setContentType(Json.CONTENT_TYPE);
        response.setContent("{\"error\":\"not found\"}");
        return response;
      }
    };
  }
};
HttpRequest request = transport.createRequestFactory().buildGetRequest(HttpTesting.SIMPLE_GENERIC_URL);
HttpResponse response = request.execute();
```

For more examples, see the [HttpResponseTest.java](http://code.google.com/p/google-http-java-client/source/browse/google-http-client/src/test/java/com/google/api/client/http/HttpResponseTest.java) and [HttpRequestTest.java](http://code.google.com/p/google-http-java-client/source/browse/google-http-client/src/test/java/com/google/api/client/http/HttpRequestTest.java) files.