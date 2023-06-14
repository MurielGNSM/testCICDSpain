# Use an official Java runtime as a parent image:
FROM amazoncorretto:17

# Set the current working directory inside the container
WORKDIR /app

# Copy the application's .jar file into the container
COPY target/demo-0.0.1-SNAPSHOT.jar /app/app.jar

# Make port 8080 available to the world outside this container
EXPOSE 80

# Run the application when the container launches
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
