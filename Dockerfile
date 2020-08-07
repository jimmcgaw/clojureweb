FROM openjdk:8-alpine

COPY target/uberjar/clojureweb.jar /clojureweb/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/clojureweb/app.jar"]
