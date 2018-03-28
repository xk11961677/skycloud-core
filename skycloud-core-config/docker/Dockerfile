FROM java:8

MAINTAINER sky

ENV BOOT_ARGS=""

ADD skycloud-core-config-1.0.0-SNAPSHOT.jar /home/ms-config.jar

WORKDIR /home

#ENTRYPOINT ["java", "-jar", "ms-config.jar"]

#CMD ["java","-jar", "ms-config.jar"]

CMD java -Djava.security.egd=file:/dev/./urandom ${BOOT_ARGS} -jar ms-config.jar

EXPOSE  8888