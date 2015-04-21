| [Developer's Guide](DeveloperGuide.md) | [Setup Instructions](Setup.md) | [JavaDoc](http://javadoc.google-http-java-client.googlecode.com/hg/index.html) | [Release Notes](ReleaseNotes.md) | [Support (Questions, Bugs)](Support.md) |
|:--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|

# Google HTTP Client Library for Java  #

<font color='red'><b>This has moved to GitHub:</b></font> https://github.com/google/google-http-java-client

_Issues have been migrated to the [GitHub issue tracker](https://github.com/google/google-http-java-client/issues). If you own an open issue on this site, you can find a copy of it on GitHub. Please leave your comments over there._

Written by Google, the Google HTTP Client Library for Java is a flexible, efficient, and powerful Java library for accessing any resource on the web via HTTP. The library has the following features:
  * Pluggable HTTP transport abstraction that allows you to use any low-level library such as java.net.HttpURLConnection, Apache HTTP Client, or URL Fetch on Google App Engine.
  * Efficient JSON and XML data models for parsing and serialization of HTTP response and request content.  The JSON and XML libraries are also fully pluggable, and they include support for [Jackson](https://github.com/FasterXML/jackson) and Android's GSON libraries for JSON.

The library supports the following Java environments:
  * Java 5 (or higher), standard (SE) and enterprise (EE)
  * [Android 1.5 (or higher)](Android.md)
  * [Google App Engine](GoogleAppEngine.md)

The following related projects  are built on the Google HTTP Client Library for Java:
  * [Google OAuth Client Library for Java](http://code.google.com/p/google-oauth-java-client/), for the OAuth 2.0 and OAuth 1.0a authorization standards.
  * [Google APIs Client Library for Java](http://code.google.com/p/google-api-java-client/), for access to Google APIs.

This is an [open-source](http://code.google.com/p/google-http-java-client/source/browse/) library, and [contributions](BecomingAContributor.md) are welcome.


<wiki:gadget url="https://google-code-feed-gadget.googlecode.com/svn/build/prod/feedgadget/feedgadget.xml" up\_feeds="https://google-http-java-client.blogspot.com/feeds/posts/default" width="500" height="340" border="0"/>