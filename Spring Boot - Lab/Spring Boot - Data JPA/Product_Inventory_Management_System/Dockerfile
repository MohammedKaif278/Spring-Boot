# 1️⃣ Base image (Java 21 runtime)
FROM eclipse-temurin:21-jdk-alpine

# 2️⃣ Set working directory inside container
WORKDIR /app

# 3️⃣ Copy JAR file from target folder to container
COPY target/productinventory.jar app.jar

# 4️⃣ Expose the port your app runs on
EXPOSE 1111

# 5️⃣ Run the JAR
ENTRYPOINT ["java", "-jar", "app.jar"]