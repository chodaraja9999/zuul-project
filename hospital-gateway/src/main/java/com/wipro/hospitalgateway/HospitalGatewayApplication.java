package com.wipro.hospitalgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;

@SpringBootApplication
@EnableZuulProxy
public class HospitalGatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(HospitalGatewayApplication.class, args);
    }

}
