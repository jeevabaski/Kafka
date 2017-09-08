package com.lrn.kafka;

import org.springframework.kafka.annotation.KafkaListener;

public class KafkaConsumer {

    @KafkaListener
    public void consume(String consumerRecord){

    }
}
