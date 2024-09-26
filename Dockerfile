FROM openjdk:11
COPY ./target/unscientific_calc-1.0.0-jar-with-dependencies.jar /app/unscientific_calc.jar
WORKDIR /app
CMD ["java", "-cp", "unscientific_calc.jar", "org.example.Main"]
