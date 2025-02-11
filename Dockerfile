FROM maven:3.9.9-eclipse-temurin-17 AS build
WORKDIR /app
COPY pom.xml ./
RUN mvn dependency:go-offline

COPY . .


RUN mvn clean test && mvn clean package -DskipTests=false


FROM eclipse-temurin:17-jdk

WORKDIR /app


COPY --from=build /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]