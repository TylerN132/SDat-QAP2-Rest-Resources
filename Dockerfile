FROM ubuntu:latest
LABEL authors="Ty"
COPY target/*.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]