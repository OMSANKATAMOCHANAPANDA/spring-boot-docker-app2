FROM openjdk:11

COPY target/spring-boot-docker-app.jar  /user/app/

WORKDIR /user/app/

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "spring-boot-docker-app.jar"]
