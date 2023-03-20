FROM openjdk:11
COPY "./target/SPE_Mini_Project-1.0-SNAPSHOT.jar" "home/SPE_Mini_Project-1.0-SNAPSHOT.jar"
RUN touch calculator.log
CMD ["java", "-jar", "SPE_Mini_Project-1.0-SNAPSHOT.jar"]
