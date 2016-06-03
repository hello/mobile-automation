# mobile-automation

##TODO
1. Make a simple compile script.
2. Make a master controller responsible for creating appium servers before tests and killing them after.
3. Test app/apk from relative path.
4. Clean up everything.


This currently requires Intellij.

____

## Your bash_profile (On Mac OSx)
###1. Add a java home, maven and intellij variable
```
#Java
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home
#Maven
export MAVEN_HOME=/Users/{your username here}/.m2/repository/
#Intellij
export INTELLIJ_JAR="/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar"
```
###2. Choose one from the two following:
  1. I don't care what I include:
  ```
  export CLASSPATH=${CLASSPATH}:${JAVA_HOME}/jre/lib/*/*.jar:${MAVEN_HOME}/*.jar:${INTELLIJ_JAR}
  ```
    
  2. Show me every jar:

  ```
  export MOBILE_TESTING_CLASSPATH="${JAVA_HOME}/jre/lib/charsets.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/deploy.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/ext/cldrdata.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/ext/dnsns.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/ext/jfxrt.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/ext/localedata.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/ext/nashorn.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/ext/sunec.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/ext/sunjce_provider.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/ext/sunpkcs11.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/ext/zipfs.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/javaws.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/jce.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/jfr.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/jfxswt.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/jsse.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/management-agent.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/plugin.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/resources.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/jre/lib/rt.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/lib/ant-javafx.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/lib/dt.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/lib/javafx-mx.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/lib/jconsole.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/lib/packager.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/lib/sa-jdi.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${JAVA_HOME}/lib/tools.jar"


  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/com/google/code/gson/gson/2.2.4/gson-2.2.4.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/seleniumhq/selenium/selenium-java/2.52.0/selenium-java-2.52.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/seleniumhq/selenium/selenium-chrome-driver/2.52.0/selenium-chrome-driver-2.52.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/seleniumhq/selenium/selenium-remote-driver/2.52.0/selenium-remote-driver-2.52.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/cglib/cglib-nodep/2.1_3/cglib-nodep-2.1_3.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/seleniumhq/selenium/selenium-api/2.52.0/selenium-api-2.52.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/seleniumhq/selenium/selenium-edge-driver/2.52.0/selenium-edge-driver-2.52.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/apache/commons/commons-exec/1.3/commons-exec-1.3.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/seleniumhq/selenium/selenium-htmlunit-driver/2.52.0/selenium-htmlunit-driver-2.52.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/net/sourceforge/htmlunit/htmlunit/2.18/htmlunit-2.18.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/xalan/xalan/2.7.2/xalan-2.7.2.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/xalan/serializer/2.7.2/serializer-2.7.2.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/apache/commons/commons-lang3/3.4/commons-lang3-3.4.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/apache/httpcomponents/httpmime/4.5/httpmime-4.5.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/net/sourceforge/htmlunit/htmlunit-core-js/2.17/htmlunit-core-js-2.17.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/xerces/xercesImpl/2.11.0/xercesImpl-2.11.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/xml-apis/xml-apis/1.4.01/xml-apis-1.4.01.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/net/sourceforge/nekohtml/nekohtml/1.9.22/nekohtml-1.9.22.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/net/sourceforge/cssparser/cssparser/0.9.16/cssparser-0.9.16.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/w3c/css/sac/1.3/sac-1.3.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/eclipse/jetty/websocket/websocket-client/9.2.12.v20150709/websocket-client-9.2.12.v20150709.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/eclipse/jetty/jetty-util/9.2.12.v20150709/jetty-util-9.2.12.v20150709.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/eclipse/jetty/jetty-io/9.2.12.v20150709/jetty-io-9.2.12.v20150709.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/eclipse/jetty/websocket/websocket-common/9.2.12.v20150709/websocket-common-9.2.12.v20150709.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/eclipse/jetty/websocket/websocket-api/9.2.12.v20150709/websocket-api-9.2.12.v20150709.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/seleniumhq/selenium/selenium-firefox-driver/2.52.0/selenium-firefox-driver-2.52.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/seleniumhq/selenium/selenium-ie-driver/2.52.0/selenium-ie-driver-2.52.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/net/java/dev/jna/jna/4.1.0/jna-4.1.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/net/java/dev/jna/jna-platform/4.1.0/jna-platform-4.1.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/seleniumhq/selenium/selenium-safari-driver/2.52.0/selenium-safari-driver-2.52.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/seleniumhq/selenium/selenium-support/2.52.0/selenium-support-2.52.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/webbitserver/webbit/0.4.14/webbit-0.4.14.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/io/netty/netty/3.5.2.Final/netty-3.5.2.Final.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/seleniumhq/selenium/selenium-leg-rc/2.52.0/selenium-leg-rc-2.52.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/apache/httpcomponents/httpclient/4.3.3/httpclient-4.3.3.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/apache/httpcomponents/httpcore/4.3.2/httpcore-4.3.2.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/commons-logging/commons-logging/1.1.3/commons-logging-1.1.3.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/commons-codec/commons-codec/1.6/commons-codec-1.6.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/com/google/guava/guava/17.0/guava-17.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/cglib/cglib/3.1/cglib-3.1.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/ow2/asm/asm/4.2/asm-4.2.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/commons-validator/commons-validator/1.4.1/commons-validator-1.4.1.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/commons-beanutils/commons-beanutils/1.8.3/commons-beanutils-1.8.3.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/commons-digester/commons-digester/1.8.1/commons-digester-1.8.1.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/commons-collections/commons-collections/3.2.1/commons-collections-3.2.1.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/com/saucelabs/sauce_junit/2.1.3/sauce_junit-2.1.3.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/junit/junit/4.11/junit-4.11.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/com/saucelabs/saucerest/1.0.9/saucerest-1.0.9.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/com/googlecode/json-simple/json-simple/1.1/json-simple-1.1.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/json/json/20090211/json-20090211.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/com/saucelabs/sauce-rest-api/1.1/sauce-rest-api-1.1.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/jvnet/hudson/trilead-ssh2/build212-hudson-5/trilead-ssh2-build212-hudson-5.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/codehaus/jackson/jackson-mapper-asl/1.5.0/jackson-mapper-asl-1.5.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/org/codehaus/jackson/jackson-core-asl/1.5.0/jackson-core-asl-1.5.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/commons-io/commons-io/1.4/commons-io-1.4.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/com/saucelabs/sauce_java_common/2.1.3/sauce_java_common-2.1.3.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:${MAVEN_HOME}/io/appium/java-client/3.4.0/java-client-3.4.0.jar"
  export MOBILE_TESTING_CLASSPATH="${MOBILE_TESTING_CLASSPATH}:/Users/david/Documents/Hello/MobileAppiumTesting/target/classes"

  export CLASSPATH="${CLASSPATH}:${MOBILE_TESTING_CLASSPATH}:${INTELLIJ_JAR}"
  ```

