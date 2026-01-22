# MagiDash API

A simple Spring Boot API that connects to a MySQL database and returns dashboard records. This project is fully dockerized using Docker Compose.

## Prerequisites

- Docker Hub (Optional)
- Docker 
- Docker Compose
- Maven (for building the JAR)
  
# How to Build and Run

1. **Build the Spring Boot JAR**

```bash
mvn clean package
```

2. Run the application with Docker Compose
```bash
 docker compose up --build
```

3. Access the API
```bash
 curl http://localhost:8080/dashboards
```
# Sample Result 
```bash
<img width="1082" height="46" alt="image" src="https://github.com/user-attachments/assets/fcfc282b-2658-40c2-822b-85d9757e0e88" />
```



