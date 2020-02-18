package org.nipu.po;

import org.nipu.po.order.clients.ProductSpecificationRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients(clients = ProductSpecificationRepository.class)
@EnableEurekaClient
@EnableCircuitBreaker
public class PoApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoApplication.class, args);
    }
}
