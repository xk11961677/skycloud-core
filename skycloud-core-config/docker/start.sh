#!/bin/bash

ms_project_name=ms-config

project_name=skycloud-core-config

project_version=1.0.0-SNAPSHOT

docker stop $ms_project_name
sleep 5;

docker rm $ms_project_name
sleep 3;

docker rmi -f registry.cn-hangzhou.aliyuncs.com/zyk/$project_name:$project_version

sudo docker login --username=username --password=password registry.cn-hangzhou.aliyuncs.com


docker run --name $ms_project_name -d -p 8888:8888 -e BOOT_ARGS='-Dspring.cloud.config.server.native.searchLocations=/www/data/cloud/config' -e TZ='Asia/Shanghai' -v /usr/share/zoneinfo/Asia/Shanghai:/etc/localtime -v /www/data/cloud/config:/www/data/cloud/config $registry/$project_name:$project_version

docker rmi $(docker images | grep '<none>' |awk '{print $3}')

echo "start ...................................................................................."