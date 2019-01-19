package com.springbootdocker.producer;

import com.springbootdocker.producer.event.MessageSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication//(basePackageClasses=ProducerController.class)
//@ComponentScan(basePackages="com.springbootdocker.producer.*")
@EnableBinding(MessageSource.class)
public class ProducerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProducerApplication.class, args);
	}

}

