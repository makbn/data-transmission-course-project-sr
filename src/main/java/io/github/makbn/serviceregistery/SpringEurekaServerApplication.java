package io.github.makbn.serviceregistery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.eureka.EurekaHealthCheckHandler;
import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceRenewedEvent;

@EnableEurekaServer
@SpringBootApplication
public class SpringEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaServerApplication.class, args);


	}
}
