# Spring Boot Clean Architecture Template

Production-ready Spring Boot starter template demonstrating clean layered architecture, JWT authentication, and modern Java practices.

## Architecture Overview

```
Client Request
     |
     v
[Controller Layer]  -- Handles HTTP, validation, response mapping
     |
     v
[Service Layer]     -- Business logic, transaction management
     |
     v
[Repository Layer]  -- Data access, JPA entities, database queries
     |
     v
[PostgreSQL]
```

## Features

- **Clean Layered Architecture** — Controller, Service, and Repository separation
- **JWT Authentication** — Stateless token-based auth with Spring Security
- **Database Migrations** — Flyway for version-controlled schema management
- **API Documentation** — OpenAPI 3.0 with Swagger UI
- **Input Validation** — Bean Validation with structured error responses
- **DTO Mapping** — MapStruct for compile-time type-safe mapping
- **Global Exception Handling** — Centralized error responses with `@RestControllerAdvice`
- **Docker Compose** — One-command local development setup
- **Java 21** — Records, modern language features

## Tech Stack

| Category       | Technology                  |
|----------------|-----------------------------|
| Framework      | Spring Boot 3.4             |
| Language       | Java 21                     |
| Database       | PostgreSQL 16               |
| Migrations     | Flyway                      |
| Auth           | JWT (jjwt 0.12.6)           |
| Docs           | springdoc-openapi 2.8.6     |
| Mapping        | MapStruct 1.6.3             |
| Build          | Maven                       |

## Getting Started

### Prerequisites

- Java 21+
- Docker & Docker Compose

### Run with Docker Compose

```bash
# Start PostgreSQL
docker compose up -d

# Run the application
./mvnw spring-boot:run -Dspring-boot.run.profiles=dev
```

The application starts on `http://localhost:8080`.

### API Documentation

Swagger UI is available at:

```
http://localhost:8080/swagger-ui.html
```

OpenAPI spec:

```
http://localhost:8080/v3/api-docs
```

### API Endpoints

| Method | Endpoint              | Description         | Auth Required |
|--------|-----------------------|---------------------|---------------|
| POST   | `/api/auth/register`  | Register new user   | No            |
| POST   | `/api/auth/login`     | Login               | No            |
| GET    | `/api/users/me`       | Current user profile| Yes           |

## Project Structure

```
src/main/java/com/blerimhasa/cleanarch/
├── CleanArchApplication.java
├── auth/
│   ├── AuthController.java
│   ├── AuthService.java
│   ├── AuthResponse.java
│   ├── LoginRequest.java
│   ├── RegisterRequest.java
│   └── JwtService.java
├── config/
│   ├── SecurityConfig.java
│   ├── JwtAuthenticationFilter.java
│   └── OpenApiConfig.java
├── exception/
│   ├── GlobalExceptionHandler.java
│   ├── ErrorResponse.java
│   ├── ResourceNotFoundException.java
│   └── DuplicateResourceException.java
└── user/
    ├── User.java
    ├── Role.java
    ├── UserRepository.java
    ├── UserController.java
    ├── UserResponse.java
    └── UserMapper.java
```

## License

MIT

