FROM bellsoft/liberica-openjdk-alpine:11
# TODO: ADD BUILDING OF THE APP -- mvn clean compile package
ENV SPRINGBOOT_PORT=8080
COPY target/insidetrack-test*.jar /app/app.jar
CMD java -jar -Dserver.port=$SPRINGBOOT_PORT /app/app.jar