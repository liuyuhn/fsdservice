FROM openjdk:8-jdk-alpine
WORKDIR .
EXPOSE 4200
COPY ./target/userservice-1.1.jar userservice.jar
ENTRYPOINT exec java -jar userservice.jar
