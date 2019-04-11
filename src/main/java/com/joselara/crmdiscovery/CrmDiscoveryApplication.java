package com.joselara.crmdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@EnableEurekaServer
public class CrmDiscoveryApplication {

    public static void main(String[] args) {
        SpringApplication.run(CrmDiscoveryApplication.class, args);
    }

}
