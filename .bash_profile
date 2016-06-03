alias AndroidTest="${JAVA_HOME}/bin/java -Didea.launcher.port=7533 \"-Didea.launcher.bin.path=/Applications/IntelliJ IDEA.app/Contents/bin\" -Dfile.encoding=UTF-8 com.intellij.rt.execution.application.AppMain is.hello.sense.android.AndroidMain"
alias IOSTest="${JAVA_HOME}/bin/java -Didea.launcher.port=7533 \"-Didea.launcher.bin.path=/Applications/IntelliJ IDEA.app/Contents/bin\" -Dfile.encoding=UTF-8 com.intellij.rt.execution.application.AppMain is.hello.sense.ios.IOSTest"

#Java
export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_51.jdk/Contents/Home
#Maven
export MAVEN_HOME=/Users/$USER/.m2/repository/
#Intellij
export INTELLIJ_JAR="/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar"

export CLASSPATH=${CLASSPATH}:${JAVA_HOME}/jre/lib/*/*.jar:${MAVEN_HOME}/*.jar:${INTELLIJ_JAR}

