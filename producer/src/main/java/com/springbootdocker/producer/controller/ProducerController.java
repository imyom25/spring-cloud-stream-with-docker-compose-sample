package com.springbootdocker.producer.controller;

import com.springbootdocker.producer.dto.MessageDTO;
import com.springbootdocker.producer.event.MessageSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/docker")
public class ProducerController {

    @Autowired
    private MessageSource messageSource;

    @RequestMapping(value = "/v1/send-message", consumes = MediaType.APPLICATION_JSON_VALUE, method = RequestMethod.POST)
    public String postMessageToQueue(@RequestBody MessageDTO messageDTO){

        messageSource.publishMessage().send(MessageBuilder.withPayload(messageDTO).build());
        return "message sent!!";
    }

}
