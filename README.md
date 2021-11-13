# module-maven-plugin
maven module plugin for retrieving module meta data

## Steps to build the maven plugin: 
	1. clone the git repo. 
	3. set the Java version to 1.8 in your IDE (upgrade needed)
	5. execute mvn install 

## Steps to use the plugin: 
	1. include pom plugin 
	<plugin>
		<groupId>io.github.graybytes</groupId>
		<artifactId>module-maven-plugin</artifactId>
		<version>1.0</version>
	</plugin>
	
## module:info output
```
[INFO] --- module-maven-plugin:1.0:info (default-cli) @ demo ---
[INFO] ------------------------------------------------------------------------
[INFO]  MODULE INFO
[INFO] ------------------------------------------------------------------------
[INFO] [MODULE]
name: demo
artifactId: demo
groupId: com.example
version: 0.0.1-SNAPSHOT
hasParent: true
dependency count: 2
modules count: 0
plugins count: 6

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  0.593 s
[INFO] Finished at: 2021-11-13T17:43:36-06:00
[INFO] ------------------------------------------------------------------------

```
## module:tree output
```
[INFO] ------------------------------------------------------------------------
[INFO]  MODULE TREE
[INFO] ------------------------------------------------------------------------
[INFO] |-name: com.example:demo@0.0.1-SNAPSHOT
[INFO] 	|-name: org.springframework.boot:spring-boot-starter-parent@2.5.6
[INFO] 		|-name: org.springframework.boot:spring-boot-dependencies@2.5.6
[INFO] ------------------------------------------------------------------------
```

## Contributions: 
1. Fork the repo and create a pull request. 
2. Once approved and reviewed the PR will be merged. 
3. Feedback and input as issues or enhancements are always welcome
