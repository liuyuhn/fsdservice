FROM java:8
WORKDIR /fsdserver
COPY fsdservice-1.0-SNAPSHOT.jar /fsdserver/fsdserver.jar
EXPOSE 4200
ENTRYPOINT ["java","-jar","/fsdserver/fsdserver.jar"]
