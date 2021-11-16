FROM openjdk:8 

ARG JAR_FILE=/target/*.jar

COPY ${JAR_FILE} /target/docker/

ENTRYPOINT ["java","-jar","/timesheet.jar"]

