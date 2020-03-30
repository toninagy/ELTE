1) If we aren't in the root dir

__javac -d absolute/path/to/compile/classfiles/into -cp absolute/path/to/junit-4.12.jar:absolute/path/to/hamcrest-core-1.3.jar absolute/path/to/TestClassName.java (and further  necessary java files)__

(-d part is necessary only if we want to generate classfiles somewhere else)

__java -cp absolute/path/to/compiled/classes:absolute/path/to/junit-4.12.jar:absolute/path/to/hamcrest-core-1.3.jar org.junit.runner.JUnitCore your.package.TestClassName__



2) If we are in the root dir(containing the two jar files)

__javac -cp absolute/path/to/java/files:junit-4.12.jar:hamcrest-core-1.3.jar your.package.TestClassName (and further necessary java files)__

OR

__javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar absolute/path/to/java/files/your.package.TestClassName (and further necessary java files)__

__java -cp absolute/path/to/compiled/classes:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore your.package.TestClassName__



3) If we have everything locally

__javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar SimpleTest.java__

__java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore SimpleTest__

