package com.example.producer.controller;

import com.example.producer.model.Message;
import com.example.producer.service.ProducerService;
import lombok.RequiredArgsConstructor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/messages")
@RequiredArgsConstructor
public class MessageController {
    private static final Logger logger = LogManager.getLogger(MessageController.class);


    private final ProducerService producerService;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody Message message) {
        logger.info("Received request to send message: {}", message);
        try {
            producerService.sendMessage(message);
            logger.info("Message sent successfully: {}", message);
            return ResponseEntity.status(HttpStatus.CREATED).body("Message sent successfully!");
        } catch (Exception e) {
            logger.error("Error while sending message: {}", e.getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error sending message.");
        }
    }
}
