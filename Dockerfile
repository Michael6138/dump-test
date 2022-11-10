FROM openjdk:17-alpine
MAINTAINER michael_popov
COPY target/dump.jar dump.jar
ENTRYPOINT ["java","-jar","dump.jar"]