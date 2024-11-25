package com.example.producer.service;


import com.example.producer.model.Message;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class ProducerService {

    private static final Logger logger = LogManager.getLogger(ProducerService.class);
    private final KafkaTemplate<String, Message> kafkaTemplate;
    private final String topic;

    public ProducerService(KafkaTemplate<String, Message> kafkaTemplate,
                                @Value("${spring.kafka.topic.default}") String topic) {
        this.kafkaTemplate = kafkaTemplate;
        this.topic = topic;
    }

    public void sendMessage(Message message) {
        logger.info("sending message: {}", message);
        kafkaTemplate.send(topic, message);
    }
}
