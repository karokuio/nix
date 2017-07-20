FROM openjdk:8-alpine

COPY nix.jar .
COPY wtfc.sh .

ENTRYPOINT ["./wtfc.sh", "-T", "40", "nc -z rabbit 5672", "&&", "java", "-jar", "nix.jar"]
