FROM bellsoft/liberica-openjdk-alpine:11
LABEL AUTHOR="Giancarlo A. Chiappe Aguilar"
COPY . /src
WORKDIR /src
RUN ./mvnw compile package
WORKDIR /
RUN mkdir /app/
RUN cp /src/target/*.jar /app/app.jar
RUN rm -rf /src
ENV ARANGO_HOST=10.1.0.101
ENV ARANGO_PORT=8529
ENV ARANGO_DATABASE=it_invoices
ENV ARANGO_USER=root
ENV ARANGO_PW=123456
ENV SPRINGBOOT_PORT=8080
EXPOSE $SPRINGBOOT_PORT
# COPY target/insidetrack-test*.jar /app/app.jar
CMD java -jar -Dserver.port=$SPRINGBOOT_PORT \
    -Darangodb.host=$ARANGO_HOST \
    -Darangodb.port=$ARANGO_PORT \
    -Darangodb.user=$ARANGO_USER \
    -Darangodb.password=$ARANGO_PW \
    -Darangodb.database=$ARANGO_DATABASE
    /app/app.jar
