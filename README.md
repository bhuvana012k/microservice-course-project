# Student-Department Microservices Project

This is a hands-on Microservices project built using Java, Spring Boot and Spring Cloud.

The project consists of a Student Service and a Department Service. Eureka Server is used for service discovery, and API Gateway is used for routing client requests to the appropriate microservice.

## Project Overview

The main purpose of this project is to understand how multiple independent services communicate and work together using Microservices Architecture.

The project contains the following components:

- Eureka Server
- Student Service
- Department Service
- API Gateway

## Architecture

```text
                         Client
                           |
                           v
                    +--------------+
                    | API Gateway  |
                    +--------------+
                           |
                           v
                  +------------------+
                  |   Eureka Server  |
                  |  Service Registry|
                  +------------------+
                     /            \
                    /              \
                   v                v
        +------------------+   +---------------------+
        |  Student Service |   | Department Service  |
        +------------------+   +---------------------+
                  |                       |
                  v                       v
             Student Data           Department Data

1. Eureka Server

Eureka Server works as a Service Registry.

It keeps track of the registered microservices and helps services discover each other dynamically.

2. Student Service

Student Service manages student information.

Student details include:

Student ID
Student Name
Email
Department ID

Student Service is registered with Eureka Server as a Eureka Client.

3. Department Service

Department Service manages department information.

Department details include:

Department ID
Department Name
HOD
Location
NBA Accreditation Status

Department Service is registered with Eureka Server as a Eureka Client.

4. API Gateway

API Gateway acts as the single entry point for client requests.

It routes incoming requests to the appropriate microservice.

API Gateway is also registered with Eureka Server as a Eureka Client.

Service Communication

The Student Service communicates with the Department Service when department-related information is required.

Eureka Server helps the services discover each other without using fixed service locations.

Request Flow

A client request follows this flow:
Client
   |
   v
API Gateway
   |
   v
Eureka Server
   |
   +----------------------+
   |                      |
   v                      v
Student Service     Department Service
Technologies Used
Java
Spring Boot
Spring Cloud
Spring Cloud Netflix Eureka
Spring Cloud API Gateway
Spring Data JPA
Hibernate
MySQL
REST APIs
Maven
Microservices Concepts Implemented
Microservices Architecture
Service Discovery
Eureka Server
Eureka Client
API Gateway
Inter-Service Communication
REST APIs
CRUD Operations
Database Integration
Exception Handling
What I Learned

Through this project, I gained hands-on experience in:

Creating independent microservices using Spring Boot
Registering services with Eureka Server
Understanding service discovery
Routing requests using API Gateway
Communication between microservices
Creating REST APIs
Connecting applications with MySQL
Using JPA and Hibernate for database operations

Project Structure
microservice-course-project
│
├── api-gateway
│
├── service-registry
│
├── student-service
│
└── department-service
Author
Bhuvaneswari K
