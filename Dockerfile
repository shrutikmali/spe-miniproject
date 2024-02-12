FROM openjdk:17-jre-slim
COPY target/spe-calculator-1.0-SNAPSHOT.jar /app/calculator.jar
CMD ["java", "-jar", "/app/calculator.jar"]