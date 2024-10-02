# 🚀 Spring Boot REST API - CRUD Implementation

[![Java](https://img.shields.io/badge/Java-11+-brightgreen.svg)](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-2.5+-green.svg)](https://spring.io/projects/spring-boot)
[![License](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)

**Spring Boot REST API** is a simple, beginner-friendly project that demonstrates how to build a RESTful API with full CRUD (Create, Read, Update, Delete) functionality using Spring Boot. It is designed to serve as a foundation for larger applications or to help you understand the core concepts of building REST APIs with Spring.

## ✨ Features

- **Create** new records using HTTP `POST` requests.
- **Read** single or multiple records with HTTP `GET`.
- **Update** existing records using HTTP `PUT`.
- **Delete** records with HTTP `DELETE`.
- **In-memory H2 database** for quick setup and testing.
- **RESTful Architecture** following best practices for building APIs.
- Global **exception handling** for a consistent API experience.
  
## 🛠️ Technologies Used

- **Java 11+**
- **Spring Boot 2.5+**
- **Spring Data JPA**
- **H2 Database** (in-memory, for development and testing)
- **Maven** (for dependency management and build)

## 🚀 Getting Started

### 📋 Prerequisites

Before you begin, ensure you have met the following requirements:

- You have installed Java 11+ and Maven.
- You have an IDE such as IntelliJ IDEA or Eclipse installed.
- You have Postman or a similar API testing tool for sending requests.

### 🔧 Installation and Setup

1. **Clone the repository**:
   ```bash
   git clone https://github.com/your-username/springboot-rest-api-crud.git
   ```

2. **Navigate to the project directory**:
   ```bash
   cd springboot-rest-api-crud
   ```

3. **Install dependencies and run the application**:
   ```bash
   mvn clean install
   mvn spring-boot:run
   ```

4. The application will start on `http://localhost:8080`.

5. **Access H2 Database Console**:
   Visit `http://localhost:8080/h2-console` for in-memory database management (default settings are in `application.properties`).

### 🧪 API Testing

You can use Postman or any REST client to test the following endpoints.

| Method | Endpoint               | Description                   |
|--------|------------------------|-------------------------------|
| `GET`  | `/api/entities`         | Retrieve all entities         |
| `GET`  | `/api/entities/{id}`    | Retrieve an entity by ID      |
| `POST` | `/api/entities`         | Create a new entity           |
| `PUT`  | `/api/entities/{id}`    | Update an existing entity     |
| `DELETE`| `/api/entities/{id}`    | Delete an entity by ID        |

Example `POST` request:
```bash
POST http://localhost:8080/api/entities
Content-Type: application/json

{
  "name": "Sample Entity",
  "description": "This is a sample entity"
}
```

### 🏗️ Project Structure

```
src/
├── main/
│   ├── java/
│   │   └── com/example/demo/
│   │       ├── controller/       # REST Controllers
│   │       ├── service/          # Business Logic Layer
│   │       ├── repository/       # Data Access Layer (JPA Repositories)
│   │       └── model/            # Entity Models (JPA Entities)
│   └── resources/
│       ├── application.properties  # Spring Boot Configurations
│       └── data.sql               # (Optional) Initial Data Setup for Testing
└── test/
    └── java/
        └── com/example/demo/      # Unit and Integration Tests
```

## ⚙️ Configuration

The project uses **H2 in-memory database** by default for quick setup. You can configure it or switch to another database (e.g., MySQL, PostgreSQL) by updating the `application.properties` file.

```properties
# H2 Database Configuration
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
spring.h2.console.enabled=true
```

To use **MySQL**, for instance, update `application.properties`:
```properties
spring.datasource.url=jdbc:mysql://localhost:3306/mydb
spring.datasource.username=root
spring.datasource.password=password
spring.jpa.hibernate.ddl-auto=update
```

## 🚀 Future Enhancements

- Add **pagination** and **sorting** for large datasets.
- Integrate **Spring Security** to secure endpoints.
- Include **Swagger UI** for API documentation and testing.
- Extend to use **MySQL/PostgreSQL** in production.
- Add **DTOs (Data Transfer Objects)** for better data handling.

## 🤝 Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/your-feature`)
3. Commit your Changes (`git commit -m 'Add some feature'`)
4. Push to the Branch (`git push origin feature/your-feature`)
5. Open a Pull Request

## 📚 References

This project is inspired by and built following the tutorial series: [Java REST API with Spring Boot](https://www.youtube.com/watch?v=iBGkJln9BPo&list=PLcs1FElCmEu121gqGwlQt47d0SqNkzSTK).

