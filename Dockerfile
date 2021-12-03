FROM bellsoft/liberica-openjdk-alpine:11
LABEL AUTHOR="Giancarlo A. Chiappe Aguilar"
COPY . /src
WORKDIR /src
RUN ./mvnw compile package
WORKDIR /
RUN mkdir /app/
RUN cp /src/target/insidetrack-test*.jar /app/app.jar
RUN rm -rf /src
ENV SPRINGBOOT_PORT=8080
EXPOSE $SPRINGBOOT_PORT
# COPY target/insidetrack-test*.jar /app/app.jar
CMD java -jar -Dserver.port=$SPRINGBOOT_PORT /app/app.jar