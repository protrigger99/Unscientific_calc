FROM openjdk:11
COPY ./target/unscientific_calc-1.0-SNAPSHOT-jar-with-dependencies.jar
./
WORKDIR ./
CMD ["java","-cp","unscietific_calc-1.0-SNAPSHOT-jar-with-dependencies.jar","org.example.Main"]