FROM amazoncorretto:17-alpine-jdk
COPY target/config.jar config.jar
VOLUME /Users/esarygulov/Documents/IdeaProjects/e-commerce_app/cloud_config_service/src/main/resources/config/
ENTRYPOINT ["java","-jar","/config.jar"]