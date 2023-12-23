
This is a project to dockerize spring boot application.

Download and install docker desktop from below url
https://www.docker.com/products/docker-desktop/

Create a sample spring boot application with docker file and generate the jar

Command to create a docker image for the spring boot application

docker build -t spring-boot-dockerize-0.0.1-SNAPSHOT.jar .

Command to create a container from image

docker run -p 9090:8080 spring-boot-dockerize-0.0.1.jar  