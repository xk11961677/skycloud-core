package com.skycloud.core.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 基本配置服务
 * 
 * @author sky
 *
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

	/**
	 * 入口
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(ConfigApplication.class, args);
	}
}
