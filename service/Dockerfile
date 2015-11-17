FROM java:openjdk-8-jdk
EXPOSE 8081
COPY target/service.jar /home/
ENTRYPOINT ["java", "-jar", "/home/service.jar"]
