# Dockerfile for Spring Boot Web Service
FROM openjdk:17-jdk-slim

COPY target/springboot-mongo-docker.jar /app/springboot-mongo-docker.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/springboot-mongo-docker.jar"]

## Stage 1: Build the application
#FROM maven:3.3.2-openjdk-17 AS build
#WORKDIR /app
#COPY pom.xml .
#COPY src ./src
#RUN mvn clean package -DskipTests
#
## Stage 2: Create the runtime image
#FROM openjdk:17-jdk-slim
#WORKDIR /app
#COPY --from=build /app/target/springboot-mongo-docker.jar .
#RUN useradd -m appuser
#USER appuser
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "springboot-mongo-docker.jar"]