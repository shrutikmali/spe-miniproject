FROM ubuntu:latest
RUN apt-get update && apt-get install -y openjdk-17-jre-headless
COPY target/spe-calculator-1.0-SNAPSHOT.jar /