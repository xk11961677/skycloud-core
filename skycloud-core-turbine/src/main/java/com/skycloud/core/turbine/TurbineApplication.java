package com.skycloud.core.turbine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author sky
 */
@SpringBootApplication
@EnableHystrixDashboard
@EnableTurbine
public class TurbineApplication {
	
	/**
	 * 入口
	 * @param args 参数
	 */
	public static void main(String[] args){
		SpringApplication.run(TurbineApplication.class, args);
	}

}
