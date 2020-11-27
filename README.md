# Spring boot in Docker
create docker image

1.Download;

2.Run http://localhost:8080/message;

3.stop and do maven install;

4.run docker;

5.Open Shell and go to your directory with project 
"cd C:....\eclipse-workspace\springbot-with-docker"
  "docker build -t spring-docker.jar ."
  "docker image ls"
  "docker run -p 9090:8080 spring-docker.jar";
   
6.go to http://localhost:9090/message

7.stop app 
  "docker stop id_container"

8.you can download image from docker hub:
"docker pull vsvdevua/spring-docker.jar"
and do
"docker run -p 9090:8080 spring-docker.jar" 
  go to http://localhost:9090/message
"docker stop id_container"
