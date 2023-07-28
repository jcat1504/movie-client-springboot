# Use the official OpenJDK image as the base image
FROM openjdk:17-jdk

# Copy the JAR file into the container
COPY target/movies-0.0.1-SNAPSHOT.jar movie-client.jar

# Set the entry point to run the JAR file
ENTRYPOINT ["java", "-jar", "movie-client.jar"]

