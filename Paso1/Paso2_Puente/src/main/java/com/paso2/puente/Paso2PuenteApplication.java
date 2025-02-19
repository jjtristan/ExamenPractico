package com.paso2.puente;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class Paso2PuenteApplication {

	public static void main(String[] args) {
		SpringApplication.run(Paso2PuenteApplication.class, args);
	}

}
