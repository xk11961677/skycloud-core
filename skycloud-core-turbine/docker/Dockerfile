FROM java:8

MAINTAINER sky

ENV BOOT_ARGS=""

ADD wait-for-it.sh /home/wait-for-it.sh

RUN chmod +x /home/wait-for-it.sh

ADD skycloud-core-turbine-1.0.0-SNAPSHOT.jar /home/ms-turbine.jar

WORKDIR /home

CMD java -Djava.security.egd=file:/dev/./urandom ${BOOT_ARGS} -jar ms-turbine.jar

EXPOSE  8778