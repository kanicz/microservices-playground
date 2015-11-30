FROM java:openjdk-8-jdk
EXPOSE 8081
COPY target/weather-service.jar /home/
ENTRYPOINT ["java", "-jar", "/home/weather-service.jar"]
