FROM java:8
VOLUME /tmp
EXPOSE 10555
ADD target/TrainDetails-0.0.1-SNAPSHOT.jar trainDetails.jar
ENTRYPOINT ["java", "-jar", "trainDetails.jar"]
