FROM openjdk:8-jdk-alpine 
RUN apk --no-cache add curl
COPY build/libs/*.jar encrypt-service.jar
CMD java ${JAVA_OPTS} -jar encrypt-service.jar