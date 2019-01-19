package com.springbootdocker.producer.event;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

public interface MessageSource {

    @Output("myChannel")
    MessageChannel publishMessage();
}

