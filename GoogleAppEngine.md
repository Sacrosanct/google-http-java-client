Google App Engine is one of the supported Java environments for the Google HTTP Client Library for Java.

# Installation #

Follow the [download instructions](Setup#Download_Library_with_Dependencies.md) and put the Google HTTP Client Library for Java .jar files into your war/WEB-INF/lib directory. Alternatively, you can use [Maven](Setup#Maven.md).

# Data Models #

**JSON**<br />The [JSON data model](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/json/package-summary.html) is optimized for efficient memory usage that minimizes parsing and serialization time.  Only the fields you need are actually parsed when processing a JSON response.

For your JSON parser, we recommend [JacksonFactory](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/json/jackson/JacksonFactory.html), which is based on the popular [Jackson](http://jackson.codehaus.org/) library.  It is considered the fastest in terms of parsing/serialization.  You can also use [GsonFactory](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/json/gson/GsonFactory.html), which is based on the [Google GSON](http://code.google.com/p/google-gson/) library. It is a lighter-weight option (smaller size) that is fairly fast, but it is not quite as fast as Jackson.

**XML ([@Beta](https://code.google.com/p/google-api-java-client/#@Beta))**<br />The [XML data model](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/xml/package-summary.html) is optimized for efficient memory usage that minimizes parsing and serialization time.  Only the fields you need are actually parsed when processing an XML response.

# HTTP Transport #

The only supported HTTP transport on Google App Engine is [UrlFetchTransport](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/extensions/appengine/http/UrlFetchTransport.html), which is based on the [URL Fetch Java API](https://developers.google.com/appengine/docs/java/javadoc/com/google/appengine/api/urlfetch/package-summary) in the Google App Engine SDK.

| **Note:** Do _not_ try [ApacheHttpTransport](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/http/apache/ApacheHttpTransport.html), because it will definitely fail on Google App Engine. |
|:-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|