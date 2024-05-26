FROM openjdk:17-jdk-slim
VOLUME /tmp
COPY target/gateway-0.0.1-SNAPSHOT.jar app.jar
RUN apt-get update && apt-get install -y curl
ENTRYPOINT ["java","-jar","/app.jar"]
