## InsideTrack's Test Backend

Part of InsideTrack's Test, implemented by Giancarlo Chiappe <gchiappe@gmail.com>.

### Local Development Build

- Ensure you have Java 11 SDK (JDK 11) on your path.
- Run through maven, database and environment must be set before this.

`mvn compile spring-boot:run`

- Default HTTP port is 9000, change the port using the `-Dserver.port=` command line argument.
- GraphQL query and mutation resolvers are mapped to `/graphql`.
- Altair GraphQL UI is mapped to `/altair`.

### Building

Build the Docker image using standard docker image build commands:

`docker build -t itt-java-backend .`

Then run it:

`docker run --rm itt-java-backend`

(database and environment must be set before this running in standalone docker container)

For deployment and full stack testing see the orchestrator repository:
https://github.com/gchiappe/insidetrack-test

## Involved Technologies

- Java 11
- Springboot
- ArangoDB
- GraphQL