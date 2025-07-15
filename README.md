# RunnerApp

This is a Spring Boot application for managing runner groups. Runners are divided into groups by pace (relaxed, moderate, hard) and distance (short, medium, long).

## Features
- Manage runners
- Group runners by pace and distance
- REST API for runners and groups

## Getting Started

### Build and Run

```
mvn spring-boot:run
```

The app will start on http://localhost:8080

### API Endpoints (to be implemented)
- `GET /runners` - List all runners
- `POST /runners` - Add a new runner
- `GET /groups` - List all groups

## Stacks
- Java 21
- Maven

---

This project was generated with [Spring Initializr](https://start.spring.io/).
