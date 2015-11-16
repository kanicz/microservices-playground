FROM java:openjdk-8-jdk
EXPOSE 8761
COPY target/webapp.jar /home/
ENTRYPOINT ["java", "-jar", "/home/webapp.jar"]
