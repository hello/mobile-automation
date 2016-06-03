export AndroidTest="${JAVA_HOME}/bin/java -Didea.launcher.port=7533 -Dfile.encoding=UTF-8 com.intellij.rt.execution.application.AppMain is.hello.sense.android.AndroidMain"
export IOSTest="${JAVA_HOME}/bin/java -Didea.launcher.port=7533 -Dfile.encoding=UTF-8 com.intellij.rt.execution.application.AppMain is.hello.sense.ios.IOSMain"

#Java
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home
#Maven
export MAVEN_HOME=/Users/$USER/.m2/repository/
#Intellij
export INTELLIJ_JAR="/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar"

export CLASSPATH=${CLASSPATH}:${JAVA_HOME}/jre/lib/*/*.jar:${MAVEN_HOME}/*.jar:${INTELLIJ_JAR}

