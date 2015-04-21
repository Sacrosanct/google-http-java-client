You can download the Google HTTP Client Library for Java and its dependencies in a zip file, or you can use Maven.



# Download the Library with Dependencies #

Download the latest zip file, which you can find on the [Downloads page](Downloads.md), and extract it on your computer. This zip file contains the client library class .jar files and the associated source .jar files for each artifact and their dependencies. You can find dependency graphs and licenses for the different libraries in the dependencies folder. For more details about the contents of the download, see the readme.html file.

## Eclipse ##

If you use [Eclipse](http://www.eclipse.org), set the "Source attachment" for each class .jar file to its corresponding "-sources" .jar file.

## Android ##

If you are developing for Android and the Google API you want to use is included in the [Google Play Services library](https://developer.android.com/google/play-services/index.html), use that library for the best performance and experience.

If you are using the Google HTTP Client Library for Java with Android, it is important to know which dependencies are compatible with Android, specifically which SDK level. Android applications require the following .jar files, or newer compatible versions, from the libs folder:
  * google-http-client-1.18.0-rc.jar
  * google-http-client-android-1.18.0-rc.jar
  * gson-2.1.jar
  * jackson-core-2.1.3.jar
  * jackson-core-asl-1.9.11.jar
  * jsr305-1.3.9.jar
  * protobuf-java-2.4.1.jar

**WARNING:** For Android, you MUST place the .jar files in a directory named "libs" so that the APK packager can find them. Otherwise, you will get a `NoClassDefFoundError` error at runtime.

## Google App Engine ##

Google App Engine applications require the following .jar files, or newer compatible versions, from the libs folder:
  * google-http-client-1.18.0-rc.jar
  * google-http-client-appengine-1.18.0-rc.jar
  * gson-2.1.jar
  * jackson-core-2.1.3.jar
  * jackson-core-asl-1.9.11.jar
  * jsr305-1.3.9.jar
  * protobuf-java-2.4.1.jar
  * xpp3-1.1.4c.jar

## Generic Java ##

General purpose Java 5 applications require the following .jar files, or newer compatible versions, from the libs folder:
  * google-http-client-1.18.0-rc.jar
  * commons-logging-1.1.1.jar
  * gson-2.1.jar
  * httpclient-4.0.1.jar
  * httpcore-4.0.1.jar
  * jackson-core-2.1.3.jar
  * jackson-core-asl-1.9.11.jar
  * jsr305-1.3.9.jar
  * protobuf-java-2.4.1.jar
  * xpp3-1.1.4c.jar

# Maven #

The Google APIs Client Library for Java is in the central [Maven](http://maven.apache.org) repository. The Maven `groupId` for all artifacts for this library is `com.google.api-client`. Specific Maven instructions are given for each module (below).

If you use [Eclipse](http://www.eclipse.org), install the [Maven plugin](http://www.eclipse.org/m2e/). Also make sure to set your Eclipse preferences as follows:
  1. Within Eclipse, select **Window > Preferences** (or on Mac, **Eclipse > Preferences**).
  1. Select **Maven** and select the following options:
    * "Download Artifact Sources"
    * "Download Artifact JavaDoc"

# Modules #

This library is composed of nine modules: [google-http-client](#google-http-client.md), [google-http-client-android](#google-http-client-android.md), [google-http-client-appengine](#google-http-client-appengine.md), [google-http-client-xml](#google-http-client-xml.md), [google-http-client-protobuf](#google-http-client-protobuf.md), [google-http-client-jdo](#google-http-client-jdo.md), [google-http-client-jackson](#google-http-client-jackson.md), [google-http-client-jackson2](#google-http-client-jackson2.md), and [google-http-client-gson](#google-http-client-gson.md).

## google-http-client ##

Google HTTP Client Library for Java (google-http-client) is designed to be compatible with all supported Java platforms, including Android.

Maven usage:

```
<dependency>
  <groupId>com.google.http-client</groupId>
  <artifactId>google-http-client</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```

On Android, you will need to explicitly exclude unused dependencies:

```
<dependency>
  <groupId>com.google.http-client</groupId>
  <artifactId>google-http-client</artifactId>
  <version>1.18.0-rc</version>
  <exclusions>
    <exclusion>
      <artifactId>xpp3</artifactId>
      <groupId>xpp3</groupId>
    </exclusion>
    <exclusion>
      <artifactId>httpclient</artifactId>
      <groupId>org.apache.httpcomponents</groupId>
    </exclusion>
    <exclusion>
      <artifactId>junit</artifactId>
      <groupId>junit</groupId>
    </exclusion>
    <exclusion>
      <artifactId>android</artifactId>
      <groupId>com.google.android</groupId>
    </exclusion>
  </exclusions>
</dependency>
```

## google-http-client-android ##

Android extensions to the Google HTTP Client Library for Java (google-http-client-android) support Java Google Android (only for SDK >= 2.1) applications. This module depends on google-http-client.

Maven usage:

```
<dependency>
  <groupId>com.google.http-client</groupId>
  <artifactId>google-http-client-android</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```

## google-http-client-appengine ##

Google App Engine extensions to the Google HTTP Client Library for Java (google-http-client-appengine) support Java Google App Engine applications. This module depends on google-http-client.

Maven usage:

```
<dependency>
  <groupId>com.google.http-client</groupId>
  <artifactId>google-http-client-appengine</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```

## google-http-client-xml ##

[@Beta](https://code.google.com/p/google-api-java-client/#@Beta)

XML extensions to the Google HTTP Client Library for Java (google-http-client-xml) support the XML data format. This module depends on google-http-client.

Maven usage:

```
<dependency>
  <groupId>com.google.http-client</groupId>
  <artifactId>google-http-client-xml</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```

## google-http-client-protobuf ##

[@Beta](https://code.google.com/p/google-api-java-client/#@Beta)

[Protocol buffer](https://developers.google.com/protocol-buffers/docs/overview) extensions to the Google HTTP Client Library for Java (google-http-client-protobuf) support protobuf data format. This module depends on google-http-client.

Maven usage:

```
<dependency>
  <groupId>com.google.http-client</groupId>
  <artifactId>google-http-client-protobuf</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```

## google-http-client-jdo ##

JDO extension to the Google HTTP Client Library for Java (google-http-client-jdo) that contains an implementation of [DataStoreFactory](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/util/store/DataStoreFactory.html) based on the [JDO API](http://db.apache.org/jdo/). This module depends on google-http-client.

Maven usage:

```
<dependency>
  <groupId>com.google.http-client</groupId>
  <artifactId>google-http-client-jdo</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```

## google-http-client-jackson ##

Jackson extension to the Google HTTP Client Library for Java (google-http-client-jackson) that contains an implementation of [JsonFactory](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/json/JsonFactory.html) based on the [Jackson API](http://jackson.codehaus.org/). This module depends on google-http-client.

Maven usage:

```
<dependency>
  <groupId>com.google.http-client</groupId>
  <artifactId>google-http-client-jackson</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```

## google-http-client-jackson2 ##

Jackson2 extension to the Google HTTP Client Library for Java (google-http-client-jackson2) that contains an implementation of [JsonFactory](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/json/JsonFactory.html) based on the [Jackson2 API](http://jackson.codehaus.org/). This module depends on google-http-client.

Maven usage:

```
<dependency>
  <groupId>com.google.http-client</groupId>
  <artifactId>google-http-client-jackson2</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```

## google-http-client-gson ##

GSON extension to the Google HTTP Client Library for Java (google-http-client-gson) that contains an implementation of [JsonFactory](http://javadoc.google-http-java-client.googlecode.com/hg/1.18.0-rc/com/google/api/client/json/JsonFactory.html) based on the [GSON API](https://code.google.com/p/google-gson/). This module depends on google-http-client.

Maven usage:

```
<dependency>
  <groupId>com.google.http-client</groupId>
  <artifactId>google-http-client-gson</artifactId>
  <version>1.18.0-rc</version>
</dependency>
```

# ProGuard #

On Android and other environments where application size is critical, we strongly encourage you to use [ProGuard](http://proguard.sourceforge.net) to reduce the size of the release build. ProGuard strips out unused code and does optimizations so that the code compiles as small as possible; however, it comes at the cost of slightly increased complexity in development.

There is an Android ProGuard example in the [Calendar v3 Android Sample](http://code.google.com/p/google-api-java-client/source/browse?repo=samples#hg/calendar-android-sample) within the Google APIs Java client library. In that sample application, ProGuard reduces the application size ~95%, from 2.3MB to 124KB.

If you use ProGuard, make sure to add the following line to the [build.gradle](https://code.google.com/p/google-api-java-client/source/browse/calendar-android-sample/build.gradle?repo=samples) file:

```
buildTypes {
  release {
    runProguard true
    proguardFile 'proguard-google-api-client.txt'
    proguardFile getDefaultProguardFile('proguard-android.txt')
  }
}
```

Also add the following lines to the [proguard-google-api-client.txt](https://code.google.com/p/google-api-java-client/source/browse/calendar-android-sample/proguard-google-api-client.txt?repo=samples) file:

```
# Needed by google-api-client to keep generic types and @Key annotations accessed via reflection

-keepclassmembers class * {
  @com.google.api.client.util.Key <fields>;
}

-keepattributes Signature,RuntimeVisibleAnnotations,AnnotationDefault

```