# module-maven-plugin
maven module plugin for retrieving module info

**Steps to build the maven plugin:** 
	1. clone the git repo. 
	2. install Java 1.8 
	3. set the Java version to 1.8 in your IDE (upgrade needed)
	4. install maven (latest)
	5. run mvn install 

**Steps to use the plugin **
	1. include pom plugin 
		<plugin>
				<groupId>com.graybytes</groupId>
				<artifactId>module-maven-plugin</artifactId>
				<version>1.1.2</version>
		</plugin>
		
** Output: **
[INFO] --- module-maven-plugin:1.1.2:info (default-cli) @ demo ---
[INFO] ------------------------------------------------------------------------
[INFO]  MODULE INFO
[INFO] ------------------------------------------------------------------------
[INFO] [ROOT]
name: spring-boot-starter-parent
artifactId: spring-boot-starter-parent
groupId: org.springframework.boot
version: 2.5.6
dependency count: 0
modules count: 0
plugins count: 4

[INFO] [MODULE]
name: demo
artifactId: demo
groupId: com.example
version: 0.0.1-SNAPSHOT
dependency count: 2
modules count: 0
plugins count: 10

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.287 s
[INFO] Finished at: 2021-11-12T20:04:25-06:00
[INFO] ------------------------------------------------------------------------
