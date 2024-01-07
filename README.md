
This is a project to dockerize spring boot application.

Download and install docker desktop from below url
https://www.docker.com/products/docker-desktop/

Create a sample spring boot application with docker file and generate the jar

Command to create a docker image for the spring boot application

docker build -t spring-boot-docker .

Command to create a container from image

docker run -p 9090:8080 spring-boot-docker

Once the docker image is created use below commands to push to docker hub:
1. Login to docker hub
   docker login --username=******
   and enter password when prompted
2.Create a tag for the image u want to push
  docker tag imageid dockerusername/spring-boot-docker:tagname
3.Push the image to docker hub
  docker push dockerusername/spring-boot-docker:tagname
