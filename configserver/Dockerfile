#Start with base image containing java runtime
FROM openjdk:17 as build

#Information of owner or maintainer of image
MAINTAINER chanhenghong

#Add the application's jar to the container
COPY target/configserver-0.0.1-SNAPSHOT.jar configserver-0.0.1-SNAPSHOT.jar

#Execute the application
ENTRYPOINT ["java", "-jar", "/configserver-0.0.1-SNAPSHOT.jar"]

#	- mvn clean package
#   - docker build . -t chanhenghong/configserver
#	- docker run -p [8080:8080 port] chanhenghong/configserver