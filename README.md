# MagiDash API

A simple Spring Boot API that connects to a MySQL database and returns dashboard records. This project is fully dockerized using Docker Compose.

## Prerequisites
- Docker 
  
# How to Build and Run

1. Run the application with Docker Compose
```bash
 docker compose up --build
```

2. Call the API
```bash
 curl http://localhost:80/dashboards
```

# Sample Result 
```bash
$ curl http://localhost:80/dashboards
[{"createdAt":"2026-01-22T00:00:00.000Z","id":1,"title":"Demo Dashboard","updatedAt":"2026-01-22T00:00:00.000Z"}]
```



