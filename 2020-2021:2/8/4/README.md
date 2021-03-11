~~~
// Create JAR file containing mass/PointMain.class mass/util/Point.class
jar cf mass-deploy.jar mass/PointMain.class mass/util/Point.class

// Run JAR file specifying classpath containing the psvm method
java -classpath mass-deploy.jar mass.PointMain

// Extract JAR file (to check its content)
jar xf mass-deploy.jar

//Create JAR file containing a modified MANIFEST.MF and .class files
jar cfm mass-deploy.jar ./MANIFEST.MF mass/PointMain.class mass/util/Point.class 

//Run JAR file with correct MANIFEST file (including path to main class)
java -jar mass-deploy.jar
~~~


