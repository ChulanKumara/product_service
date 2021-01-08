
FROM java:8 as builder
RUN mkdir -p app/source
COPY . /app/source
WORKDIR /app/source
RUN ./mvnw clean package -Dmaven.test.skip=true


FROM  builder as vm
COPY --from=builder /app/source/target/*.jar /app/product_service.jar
WORKDIR /app
EXPOSE 8083
ENTRYPOINT ["java","-jar","product_service.jar","--spring.profiles.active=${ENV}"]
