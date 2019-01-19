package com.springbootdocker.consumer;

import com.springbootdocker.consumer.dto.MessageDTO;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
@SpringBootApplication
public class ConsumerApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerApplication.class, args);
	}

	@StreamListener(target = Sink.INPUT)
	public void processMessages(MessageDTO messageDTO) {
		System.out.println("Received Message from Producer " + messageDTO.getMessage());
	}
}

