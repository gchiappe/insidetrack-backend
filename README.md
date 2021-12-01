## InsideTrack's Test Backend

Part of InsideTrack's Test, implemented by Giancarlo Chiappe <gchiappe@gmail.com>.

### Building

Standalone build using JDK 11, local development server must be started using
maven (`mvn springboot:run`), set the port using the `-Dserver.port=` command line argument.

For deployment and full stack testing see the orchestrator repository:
https://github.com/gchiappe/insidetrack-test

## Involved Technologies

- Java 11
- Springboot
- ArangoDB
- GraphQL