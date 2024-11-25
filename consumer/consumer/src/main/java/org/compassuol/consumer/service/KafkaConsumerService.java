package org.compassuol.consumer.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class KafkaConsumerService {

    private static final Logger logger = LogManager.getLogger(KafkaConsumerService.class);

    @KafkaListener(topics = "my-topic", groupId = "my-group")
    public void consumeMessage(String message) {
        logger.info("Received message: {}", message);

        try {
            logger.info("Processing message: {}", message);
            Thread.sleep(1000);
            logger.info("Message processed successfully: {}", message);
        } catch (Exception e) {
            logger.error("Error processing message: {} - {}", message, e.getMessage());
        }
    }
}