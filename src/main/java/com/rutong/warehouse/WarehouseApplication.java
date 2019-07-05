package com.rutong.warehouse;

import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author fy
 * @since 20190217
 */
@SpringBootApplication
@ComponentScan
@EnableEurekaClient
@EnableFeignClients
@MapperScan("com.rutong.warehouse.persistence")
public class WarehouseApplication {
    private static final Logger logger = LoggerFactory.getLogger(WarehouseApplication.class);

    public static void main(String[] args) throws Exception {
        SpringApplication application = new SpringApplication(WarehouseApplication.class);

        application.setBannerMode(Banner.Mode.CONSOLE);
        ApplicationContext ctx = application.run(args);
        logger.warn("启动倉庫管理系統...");

    }
}

