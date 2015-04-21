This library has a fully pluggable HTTP transport layer that allows you to build on top of the low-level HTTP of your choice and optimize for the Java platform your application is running on. Thanks to this abstraction, code written for one platform will automatically work across all supported platforms, from mobile applications (e.g. Android) to installed applications to web applications (e.g. Google App Engine). The goal of this library is to provide high-level functionality that is compatible across of those platforms, but at the same time be able to take advantage of lower-level functionality when necessary.



# Pluggable HTTP Transport #

A big advantage of this HTTP library is that the choice of low-level HTTP transport library is fully pluggable. There are three built-in choices:
  * [NetHttpTransport](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/http/javanet/NetHttpTransport.html): based on [HttpURLConnection](http://docs.oracle.com/javase/6/docs/api/java/net/HttpURLConnection.html) that is found in all Java SDKs, and thus usually the simplest choice.
  * [ApacheHttpTransport](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/http/apache/ApacheHttpTransport.html): based on the popular [Apache HttpClient](http://hc.apache.org/httpcomponents-client-ga/index.html) that allows for more customization.
  * [UrlFetchTransport](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/extensions/appengine/http/UrlFetchTransport.html): based on the [URL Fetch Java API](https://developers.google.com/appengine/docs/java/javadoc/com/google/appengine/api/urlfetch/package-summary) in the Google App Engine SDK.

## Logging ##

We use [java.util.logging.Logger](http://docs.oracle.com/javase/7/docs/api/java/util/logging/Logger.html) for logging HTTP request and response details, including URL, headers, and content.

Normally logging is managed using a [logging.properties](http://code.google.com/p/google-http-java-client/source/browse/googleplus-simple-cmdline-sample/logging.properties?repo=samples) file.  For example:

```
# Properties file which configures the operation of the JDK logging facility.
# The system will look for this config file to be specified as a system property: 
# -Djava.util.logging.config.file=${project_loc:googleplus-simple-cmdline-sample}/logging.properties

# Set up the console handler (uncomment "level" to show more fine-grained messages) 
handlers = java.util.logging.ConsoleHandler
java.util.logging.ConsoleHandler.level = CONFIG

# Set up logging of HTTP requests and responses (uncomment "level" to show)
com.google.api.client.http.level = CONFIG
```

Here we use [ConsoleHandler](http://docs.oracle.com/javase/7/docs/api/java/util/logging/ConsoleHandler.html). Another popular choice is [FileHandler](http://docs.oracle.com/javase/7/docs/api/java/util/logging/FileHandler.html).

Example for enabling logging in code:

```
import com.google.api.client.http.HttpTransport;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public static void enableLogging() {
  Logger logger = Logger.getLogger(HttpTransport.class.getName());
  logger.setLevel(Level.CONFIG);
  logger.addHandler(new Handler() {

    @Override
    public void close() throws SecurityException {
    }

    @Override
    public void flush() {
    }

    @Override
    public void publish(LogRecord record) {
      // default ConsoleHandler will print >= INFO to System.err
      if (record.getLevel().intValue() < Level.INFO.intValue()) {
        System.out.println(record.getMessage());
      }
    }
  });
}
```

Note: when using Level.CONFIG the value of the Authorization header is not shown. To show that also, use Level.ALL instead.

## Handling HTTP Error Responses ##

When an HTTP error response is received -- i.e. error code >= 300 -- [HttpRequest.execute()](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/http/HttpRequest.html#execute()) will throw an [HttpResponseException](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/http/HttpResponseException.html). Here's an example usage:

```
try {
  request.execute()
} catch (HttpResponseException e) {
  System.err.println(e.getStatusMessage());
}
```


If you need to intercept error responses, it may be handy to use the [HttpUnsuccessfulResponseHandler](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/http/HttpUnsuccessfulResponseHandler.html). Example usage:

```
public static class MyInitializer implements HttpRequestInitializer, HttpUnsuccessfulResponseHandler {

  @Override
  public boolean handleResponse(
      HttpRequest request, HttpResponse response, boolean retrySupported) throws IOException {
    System.out.println(response.getStatusCode() + " " + response.getStatusMessage());
    return false;
  }

  @Override
  public void initialize(HttpRequest request) throws IOException {
    request.setUnsuccessfulResponseHandler(this);
  }
}

...

HttpRequestFactory requestFactory = transport.createRequestFactory(new MyInitializer());
```