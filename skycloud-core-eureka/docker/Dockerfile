FROM java:7

MAINTAINER tx

ENV BOOT_ARGS=""

ADD com.zyk.cloud.eureka-1.0.0.jar /home

WORKDIR /home

#ENTRYPOINT ["java", "-jar", "com.zyk.cloud.eureka-1.0.0.jar"]

#CMD ["java","-jar", "com.zyk.cloud.eureka-1.0.0.jar"]

CMD java -Djava.security.egd=file:/dev/./urandom ${BOOT_ARGS} -jar com.zyk.cloud.eureka-1.0.0.jar

EXPOSE  8761