FROM java:8
ADD /target/productservice.jar product_service.jar
EXPOSE 8083
ENTRYPOINT ["java","-jar","product_service.jar"]
