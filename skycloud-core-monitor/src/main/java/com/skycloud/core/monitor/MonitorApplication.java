package com.skycloud.core.monitor;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Configuration;

/**
 * spring admin ui
 * @author sky
 *
 */
@Configuration
@EnableDiscoveryClient
@EnableAdminServer
@SpringBootApplication
public class MonitorApplication {
	
	/**
	 * 入口
	 * @param args 参数
	 */
	public static void main(String[] args){
		SpringApplication.run(MonitorApplication.class, args);
	}

}
