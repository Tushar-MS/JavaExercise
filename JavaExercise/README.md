# Java Springboot Exercise

### Build With
<!-- UL -->
[Java 1.8 or above] - Java Platform, Standard Edition Development Kit <br> https://www.oracle.com/java/technologies/javase-jdk11-downloads.html <br>
[ Eclipse ] - Java Integrated Development Environment ( IDE )<br> https://www.eclipse.org/downloads/ <br>
[ Maven 3.x] - Dependency Management perform uniform build system <br> https://maven.apache.org/index.html <br>
[ Git ] - Free and Open source distributed version control system <br> https://git-scm.com/ <br>
[ Postman ] - API Development Environment ( local testing) <br> https://www.postman.com/



### Rest API URI
<!-- UL -->
* URI Rest endpoint request parameter 
if present should return User info, parameter username like "Alpha", "Beta", "Gamma".
* project context path is http://localhost:8080/company/user/Alpha
* Fetch All user list
 http://localhost:8080/company/

### Running the application locally
---
<!-- OL -->
1. Download the zip and unzip at project development folder
2. Open eclipse <br>
  2.1 - File import as existing Maven project
  2.2 - Navigate up to folder POM.xml for maven dependencies
  2.3 - Search file Application with @SpringBootApplication annotation as main starting MdSpringBootApplication.java file
  2.4 - Right click and run as java application   
3. Check console log as project run at Tomcat server on port 8080
4. The application will run at http://localhost:8080 or check http://localhost:8080/actuator/health
5. Application flow architecture 
<!-- UL -->
* Java Resource/Controller  file -> Service file --> Helper file.

### packages
<!-- OL -->
resources - all rest client endpoint representation and its implementation 
service - basic entry point to call business logic
Helper - files communication with data base and request builder and response processor
