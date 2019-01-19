FROM openjdk:8-jre-alpine
ADD target/producer-docker.jar producer-docker.jar
EXPOSE 8099
ENTRYPOINT ["java", "-jar", "producer-docker.jar"]