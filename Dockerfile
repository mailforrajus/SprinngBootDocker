FROM openjdk:8
EXPOSE 8082
ADD target/spring-boot-docker-example.jar spring-boot-docker-example.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker-example.jar"]