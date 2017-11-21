### SpringREST
Spring boot Application with RESTful API

### Build and Run
```javascript
Download the project to and navigate to project folder.
mvn clean install
java -jar target/fibonacci-0.0.1-SNAPSHOT.jar
This is a spring boot application and will automatically launch embedded tomcat.
```

### API
API can be accessed at : localhost:8080/app/v1

* Get Fibonacci numbers
  * HTTP METHOD : GET
  * Request Params : number (required , input value)
  * Response : String
  * Example URL : http://localhost:8080/app/v1/getFib?number=abc
