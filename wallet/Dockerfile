FROM maven:3.8.1-jdk-11 AS MAVEN_BUILD


COPY pom.xml /build/
COPY src /build/src/

WORKDIR /build/
RUN mvn package

FROM openjdk:jdk-oraclelinux7

WORKDIR /app

COPY --from=MAVEN_BUILD /build/target/clientWallet-0.0.1-SNAPSHOT.jar /app/

ENTRYPOINT ["java", "-jar", "clientWallet-0.0.1-SNAPSHOT.jar"]