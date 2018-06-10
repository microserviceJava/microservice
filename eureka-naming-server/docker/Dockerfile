FROM java:8

COPY target/eureka-naming-server.jar app.jar
RUN bash -c 'touch/app.jar'
EXPOSE 8010
ENTRYPOINT ["java","-jar","app.jar"]		