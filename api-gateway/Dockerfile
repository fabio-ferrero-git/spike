FROM openjdk:8-jdk-alpine
COPY /target/api-gateway-*.jar app.jar
EXPOSE 8080
CMD ["java", "-jar", "app.jar"]