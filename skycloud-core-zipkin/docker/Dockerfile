FROM java:8

MAINTAINER sky

ENV BOOT_ARGS=""

ADD skycloud-core-ziplin-1.0.0-SNAPSHOT.jar /home/ms-ziplin.jar

WORKDIR /home

CMD java -Djava.security.egd=file:/dev/./urandom ${BOOT_ARGS} -jar ms-ziplin.jar

EXPOSE  9411