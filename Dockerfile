FROM openjdk:17
EXPOSE 8080
ADD build/libs/spring-boot-dockerize.jar spring-boot-dockerize.jar
ENTRYPOINT ["java", "-jar", "/spring-boot-dockerize.jar"]