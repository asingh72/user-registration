# User Registration Application

Using this application, end user can add n number of user along with their address in the h2 Database using exposed REST API’s. 


### high level architecture
![Screen Shot 2021-10-24 at 2 52 43 PM](https://user-images.githubusercontent.com/25624988/138621959-9618e838-450c-4262-8a8c-c7a04fd18b9c.png)

### Technologies

Dependency management : Maven <br>
Framework: Spring framework <br>
Language: Java 11<br>
Databse: H2 DB<br>


### Steps to Run application

* Step1: Clone this repository
* Step2: Open downloaded application in Spring Tool Suite (or any preferred IDE)<br>
* Step3: Run the application using Spring Boot App<br>
* Step4: Navigate to below URL to test all the REST endpoints<br> 
  http://localhost:8080/swagger-ui.html#/<br>
* Step5: Navigate to below URL to  access H2 Database<br> 
  http://localhost:8080/h2 <br>
  Databse: H2 DB <br>
  DB: jdbc:h2:mem:backend_test <br>
  DB User Name: varo <br>
  DB Password: varo <br>
  (Note: We can change DB properties form the application.properties file) <br>


### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.6/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.6/maven-plugin/reference/html/#build-image)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.5.6/reference/htmlsingle/#boot-features-developing-web-applications)

### Guides
The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/bookmarks/)


