package com.study.springboot.load;

import org.apache.logging.slf4j.SLF4JLogger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootLoadDemoApplication {

    public static void main(String[] args) {
        // 加载SLF4JLogger.class
        System.out.println("SLF4JLogger.class.getClassLoader()" + SLF4JLogger.class.getClassLoader());
        SpringApplication.run(SpringbootLoadDemoApplication.class, args);
        System.out.println("SpringbootLoadDemoApplication execute successful ");

    }

}
