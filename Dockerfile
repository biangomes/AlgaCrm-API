FROM openjdk

WORKDIR /app

COPY artifacts/algacrm_api_jar /app/algacrmapi.jar

ENTRYPOINT ["java", "-jar", "spring-app.jar"]