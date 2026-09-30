FROM openjdk:17

WORKDIR /webservices

COPY ./target/web-services-project-0.0.1-SNAPSHOT.jar .

ENTRYPOINT java -jar web-services-project-0.0.1-SNAPSHOT.jar
