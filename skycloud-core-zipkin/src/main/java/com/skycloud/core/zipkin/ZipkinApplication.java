package com.skycloud.core.zipkin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import zipkin.server.EnableZipkinServer;


/**
 * @author sky
 *
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZipkinServer
public class ZipkinApplication {
	
	/**
	 * 入口
	 * @param args 参数
	 */
	public static void main(String[] args){
		SpringApplication.run(ZipkinApplication.class, args);
	}

}
