FROM openjdk:11
Expose 8080
ADD ./target/chessopening-api.jar chessopening-api.jar
ENTRYPOINT ["java", "-jar", "/chessopening-api.jar"]