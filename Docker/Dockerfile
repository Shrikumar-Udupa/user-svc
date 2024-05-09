FROM eclipse-temurin:17
RUN mkdir /opt/app
COPY user-service-0.0.1-SNAPSHOT.jar /opt/app
WORKDIR /opt/app
CMD ["java", "-jar", "user-service-0.0.1-SNAPSHOT.jar"]