

# Version 1.18.0-rc #
_April 9, 2014_

| [New Features in base library](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone%3DVersion1.18.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/jdiff/changes.html) |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * [[Issue 66770043](https://codereview.appspot.com/66770043/)] Fixed wrong behavior of {+var} (with var not a list) in UriTemplate.
  * [[Issue 66770043](https://codereview.appspot.com/66770043/)] Added a convenience factory that builds GoogleJsonResponseException instances for testing.
  * [[Issue 66770043](https://codereview.appspot.com/66770043/)] Fixed test dependency on hash order, which is about to change.

# Version 1.16.0-rc #

_August 5, 2013_

| [New Features in base library](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone%3DVersion1.16.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.16.0-rc/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.16.0-rc/jdiff/changes.html) |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * [[Issue 173](https://code.google.com/p/google-http-java-client/issues/detail?id=173)] Added support for parsing a heterogeneous JSON schema into a polymorphic data type
  * [[Issue 216](https://code.google.com/p/google-http-java-client/issues/detail?id=216)] Added an arbitrary DataStore based on a String key and Serializable value
  * [[Issue 229](https://code.google.com/p/google-http-java-client/issues/detail?id=229)] Updated to JWS draft 11 and JWT draft 8
  * [[Issue 231](https://code.google.com/p/google-http-java-client/issues/detail?id=231)] Removed Beta API deprecated in 1.15 _(backwards incompatible change)_
  * [[Issue 232](https://code.google.com/p/google-http-java-client/issues/detail?id=232)] Fixed two methods that were not Java 5 compatible.


# Version 1.15.0-rc #

_May 10, 2013_

| [New Features in base library](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone%3DVersion1.15.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.15.0-rc/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.15.0-rc/jdiff/changes.html) |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Announcing the first release candidate of the Google HTTP Java Client library!  The library is finally going out of beta.

Note that there are still some features of the library in active development that may require backwards incompatible changes in future releases before they are ready to fully go out of beta.  Each of these features is annotated with a @Beta tag.

Highlights:
  * [[Issue 177](https://code.google.com/p/google-http-java-client/issues/detail?id=177)]: Marked parts of the library as Beta that still may have backwards incompatible changes in the future
  * [[Issue 197](https://code.google.com/p/google-http-java-client/issues/detail?id=197)]: Added a FindBugs plugin to catch usages of @Beta classes and methods
  * [[Issue 211](https://code.google.com/p/google-http-java-client/issues/detail?id=211)]: Removed deprecated API from 1.14 (backwards incompatible)
  * [[Issue 210](https://code.google.com/p/google-http-java-client/issues/detail?id=210)]: Added backoff handlers for IOExceptions and unsuccessful responses
  * [[Issue 206](https://code.google.com/p/google-http-java-client/issues/detail?id=206)]: Created a new Backoff interface and Exponential Backoff implementation
  * [[Issue 205](https://code.google.com/p/google-http-java-client/issues/detail?id=205)]: Added a new Sleeper interface
  * [[Issue 200](https://code.google.com/p/google-http-java-client/issues/detail?id=200)]: NetHttpTransport’s now honors the default global caching behavior
  * [[Issue 189](https://code.google.com/p/google-http-java-client/issues/detail?id=189)]: Updated UriTemplate to RFC 6570
  * [[Issue 187](https://code.google.com/p/google-http-java-client/issues/detail?id=187)]: Fixed a bug where HttpHeader.parse would occasionally fail on AppEngine combined Set-Cookie headers
  * [[Issue 182](https://code.google.com/p/google-http-java-client/issues/detail?id=182)]: Fixed a bug regarding GenericUrl inline authentication being removed
  * [[Issue 110](https://code.google.com/p/google-http-java-client/issues/detail?id=110)]: HttpResponse.parseAs now accepts Void.class to ignore.


# Version 1.14.1-beta #

_Mar 25, 2013_

| [New Features](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone%3DVersion1.14.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.14.1-beta/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.14.1-beta/jdiff/changes.html) |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:

  * [[Issue 176](http://code.google.com/p/google-http-java-client/issues/detail?id=176)]: Added ability to restrict the set of trusted Certificate Authorities
  * [[Issue 191](http://code.google.com/p/google-http-java-client/issues/detail?id=191)]: Implemented JSON Web Token (JWT) and JSON Web Signature (JWS) specifications
  * [[Issue 185](http://code.google.com/p/google-http-java-client/issues/detail?id=185)]: Added an HttpEncoding interface
  * [[Issue 80](http://code.google.com/p/google-http-java-client/issues/detail?id=80)]: Delete some headers on a redirect _(backwards incompatible change)_
  * [[Issue 164](http://code.google.com/p/google-http-java-client/issues/detail?id=164)]: Added a builder to JsonObjectParser to specify a data/error wrapper key
  * [[Issue 140](http://code.google.com/p/google-http-java-client/issues/detail?id=140)]: Removed dependency on Guava library
  * [[Issue 162](http://code.google.com/p/google-http-java-client/issues/detail?id=162)]: Removed some deprecated API from 1.13 _(backwards incompatible change)_
  * [[Issue 178](http://code.google.com/p/google-http-java-client/issues/detail?id=178)]: Moved PrivateKeys from OAuth project to SecurityUtils
  * [[Issue 184](http://code.google.com/p/google-http-java-client/issues/detail?id=184)]: Added a StreamingContent interface
  * [[Issue 63](http://code.google.com/p/google-http-java-client/issues/detail?id=63)]: Generalized MultipartContent so it can be used to replace MultipartRelatedContent
  * [[Issue 167](http://code.google.com/p/google-http-java-client/issues/detail?id=167)]: HttpMethods now supports PATCH
  * [[Issue 143](http://code.google.com/p/google-http-java-client/issues/detail?id=143)]: HttpResponseException now has getContent method
  * [[Issue 80](http://code.google.com/p/google-http-java-client/issues/detail?id=80)] and [[Issue 201](http://code.google.com/p/google-http-java-client/issues/detail?id=201)]: Fixed incorrect relative redirects for URLs with empty paths
  * [[Issue 193](http://code.google.com/p/google-http-java-client/issues/detail?id=193)]: GenericData’s subclass JsonRpcRequest overrides clone()
  * [[Issue 166](http://code.google.com/p/google-http-java-client/issues/detail?id=166)]: GenericData’s set method is overridden by subclasses
  * [[Issue 188](http://code.google.com/p/google-http-java-client/issues/detail?id=188)]: Renamed .classpath to classpath-include
  * [[Issue 186](http://code.google.com/p/google-http-java-client/issues/detail?id=186)]: Renamed dependencies files to match package names


# Version 1.13.1-beta #

_Jan 17, 2013_

| [New Features](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone%3DVersion1.13.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.13.1-beta/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.13.1-beta/jdiff/changes.html) |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:

  * [[Issue 169](http://code.google.com/p/google-http-java-client/issues/detail?id=169)] Fixed EOFException using NetHttpTransport on HEAD request with gzip encoding
  * [[Issue 159](http://code.google.com/p/google-http-java-client/issues/detail?id=159)] Can now set multiple values for the same header (backwards incompatible change)
  * [[Issue 155](http://code.google.com/p/google-http-java-client/issues/detail?id=155)] Constructing a DateTime without specifying the time zone now uses TimeZone.getDefault() (backwards incompatible change)
  * [[[Issue 87](http://code.google.com/p/google-http-java-client/issues/detail?id=87)] Added support for HTTP and SOCKS proxy
  * [[Issue 65](http://code.google.com/p/google-http-java-client/issues/detail?id=65)] Added HttpResponseInterceptor
  * [[Issue 3](http://code.google.com/p/google-http-java-client/issues/detail?id=3)] Provided a way to customize SSL certificate validation

# Version 1.12.0-beta #

_Nov 2, 2012_

| [New Features](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone%3DVersion1.12.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.12.0-beta/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.12.0-beta/jdiff/changes.html) |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:

  * [[Issue 72](http://code.google.com/p/google-http-java-client/issues/detail?id=72)] Supported HTTP methods for WebDAV.
  * [[Issue 73](http://code.google.com/p/google-http-java-client/issues/detail?id=73)] Added support for OPTIONS method.

# Version 1.11.0-beta #

_Sept 5, 2012_

| [New Features](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone%3DVersion1.11.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.11.0-beta/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.11.0-beta/jdiff/changes.html) |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * [[Issue 131](http://code.google.com/p/google-http-java-client/issues/detail?id=131)] Removed deprecated classes/methods/fields from version 1.9 and 1.10.
  * [[Issue 133](http://code.google.com/p/google-http-java-client/issues/detail?id=133)] Made Android project improvements (google-http-client-android).
  * [[Issue 103](http://code.google.com/p/google-http-java-client/issues/detail?id=103)] Added google-http-client-gson and google-http-client-jackson.
  * [[Issue 85](http://code.google.com/p/google-http-java-client/issues/detail?id=85)] Added google-http-client-jackson2 (Jackson 2).
  * [[Issue 102](http://code.google.com/p/google-http-java-client/issues/detail?id=102)] Added google-http-client-protobuf.
  * [[Issue 111](http://code.google.com/p/google-http-java-client/issues/detail?id=111)] Upgraded to latest version of protobuf (2.4.1).
  * [[Issue 147](http://code.google.com/p/google-http-java-client/issues/detail?id=147)] Created properties files for Eclipse Android support.
  * [[Issue 96](http://code.google.com/p/google-http-java-client/issues/detail?id=96)] Added curl logger.
  * [[Issue 53](http://code.google.com/p/google-http-java-client/issues/detail?id=53)] Added support for user-agent customization.
  * [[Issue 145](http://code.google.com/p/google-http-java-client/issues/detail?id=145)] Added “/” to end of rootUrl if not specified.
  * [[Issue 150](http://code.google.com/p/google-http-java-client/issues/detail?id=150)] Improvement to DateTime.equals()
  * [[Issue 17](http://code.google.com/p/google-http-java-client/issues/detail?id=17)] The subclass definition of @Key is now used.
  * [[Issue 142](http://code.google.com/p/google-http-java-client/issues/detail?id=142)] Fixed test failures with Java 7.
  * [[Issue 122](http://code.google.com/p/google-http-java-client/issues/detail?id=122)] Fixed ClassCastException in ApacheHttpRequest.setContent.
  * [[Issue 115](http://code.google.com/p/google-http-java-client/issues/detail?id=115)] Fixed Content-Length in NetHttpTransport.
  * [[Issue 135](http://code.google.com/p/google-http-java-client/issues/detail?id=135)] HttpResponse.parseAs(..) should return null for HTTP Status "204 No Content"


# Version 1.10.3-beta #

_June 25, 2012_

| [Bugs Fixed](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone%3DVersion1.10.3+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.10.3-beta/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.10.3-beta/jdiff/changes.html) |
|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Bugs Fixed:
  * [[Issue 132](http://code.google.com/p/google-http-java-client/issues/detail?id=132)] Added more descriptive error messages in JsonHttpClient.

# Version 1.10.2-beta #

_June 14, 2012_

| [New Features](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone%3DVersion1.10.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.10.2-beta/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.10.2-beta/jdiff/changes.html) |
|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * [[Issue 125](http://code.google.com/p/google-http-java-client/issues/detail?id=125)] Fixed issue of creating UrlFetchTransport in GAE SDK 1.6.6.
  * [[Issue 116](http://code.google.com/p/google-http-java-client/issues/detail?id=116)] Fixed CloseGuard error after EOFException.
  * [[Issue 78](http://code.google.com/p/google-http-java-client/issues/detail?id=78)] Fixed memory leaks.
  * [[Issue 118](http://code.google.com/p/google-http-java-client/issues/detail?id=118)] UriTemplate.expand now supports Iterable for list parameters.
  * [[Issue 117](http://code.google.com/p/google-http-java-client/issues/detail?id=117)] Fixed UriTemplate COMPOSITE\_PREFIXES init problem.
  * [[Issue 41](http://code.google.com/p/google-http-java-client/issues/detail?id=41)] HttpResponse.parseAsString() now respects charset Content-Type parameter.
  * [[Issue 113](http://code.google.com/p/google-http-java-client/issues/detail?id=113)] Added HttpHeaders.fromHttpHeaders.
  * [[Issue 97](http://code.google.com/p/google-http-java-client/issues/detail?id=97)] Added methods setRootUrl and setServicePath to JsonHttpClient.Builder.
  * [[Issue 89](http://code.google.com/p/google-http-java-client/issues/detail?id=89)] HttpHeaders.getContentLength is now a Long instead of a String.
  * [[Issue 104](http://code.google.com/p/google-http-java-client/issues/detail?id=104)] HttpHeaders now has case insensitive get, set and put methods.
  * [[Issue 100](http://code.google.com/p/google-http-java-client/issues/detail?id=100)] Added HttpMediaType.
  * [[Issue 112](http://code.google.com/p/google-http-java-client/issues/detail?id=112)] HttpParser/ObjectParser supports Type and InputStream.
  * [[Issue 126](http://code.google.com/p/google-http-java-client/issues/detail?id=126)] Fixed ExponentialBackOffPolicy.


# Version 1.9.0-beta #

_May 18, 2012_

| [New Features](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone%3DVersion1.9.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.9.0-beta/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.9.0-beta/jdiff/changes.html) |
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * [[Issue 82](http://code.google.com/p/google-http-java-client/issues/detail?id=82)] Fixed the OutOfMemoryError with logging enabled.
  * [[Issue 101](http://code.google.com/p/google-http-java-client/issues/detail?id=101)] Removed xpp3 as a dependency for Android.
  * [[Issue 56](http://code.google.com/p/google-http-java-client/issues/detail?id=56)] Fixed NonRepeatableRequestException when using Apache HTTP Client.
  * [[Issue 98](http://code.google.com/p/google-http-java-client/issues/detail?id=98)] Added [HttpRequest.setLoggingEnabled](http://javadoc.google-http-java-client.googlecode.com/hg/1.9.0-beta/com/google/api/client/http/HttpRequest.html#setLoggingEnabled(boolean)).
  * [[Issue 109](http://code.google.com/p/google-http-java-client/issues/detail?id=109)] Created new structure for jars in the zip package.
  * [[Issue 59](http://code.google.com/p/google-http-java-client/issues/detail?id=59)] Added support for [UnsignedLong](http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/primitives/UnsignedLong.html) and [UnsignedInteger](http://docs.guava-libraries.googlecode.com/git/javadoc/com/google/common/primitives/UnsignedInteger.html) as primitive numeric types.
  * [[Issue 91](http://code.google.com/p/google-http-java-client/issues/detail?id=91)] HTTP response header parsing is now case insensitive.
  * [[Issue 93](http://code.google.com/p/google-http-java-client/issues/detail?id=93)] Added [HttpResponseException.getStatusMessage](http://javadoc.google-http-java-client.googlecode.com/hg/1.9.0-beta/com/google/api/client/http/HttpResponseException.html#getStatusMessage()).
  * [[Issue 86](http://code.google.com/p/google-http-java-client/issues/detail?id=86)] Moved junit to test scope.
  * [[Issue 99](http://code.google.com/p/google-http-java-client/issues/detail?id=99)] Added [GenericUrl.buildAuthority](http://javadoc.google-http-java-client.googlecode.com/hg/1.9.0-beta/com/google/api/client/http/GenericUrl.html#buildAuthority()) and [GenericUrl.buildRelativeUrl](http://javadoc.google-http-java-client.googlecode.com/hg/1.9.0-beta/com/google/api/client/http/GenericUrl.html#buildRelativeUrl()).
  * [[Issue 90](http://code.google.com/p/google-http-java-client/issues/detail?id=90)] Generalized dependency instructions for non-Android.
  * [[Issue 83](http://code.google.com/p/google-http-java-client/issues/detail?id=83)] Handled connection failures in [HttpRequest](http://javadoc.google-http-java-client.googlecode.com/hg/1.9.0-beta/com/google/api/client/http/HttpRequest.html).
  * [[Issue 81](http://code.google.com/p/google-http-java-client/issues/detail?id=81)] Added [HttpResponse.download](http://javadoc.google-http-java-client.googlecode.com/hg/1.9.0-beta/com/google/api/client/http/HttpResponse.html#download(java.io.OutputStream)).
  * [[Issue 95](http://code.google.com/p/google-http-java-client/issues/detail?id=95)] Removed deprecated classes/methods/fields from version 1.8.

# Version 1.8.3-beta #

_April 4, 2012_

| [New Features](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone%3DVersion1.8.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.8.3-beta/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.8.3-beta/jdiff/changes.html) |
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * [[Issue 75](http://code.google.com/p/google-http-java-client/issues/detail?id=75)] Solved the common-codecs conflict on Android.
  * [[Issue 76](http://code.google.com/p/google-http-java-client/issues/detail?id=76)] Added executeAsInputStream in [JsonHttpRequest](http://javadoc.google-http-java-client.googlecode.com/hg/1.8.3-beta/com/google/api/client/http/json/JsonHttpRequest.html#executeAsInputStream()) and [JsonHttpClient](http://javadoc.google-http-java-client.googlecode.com/hg/1.8.3-beta/com/google/api/client/http/json/JsonHttpClient.html#executeAsInputStream(com.google.api.client.http.HttpMethod,%20com.google.api.client.http.GenericUrl,%20java.lang.Object)).
  * [[Issue 79](http://code.google.com/p/google-http-java-client/issues/detail?id=79)] [JacksonFactory.createJsonParser](http://javadoc.google-http-java-client.googlecode.com/hg/1.8.3-beta/com/google/api/client/json/jackson/JacksonFactory.html) now throws NPE on null inputs.
  * [[Issue 62](http://code.google.com/p/google-http-java-client/issues/detail?id=62)] Warn if there is no application name specified.

# Version 1.7.0-beta #

_Mar 12, 2012_

| [New Features](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone%3DVersion1.7.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.7.0-beta/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.7.0-beta/jdiff/changes.html) |
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * [[Issue 43](http://code.google.com/p/google-http-java-client/issues/detail?id=43)] Can now provide a limit to the amount of content to log.
  * [[Issue 61](http://code.google.com/p/google-http-java-client/issues/detail?id=61)] Fixed resource leak in GZipContent.writeTo.
  * [[Issue 69](http://code.google.com/p/google-http-java-client/issues/detail?id=69)] Renamed extension projects to be more intuitive.
  * [[Issue 52](http://code.google.com/p/google-http-java-client/issues/detail?id=52)] Deprecated classes/methods/fields from version 1.6 have been removed.

# Version 1.6.0-beta #

_Nov 8, 2011_

| [New Features](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone%3DVersion1.6.0+status%3DFixed&colspec=ID+Type+Priority+Summary&x=component&y=milestone&cells=tiles) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.6.0-beta/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.6.0-beta/jdiff/changes.html) |
|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Highlights:
  * [HttpRequest](http://javadoc.google-http-java-client.googlecode.com/hg/1.6.0-beta/com/google/api/client/http/HttpRequest.html) now automatically follows redirects.
  * Addition of a URI template implementation that supports Level 1 templates and all Level 4 composite templates.
  * Addition of a new JSON HTTP layer ([JsonHttpClient](http://javadoc.google-http-java-client.googlecode.com/hg/1.6.0-beta/com/google/api/client/http/json/JsonHttpClient.html), [JsonHttpRequest](http://javadoc.google-http-java-client.googlecode.com/hg/1.6.0-beta/com/google/api/client/http/json/JsonHttpRequest.html)) that can be used to build easy-to-use generated libraries like the ones for Google APIs.
    * Addition of [JsonHttpRequestInitializer](http://javadoc.google-http-java-client.googlecode.com/hg/1.6.0-beta/com/google/api/client/http/json/JsonHttpRequestInitializer.html) to initialize JSON HTTP requests. E.g for setting global parameters.
  * Users can now provide a custom implementation of HttpClient to [ApacheHttpTransport](http://javadoc.google-http-java-client.googlecode.com/hg/1.6.0-beta/com/google/api/client/http/apache/ApacheHttpTransport.html). E.g for setting up a proxy.

# Version 1.5.3-beta #

| [Bugs Fixed](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone=Version1.5.3%20status=Fixed&colspec=ID%20Type%20Priority%20Summary) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.5.3-beta/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.5.3-beta/jdiff/changes.html) |
|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Bugs Fixed:
  * [[Issue 23](http://code.google.com/p/google-http-java-client/issues/detail?id=23)] NullPointerException when non-top-level element declares a new namespace and uses it

# Version 1.5.0-beta #

| [New Features](http://code.google.com/p/google-http-java-client/issues/list?can=1&q=milestone=Version1.5.0%20status=Fixed&colspec=ID%20Type%20Priority%20Summary) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/1.5.0-beta/index.html) | [JDiff](http://javadoc.google-http-java-client.googlecode.com/hg/1.5.0-beta/jdiff/changes.html) |
|:----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

Announcing the release of the new [Google HTTP Client Library for Java project](http://code.google.com/p/google-http-java-client) split off from the [Google API Client Library for Java project](http://code.google.com/p/google-api-java-client)!  It contains the core packages that should work with any HTTP REST service on the web.

# Version 1.4.1-beta #

See [Version 1.4.1-beta Release Notes from Google API Client Library for Java](http://code.google.com/p/google-api-java-client/wiki/ReleaseNotes#Version_1.4.1-beta).