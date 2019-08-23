package com.infy.passfail.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import java.io.IOException;

@Service
public class PassfailKafkaConsumer {

    private final Logger log = LoggerFactory.getLogger(PassfailKafkaConsumer.class);
    private static final String TOPIC = "topic_passfail";

    @KafkaListener(topics = "topic_passfail", groupId = "group_id")
    public void consume(String message) throws IOException {
        log.info("Consumed message in {} : {}", TOPIC, message);
    }
}
