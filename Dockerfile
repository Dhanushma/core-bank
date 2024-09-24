#Start with a base image containing Java runtime
FROM openjdk:17-jdk-slim

#Information around who maintains the image
MAINTAINER dhanushmadinesan@gmail.com

# Add the application's jar to the image
COPY target/core-bank-0.0.1-SNAPSHOT.jar core-bank-0.0.1-SNAPSHOT.jar

# execute the application
ENTRYPOINT ["java", "-jar", "core-bank-0.0.1-SNAPSHOT.jar"]