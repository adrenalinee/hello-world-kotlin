FROM docker.io/eclipse-temurin:17.0.7_7-jdk-jammy

ENV TZ=Asia/Seoul
RUN ln -snf /usr/share/zoneinfo/\$TZ /etc/localtime && echo \$TZ > /etc/timezone

RUN mkdir /hello-world-kotlin
WORKDIR /hello-world-kotlin
COPY build/libs/hello-world-kotlin.jar ./hello-world-kotlin.jar

ENTRYPOINT ["java", "-jar", "hello-world-kotlin.jar"]
