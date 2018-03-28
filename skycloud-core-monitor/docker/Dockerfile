FROM java:8

MAINTAINER sky

ENV BOOT_ARGS=""

ADD skycloud-core-monitor-1.0.0-SNAPSHOT.jar /home/ms-monitor.jar

WORKDIR /home

CMD java -Djava.security.egd=file:/dev/./urandom ${BOOT_ARGS} -jar ms-monitor.jar

EXPOSE  8788