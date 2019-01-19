FROM openjdk:8-jre-alpine
ADD target/consumer-docker.jar consumer-docker.jar
EXPOSE 8097
ENTRYPOINT ["java", "-jar", "consumer-docker.jar"]