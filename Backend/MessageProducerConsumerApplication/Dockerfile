FROM java:8
VOLUME /tmp
ADD target/MessageProducerConsumerApplication-0.0.1-SNAPSHOT.jar publishmessages.jar
ENTRYPOINT ["java", "-jar", "publishmessages.jar"]