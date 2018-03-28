FROM java:8

MAINTAINER sky

ENV BOOT_ARGS=""

ADD skycloud-core-zipkin-1.0.0-SNAPSHOT.jar /home/ms-zipkin.jar

WORKDIR /home

CMD java -Djava.security.egd=file:/dev/./urandom ${BOOT_ARGS} -jar ms-zipkin.jar

EXPOSE  9411