FROM eclipse-temurin:17
COPY build/libs/user-service-0.0.1-SNAPSHOT.jar /opt/app/
WORKDIR /opt/app
EXPOSE 8090
CMD ["java", "-jar", "user-service-0.0.1-SNAPSHOT.jar"]