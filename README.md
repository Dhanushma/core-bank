# core-bank

Overview

core-bank is an application built on spring Boot and Java. The service exposes APIs which allows client to generate paginated transactions
based on inputs.

Features
1. Generate Transactions based on Account Number, FromDate and ToDate
2. Swagger for API documentation


Technologies

Java: 17,
Spring Boot: 3.3.4,
Maven,
Database: H2,
Lombok,
Swagger for API documentation,
Spring Data JPA,
Junit5, Mockito

Getting Started

1. Clone the Repository :
   git clone https://github.com/Dhanushma/core-bank.git

2. Build the application :
   mvn clean install

3. Run the application :
   mvn spring-boot:run or java -jar target/core-bank-0.0.1-SNAPSHOT.jar
4. Access the APIs - http://localhost:8082/swagger-ui.html 