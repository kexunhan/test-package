FROM openjdk

MAINTAINER kxhan
COPY ./target/*.jar ~/app.jar
CMD ["--server.port=8888"]
EXPOSE 8888
ENTRYPOINT ["java","-jar","~/app.jar"]



