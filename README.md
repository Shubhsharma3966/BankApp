# Building REST APIs with Spring Boot: A Simple Banking Application

In this tutorial, we will learn how to build REST APIs for a simple Banking application using Spring Boot, Spring Data JPA (Hibernate), and MySQL database.

We'll create a simple version of a Banking App with basic functionalities: creating a bank account, fetching account details, and making deposits/withdrawals.

## 1. Set up a Spring Boot project

Launch Spring Initializr and fill up the project details, including selecting Maven or Gradle as the project type, Java as the language, Jar as the packaging type, and Java 17 as the Java version. Add dependencies for Spring Web, Spring Data JPA, MySQL Driver, and Lombok. Download, extract the project, and import it into your favorite IDE.

## 2. Configure the MySQL database

Open the `application.properties` file in the resources folder and add the MySQL configuration properties. Ensure you update the MySQL database username and password as per your MySQL installation. The configuration includes setting the database URL, username, password, and enabling Hibernate's auto-update feature for the database schema.

## 3. Create the Account entity

Define an Account JPA entity class to represent a bank account. This entity will include properties like ID, account holder name, and balance. Use Lombok annotations to reduce boilerplate code, and JPA annotations to map the entity to the database table.

## 4. Create the JPA repository for the Account entity

Create an AccountRepository interface that extends JpaRepository. This provides CRUD methods to perform database operations on the Account entity.

## 5. Create the service class

Develop the AccountService class to contain the core business logic of the application. This class will include methods for creating a new account, retrieving account details, depositing money into an account, and withdrawing money from an account.

## 6. Create the REST controller

Implement the AccountController class to expose the business logic as RESTful API endpoints. This controller will handle HTTP requests for creating an account, fetching account details, making deposits, and withdrawals.

## Run and Test Application

Start the Spring Boot application and test it using the following API endpoints:

1. **Create a new bank account**: Send a POST request to `/api/accounts` with account details in the request body.

2. **Fetch account details**: Send a GET request to `/api/accounts/{id}`, replacing `{id}` with the actual account ID.

3. **Deposit money into an account**: Send a POST request to `/api/accounts/{id}/deposit`, replacing `{id}` with the actual account ID and including the deposit amount in the request body.

4. **Withdraw money from an account**: Send a POST request to `/api/accounts/{id}/withdraw`, replacing `{id}` with the actual account ID and including the withdrawal amount in the request body.

5. **Fetch All Account**: Send a GET request to `/api/accounts/accountlist`.

## Conclusion

In this tutorial, we covered the basic implementation of a banking application's REST API using Spring Boot. There is always room for improvements and adding more features. Before using this in a real-world application, consider integrating error handling, input validation, user authentication and authorization, security measures, etc.
