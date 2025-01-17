# Dockerfile for Spring Boot Web Service
#FROM openjdk:17-jdk-slim
#
##WORKDIR /app
#COPY target/springboot-mongo-docker.jar app.jar
#
#EXPOSE 8080
#ENTRYPOINT ["java", "-jar", "app.jar"]

FROM openjdk:17-jdk-slim

COPY target/springboot-mongo-docker.jar /app/springboot-mongo-docker.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/springboot-mongo-docker.jar"]