ARG BASE_IMAGE
FROM $BASE_IMAGE as builder

WORKDIR /app
COPY . .
RUN ./gradlew clean build

FROM amazoncorretto:21-alpine3.20

COPY --from=builder /app/build/libs/*SNAPSHOT.jar /app/app.jar
WORKDIR /app

CMD ["java", "-jar", "./app.jar"]
