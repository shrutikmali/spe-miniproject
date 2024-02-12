FROM openjdk:17-jre-slim
COPY target/spe-calculator-1.0-SNAPSHOT.jar /app/spe-calculator-1.0-SNAPSHOT.jar
CMD ["java", "-jar", "/app/spe-calculator-1.0-SNAPSHOT.jar"]