FROM openjdk:8
EXPOSE 8080
ADD target/all-in-one.jar all-in-one.jar
ENTRYPOINT ["java","-jar","/all-in-one.jar"]