FROM maven:3.6.1-jdk-8-alpine AS MAVEN_BUILD

WORKDIR /demo
COPY . .
#download dependencies and build the jar file
RUN mvn clean package

FROM openjdk:8-jre-alpine3.9
COPY --from=MAVEN_BUILD /demo/target/demo-0.0.1-SNAPSHOT.jar /demo.jar

ENTRYPOINT ["java", "-jar", "/demo.jar"]