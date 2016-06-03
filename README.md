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

```