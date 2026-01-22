# Use a base image with OpenJDK Java 17 installed
FROM eclipse-temurin:17-jdk

# Set the working directory in the container
WORKDIR /app

# Copy the packaged Spring Boot application JAR file into the container
COPY target/MagiDash-0.0.1-SNAPSHOT.jar app.jar

# Specify the command to run the Spring Boot application when the container starts
ENTRYPOINT ["java","-jar","/app/app.jar"]

