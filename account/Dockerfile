#Start with base image containing java runtime
FROM openjdk:17 as build

#Information of owner or maintainer of image
MAINTAINER chanhengbank

#Add the application's jar to the container
COPY target/account-0.0.1-SNAPSHOT.jar account-0.0.1-SNAPSHOT.jar

#Execute the application
ENTRYPOINT ["java", "-jar", "/account-0.0.1-SNAPSHOT.jar"]

#	- mvn clean package
#   - docker build . -t chanheng/bank
#	- docker run -p 8080:8080 chanheng/bank