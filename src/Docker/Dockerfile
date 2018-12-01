FROM openjdk:8
ADD sample-spring-boot.jar app.jar
RUN bash -c 'touch /app.jar'
ENTRYPOINT ["java", "-Djava.security.edg=file:/dev/./urandom", "-Dspring.profiles.active=container", "-jar", "app.jar"]