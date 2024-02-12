FROM ubuntu:latest
FROM eclipse-temurin:11
COPY target/spe-calculator-1.0-SNAPSHOT.jar /app/calculator.jar
CMD ["java", "-jar", "/app/calculator.jar"]