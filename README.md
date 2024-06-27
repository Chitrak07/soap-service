SOAP Service Project

This project demonstrates a simple SOAP service implementation using Java 17 and Spring Boot. It includes an example WSDL file (HelloWorldService.wsdl) located in src/main/resources/.

Setup
Prerequisites
Java 17 or higher
Maven


Access the SOAP service WSDL:

Open your web browser and navigate to:

bash
Copy code
http://localhost:8080/ws/HelloWorldService.wsdl
This endpoint exposes the WSDL file (HelloWorldService.wsdl) that describes the SOAP service.

Testing with SOAPUI
Open SOAPUI.

Create a new SOAP Project:

Specify the WSDL location:
bash
Copy code
http://localhost:8080/ws/HelloWorldService.wsdl
Import the WSDL and explore the operations.

Create test requests and execute them against the SOAP service endpoints.

Project Structure
src/main/java/com/javatask/: Java source files.
HelloWorld.java: Interface defining the service contract.
HelloWorldImpl.java: Implementation of the service.
src/main/resources/: Resources directory.
HelloWorldService.wsdl: WSDL file describing the service.
Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.
