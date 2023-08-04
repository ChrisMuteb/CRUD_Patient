# CRUD_Patient 
Create a REST API for the patient directory using Java Spring-boot/ Postman / MySQL workbench
Language: Java
Project: Maven
Spring Boot: 3.1.2
Packaging: Jar
Java version: Java 17

Dependencies: Spring Web(Build web), Spring Data JPA(persist data in SQL), Spring Boot DevTools, MySQL Drive(MySQL JDBC driver)

Development Process Phase 1: 
  1. Update db configs in application.properties
  2. Create Patient entity
  3. Create DAO interface
  4. Create DAO implementation
  5. Create REST controller to use DAO

# API Requirements
REST clients should be able to:
Get a list of patients
Get a single patient by Id
Add a new patient
Update a patient
Delete a patient


# Steps to follow:
## Add Security and Authentication to the backend application
Assign roles to employees, managers, and admin.

## Testing and Quality Assurance
protect the API from unauthorized access.
At first, it will be basic Auth but later we will move to token-based authentication or OAuth.

## Code Review and Refactoring
Conduct a code review to ensure that the code is well-organized, follows best practices, and is maintainable
Refactor the code if necessary to improve readability, maintainability, and performance.

## Documentation
Document the API endpoints, request and response structures, and other relevant details for future reference.
Provide clear and concise documentation on how to set up and run the project locally

## Error Handling and Logging
Implement proper error handling to provide meaningful error messages to clients
Set up logging to track and monitor the application's behavior

## Deployment
Choose the appropriate hosting platform or server and deploy the application

## Monitoring and Maintenance
Regularly maintain and update the application to keep it secure and up-to-date with the latest technologies
Set up a monitoring tool to track the application's performance, usage, and potential issues in real time.

## Scalability
Implement features like caching, load balancing, and database optimization


