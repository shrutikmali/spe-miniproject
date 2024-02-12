FROM ubuntu/jre:8-22.04_edge
COPY target/spe-calculator-1.0-SNAPSHOT.jar /app/calculator.jar
CMD ["java", "-jar", "/app/calculator.jar"]