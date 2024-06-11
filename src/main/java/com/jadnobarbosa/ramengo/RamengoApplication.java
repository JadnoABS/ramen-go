package com.jadnobarbosa.ramengo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class RamengoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RamengoApplication.class, args);
	}

}
