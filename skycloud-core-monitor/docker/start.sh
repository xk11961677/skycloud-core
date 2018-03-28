#!/bin/bash

ms_project_name=ms-monitor

project_name=skycloud-core-monitor

project_version=1.0.0-SNAPSHOT

docker stop $ms_project_name
sleep 5;

docker rm $ms_project_name
sleep 3;

docker rmi -f registry.cn-hangzhou.aliyuncs.com/zyk/$project_name:$project_version

sudo docker login --username=username --password=password registry.cn-hangzhou.aliyuncs.com

docker run --name $ms_project_name -d -p 8788:8788 -e TZ='Asia/Shanghai' -v /usr/share/zoneinfo/Asia/Shanghai:/etc/localtime $registry/$project_name:$project_version

docker rmi $(docker images | grep '<none>' |awk '{print $3}')

echo "start ...................................................................................."