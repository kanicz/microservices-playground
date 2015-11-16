FROM java:openjdk-8-jdk
EXPOSE 9000
COPY target/config-server.jar /home/
ENTRYPOINT ["java", "-jar", "/home/config-server.jar"]
