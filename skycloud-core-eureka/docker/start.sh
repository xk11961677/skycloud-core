#!/bin/bash

#从阿里云下载镜像
#停止运行中镜像,删除运行的镜像
#启动新的镜像

ms_project_name=ms-eureka

project_version=1.0.0

registry=registry.cn-hangzhou.aliyuncs.com/zyk

run_id='docker ps $ms_project_name'

image='docker ps -a | grep $ms_project_name'

if [ run_id != ''  ]; then
    echo ' run_id stop '
    docker stop $ms_project_name
fi;

if [ image != '' ]; then
    echo ' image rm '
    docker rm $ms_project_name
fi;


docker run --name $ms_project_name -d -p 8761:8761 -e TZ='Asia/Shanghai' -v /usr/share/zoneinfo/Asia/Shanghai:/etc/localtime $registry/$ms_project_name:$project_version