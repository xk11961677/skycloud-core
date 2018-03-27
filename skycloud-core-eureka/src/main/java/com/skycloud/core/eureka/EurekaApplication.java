package com.skycloud.core.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server
 *
 * @author sky
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication {

    /**
     * 入口
     *
     * @param args 参数
     */
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class, args);
    }

}
