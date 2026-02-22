 Beanscopes — Spring Boot REST API

Beanscopes is a Spring Boot backend application developed to demonstrate different Spring Bean Scopes and their behavior. This project exposes REST APIs to test
Singleton, Prototype, and Request scopes using Postman.

🚀 Features

- Demonstration of Spring Bean Scopes:
  - Singleton Scope
  - Prototype Scope
  - Request Scope
- REST APIs for testing scope behavior
- Dependency Injection
- Bean Lifecycle annotations (PostConstruct, PreDestroy)
- Tested using Postman

🛠️ Tech Stack

- Java
- Spring Boot
- Maven
- Postman (API Testing)

📂 Project Structure

src/main/java/com/example/beanscopes/
 ├── controller/        # ScopeController
 ├── service/           # ScopeService & Implementation
 ├── scopes/            # Singleton, Prototype, Request classes
 └── BeanscopesApplication.java

▶️ How to Run

1. Clone the repository

git clone https://github.com/samikshapurohit91/Beanscopes.git

2. Navigate to project folder

cd Beanscopes

3. Run application

mvn spring-boot:run

4. Test APIs using Postman:

http://localhost:8080/your-endpoint

📌 Learning Outcomes

- Understanding Spring Bean Scopes
- Hands-on experience with Spring Boot REST APIs
- Working with Dependency Injection
- Managing bean lifecycle

👩‍💻 Author

Samiksha Purohit
Java Backend Developer | Computer Science Student
