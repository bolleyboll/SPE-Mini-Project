FROM openjdk:11
COPY ./target/speMiniProj-1.0-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "speMiniProj-1.0-jar-with-dependencies.jar"]